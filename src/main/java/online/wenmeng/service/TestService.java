package online.wenmeng.service;

import online.wenmeng.bean.Filmuser;
import online.wenmeng.config.Config;
import online.wenmeng.dao.FilmuserMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 测试用例
 */
@Service
public class TestService {

    @Autowired
    private FilmuserMapper filmuserMapper;

    /**
     * 测试登录
     *
     * @param session
     * @param id
     * @return
     */
    public Map<String, Object> testLogin(HttpSession session, int id) throws ParameterErrorException {
        //通过id查询出人
        Filmuser filmuser = filmuserMapper.selectByPrimaryKey(id);
        if (filmuser==null){
            throw new ParameterErrorException();
        }
        Map<String, Object> userLoginInfo = MyUtils.createUserLoginInfo(id, filmuser.getUsername(),filmuser.getGerder(),filmuser.getUseravatar());
        session.setAttribute(Config.userInfoInRun,userLoginInfo);
        return MyUtils.getNewMap(Config.SUCCESS,"index",filmuser,userLoginInfo);
    }
}
