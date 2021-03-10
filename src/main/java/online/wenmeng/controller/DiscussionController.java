package online.wenmeng.controller;

import online.wenmeng.bean.Discussion;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    /**
     * 评论数增加
     * 参数：dissionId: 讨论贴id
     *
     * 注意：此方法作用 评论个数+1，只在你后台调用
     */
    @RequestMapping("addDiscussionCount/{dissionId}")
    public Map<String,Object> addDiscussionCount(@PathVariable("dissionId") int dissionId) throws ParameterErrorException {
        return discussionService.addDiscussionCount(dissionId);
    }


    /**
     *查看所有讨论帖
     * 参数：无
     *
     * 返回：所有讨论贴信息
     */
    @RequestMapping("getDiscussion")
    public Map<String,Object> getDiscussion(){
        return discussionService.getDiscussion();
    }




    /**
     *增加讨论帖 （唯一键dissionId）后台生成
     * 参数：dission:讨论贴对象/或者采用你那种每个字段都拼在地址后面那种
     *
     * 返回：所有讨论贴信息（调用getDiscussion()）
     */
    @RequestMapping("addDiscussion/{discussion}")
    public Map<String,Object> addDiscussion(HttpSession session, @PathVariable("discussion") Discussion discussion) throws ParameterErrorException {
        return discussionService.addDiscussion(discussion);
    }




    /**
     *删除讨论帖
     * 参数：dissionId:讨论贴id
     *
     * 返回：所有讨论贴信息（调用getDiscussion()）
     */
    @RequestMapping("deleteDiscussion/{dissionId}")
    public Map<String,Object> deleteDiscussion(@PathVariable("dissionId") int dissionId) throws ParameterErrorException {
        return discussionService.deleteDiscussion(dissionId);
    }



}