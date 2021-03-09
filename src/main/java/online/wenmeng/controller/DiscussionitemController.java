package online.wenmeng.controller;

import online.wenmeng.bean.Discussionitem;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.DiscussionitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class DiscussionitemController {

    @Autowired
    private DiscussionitemService discussionitemService;


    /**
     *查看某一个讨论id下的所有回复
     * 参数：discussionId:讨论贴id
     *
     * 注意：这里的意思是我需要你返回一个讨论下的所有回复
     *
     * 返回：返回此讨论贴的所有用户评论
     */
    @RequestMapping("getDiscussionInfo/{discussionId}")
    public Map<String,Object> getDiscussionInfo(@PathVariable("discussionId") int discussionId){
        return discussionitemService.getDiscussionInfo(discussionId);
    }




    /**
     *增加某一个讨论贴的回复 (唯一键itemId)后台生成
     * 参数：discussionId: 讨论贴id
     *     discussionInfo: discussionInfo对象/或者采用你那种每个字段都拼在地址后面那种
     *
     * 返回：返回此id讨论贴的所有回复（调用getDiscussionInfo(discussionId)，同时调用评论增加addDiscussionCount(dissionId)）
     */
    @RequestMapping("addDiscussionInfo/{discussionitem}")
    public Map<String,Object> addDiscussionInfo(@PathVariable("discussionitem") Discussionitem discussionitem) throws ParameterErrorException {
        return discussionitemService.addDiscussionCount(discussionitem);
    }

    /**
     *删除某一个讨论贴的回复
     * 参数：dissionId:讨论贴id
     *     discussionId: 讨论贴中某个回复的id【【【【只用给我讨论帖的id 即可，后续的我都能获取到】】】】
     *
     * 返回：返回此id讨论贴的所有回复（调用getDiscussionInfo(dissionId)）
     */
    @RequestMapping("deleteDiscussionInfo/{discussionitemId}")
    public Map<String,Object> deleteDiscussionInfo(@PathVariable("discussionitem") int discussionitemId) throws ParameterErrorException {
        return discussionitemService.deleteDiscussionInfo(discussionitemId);
    }


}
