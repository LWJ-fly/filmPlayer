package online.wenmeng.service;

import online.wenmeng.bean.Discussionitem;
import online.wenmeng.bean.DiscussionitemExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.DiscussionitemMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DiscussionitemService {

    @Autowired
    private DiscussionitemMapper discussionitemMapper;

    public Map<String, Object> getDiscussionInfo(int discussionId) {
        DiscussionitemExample discussionitemExample = new DiscussionitemExample();
        discussionitemExample.createCriteria().andDiscussionidEqualTo(discussionId);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,discussionitemMapper.selectByExample(discussionitemExample));
    }

    public Map<String, Object> addDiscussionCount(Discussionitem discussionitem) throws ParameterErrorException {
        int discussionitemId ;
        while (true){
            discussionitemId = MyUtils.getRandomNum();
            if (discussionitemMapper.selectByPrimaryKey(discussionitemId)==null){
                break;
            }
        }
        discussionitem.setItemid(discussionitemId);
        int insert = discussionitemMapper.insert(discussionitem);
        if (insert>0){
            //将评论中的评论数量+1
            new DiscussionService().addDiscussionCount(discussionitem.getDiscussionid());
            return getDiscussionInfo(discussionitem.getDiscussionid());
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> deleteDiscussionInfo(int discussionitemId) throws ParameterErrorException {
        Discussionitem discussionitem = discussionitemMapper.selectByPrimaryKey(discussionitemId);
        if (discussionitem!=null){
            int i = discussionitemMapper.deleteByPrimaryKey(discussionitemId);
            //评论数减一
            //将评论中的评论数量+1
            new DiscussionService().subDiscussionCount(discussionitem.getDiscussionid());
            return getDiscussionInfo(discussionitem.getDiscussionid());
        }
        throw new ParameterErrorException();
    }
}
