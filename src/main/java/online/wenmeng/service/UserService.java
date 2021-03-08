package online.wenmeng.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import online.wenmeng.bean.Filmuser;
import online.wenmeng.config.Config;
import online.wenmeng.dao.FilmuserMapper;
import online.wenmeng.exception.ServerException;
import online.wenmeng.utils.HttpsRequest;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.TransitionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/19 0:16
 * @Descrintion: 用户登录使用的参数
 * @version: 1.0
 */
@Service
public class UserService {

    @Autowired
    private FilmuserMapper filmuserMapper;

    public Map<String,Object> login(HttpSession session, String code) throws ServerException {
        if (code.length()==32){
            String request = HttpsRequest.httpsRequest("https://wenmeng.online/api/changeUserInfo/123456/"+ code, "GET", null);
            JSONObject json = JSON.parseObject(request);
            String state = json.getString(Config.STATE);
            //获取登录信息成功
            if (state!=null&&state.equals(Config.SUCCESS)){
                JSONObject qqInfo = json.getJSONObject(Config.DATA);
                Integer openid = qqInfo.getObject("openid", Integer.class);
                if (openid!=null){
                    Filmuser filmuser = filmuserMapper.selectByPrimaryKey(openid);
                    if (filmuser==null){//第一次登录
                        filmuser = new Filmuser(openid,qqInfo.getString("nickname"),qqInfo.getString("figureurl_qq_1"),qqInfo.getString("gender"),null,null);
                        if (filmuserMapper.insert(filmuser)<1){
                            throw new ServerException();
                        }
                    }
                    Map<String, Object> userLoginInfo = MyUtils.createUserLoginInfo(openid, qqInfo.getString("nickname"), qqInfo.getString("gender"), qqInfo.getString("figureurl_qq_1"));
                    session.setAttribute(Config.userInfoInRun,userLoginInfo);
                    return  MyUtils.getNewMap(Config.SUCCESS,Config.INDEX,null,userLoginInfo);
                }
                throw new ServerException();
            }
        }
        return MyUtils.getNewMap(Config.ERROR,Config.RETRY,"Parameter error",null);
    }


    /**
     * 退出登录
     * @return
     */
    public Map<String,Object> exit(HttpSession session){
        session.removeAttribute(Config.userInfoInRun);
        return MyUtils.getNewMap(Config.SUCCESS,Config.LOGIN,null,null);
    }


    public Map<String, Object> getUserInfo(int userId) {
        Filmuser filmuser = filmuserMapper.selectByPrimaryKey(userId);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,filmuser);
    }


    public Map<String, Object> getUserInfo(HttpSession session) {
        //获取session中的信息
        Map<String,Object> attribute = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        if (attribute!=null){
            Integer openId = TransitionUtil.transitionType(attribute.get(Config.Openid),int.class);
            Filmuser filmuser = filmuserMapper.selectByPrimaryKey(openId);
            return MyUtils.getNewMap(Config.SUCCESS,null,null,filmuser);
        }
        return MyUtils.getNewMap(Config.ERROR,Config.LOGIN,"No login information",null);
    }

    public Map<String, Object> changeUserInfo(HttpSession session, String gender, String qq, String phone) {
        //获取session中的信息
        Map<String,Object> attribute = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        if (attribute!=null){
            Integer openId = TransitionUtil.transitionType(attribute.get(Config.Openid),int.class);
            Filmuser filmuser = filmuserMapper.selectByPrimaryKey(openId);
            filmuser.setGerder(gender);
            filmuser.setQq(qq);
            filmuser.setPhone(phone);
            int i = filmuserMapper.updateByPrimaryKey(filmuser);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,filmuser);
            }
        }
        return MyUtils.getNewMap(Config.ERROR,Config.LOGIN,"No login information",null);
    }
}
