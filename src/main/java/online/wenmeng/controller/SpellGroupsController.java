package online.wenmeng.controller;

import online.wenmeng.bean.Spellgroups;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.SpellGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/11 0:14
 * @Descrintion: 团约信息管理类
 * @version: 1.0
 */

@RestController
public class SpellGroupsController extends BaseController {

    @Autowired
    private SpellGroupsService spellGroupsService;

    /**
     * 查看所有团约
     * 参数：无
     *
     * 返回：所有团约的信息
     */
    @RequestMapping("getSpellGroup")
    public Map<String,Object> getSpellGroup(){
        return spellGroupsService.getSpellGroup();
    }


    /**{需要登陆}
     *增加团约 (唯一键spellGroupsId)后台生成
     * 参数：spellGroups:spellGroups对象/或者采用你那种每个字段都拼在地址后面那种
     *
     * 返回：所有团约的信息（调用getSpellGroups()）
     */
    @RequestMapping("addSpellGroup")
    public Map<String,Object> addSpellGroup(HttpSession session, Spellgroups spellGroup) throws ParameterErrorException {
        return spellGroupsService.addSpellGroup(spellGroup);
    }

    /**
     *删除团约
     * 参数：spellGroupId:团约id
     *
     * 返回：所有团约的信息（调用getSpellGroups()）
     */
    @RequestMapping("deleteSpellGroup/{spellGroupId}")
    public Map<String,Object> deleteSpellGroup(@PathVariable("spellGroupId") int spellGroupId) throws ParameterErrorException {
        return spellGroupsService.deleteSpellGroup(spellGroupId);
    }

    /**
     *查看团约详细信息
     * 参数：spellGroupId:团约id
     *
     * 返回：此id下团约的所有信息（也就是几个人  跟你的查看拼车一样）
     */
    @RequestMapping("getSpellGroupInfo/{spellGroupId}")
    public Map<String,Object> getSpellGroupInfo(@PathVariable("spellGroupId") int spellGroupId) throws ParameterErrorException {
        return spellGroupsService.getSpellGroupInfo(spellGroupId);
    }

    /**{需要登陆}
     *申请加入团约
     * 参数：spellGroupId:团约id
     *     userId:用户id
     *
     * 返回：此id下团约的所有信息（调用getSpellGroupInfo(spellGroupId)）
     */
    @RequestMapping("addSpellGroupInfo/{spellGroupId}")
    public Map<String,Object> addSpellGroupInfo(HttpSession session,@PathVariable("spellGroupId") int spellGroupId) throws ParameterErrorException {
        return spellGroupsService.addSpellGroupInfo(session,spellGroupId);
    }

}
