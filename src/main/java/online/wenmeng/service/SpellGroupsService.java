package online.wenmeng.service;

import online.wenmeng.bean.Filmuser;
import online.wenmeng.bean.Spellgroups;
import online.wenmeng.bean.SpellgroupsExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.FilmuserMapper;
import online.wenmeng.dao.SpellgroupsMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.TransitionUtil;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/11 0:16
 * @Descrintion: 团约信息服务类
 * @version: 1.0
 */
@Service
public class SpellGroupsService {

    @Autowired
    private SpellgroupsMapper spellgroupsMapper;
    @Autowired
    private FilmuserMapper filmuserMapper;

    /**
     * 查看所有团约
     * @return
     */
    public Map<String, Object> getSpellGroup() {
        List<Spellgroups> spellgroups = spellgroupsMapper.selectByExample(new SpellgroupsExample());
        return MyUtils.getNewMap(Config.SUCCESS,null,null,spellgroups);
    }

    public Map<String, Object> addSpellGroup(Spellgroups spellGroup) throws ParameterErrorException {
        int spellGroupId;
        while (true){
            spellGroupId = MyUtils.getRandomNum();
            if (spellgroupsMapper.selectByPrimaryKey(spellGroupId)==null){
                break;
            }
        }
        spellGroup.setSpellgroupid(spellGroupId);
        int insert = spellgroupsMapper.insert(spellGroup);
        if (insert>0){
            return MyUtils.getNewMap(Config.SUCCESS,null,null,getSpellGroup());
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> deleteSpellGroup(int spellGroupId) throws ParameterErrorException {

        int i = spellgroupsMapper.deleteByPrimaryKey(spellGroupId);
        if (i>0){
            return  MyUtils.getNewMap(Config.SUCCESS,null,null,getSpellGroup());
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> getSpellGroupInfo(int spellGroupId) throws ParameterErrorException {
        Spellgroups spellgroups = spellgroupsMapper.selectByPrimaryKey(spellGroupId);
        if (spellgroups!=null){
            //获取到所有用户信息
            String[] userids = spellgroups.getUserid().split(Config.splitUsers);
            List<Filmuser> filmuserList = new ArrayList<>();
            for (String userid:userids) {
                Filmuser filmuser = filmuserMapper.selectByPrimaryKey(TransitionUtil.transitionType(userid, int.class));
                if (filmuser!=null){
                    filmuserList.add(filmuser);
                }
            }
            return  MyUtils.getNewMap(Config.SUCCESS,null,null,filmuserList);
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> addSpellGroupInfo(HttpSession session, int spellGroupId) throws ParameterErrorException {
        Map<String, Object> userInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        Integer userId = TransitionUtil.transitionType(userInfo.get(Config.Openid), int.class);
        Spellgroups spellgroups = spellgroupsMapper.selectByPrimaryKey(spellGroupId);
        if (spellgroups!=null){
            String userIds = "";
            String[] userids = spellgroups.getUserid().split(Config.splitUsers);
            for (int i = 0; i < userids.length; i++) {
                userIds+=userids[i]+Config.splitUsers;
            }
            userIds+=userids[userids.length-1];
            spellgroups.setUserid(userIds);
            spellgroups.setRealcount(spellgroups.getRealcount()+1);
            int i = spellgroupsMapper.updateByPrimaryKey(spellgroups);
            if (i>0){
                return  MyUtils.getNewMap(Config.SUCCESS,null,null,spellgroups);
            }
        }
        throw new ParameterErrorException();
    }
}
