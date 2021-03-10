package online.wenmeng.service;

import online.wenmeng.bean.Discussion;
import online.wenmeng.bean.DiscussionExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.DiscussionMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DiscussionService {
    
    @Autowired
    private DiscussionMapper discussionMapper;

    public Map<String, Object> addDiscussionCount(int dissionId) throws ParameterErrorException {
        Discussion discussion = discussionMapper.selectByPrimaryKey(dissionId);
        if (discussion!=null){
            discussion.setFilmcount(discussion.getFilmcount()+1);
            int i = discussionMapper.updateByPrimaryKey(discussion);
            if (i>1){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,discussion);
            }
        }
        throw new ParameterErrorException();
    }
    public Map<String, Object> subDiscussionCount(int dissionId) throws ParameterErrorException {
        Discussion discussion = discussionMapper.selectByPrimaryKey(dissionId);
        if (discussion!=null){
            discussion.setFilmcount(discussion.getFilmcount()>0?(discussion.getFilmcount()-1):0);
            int i = discussionMapper.updateByPrimaryKey(discussion);
            if (i>1){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,discussion);
            }
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> getDiscussion() {
        return MyUtils.getNewMap(Config.SUCCESS,null,null,discussionMapper.selectByExample(new DiscussionExample()));
    }

    public Map<String, Object> addDiscussion(Discussion discussion) throws ParameterErrorException {
        int discussionId ;
        while (true){
            discussionId = MyUtils.getRandomNum();
            if (discussionMapper.selectByPrimaryKey(discussionId)==null){
                break;
            }
        }
        discussion.setDiscussionid(discussionId);
        int insert = discussionMapper.insert(discussion);
        if (insert>0){
            return getDiscussion();
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> deleteDiscussion(int dissionId) throws ParameterErrorException {
        int i = discussionMapper.deleteByPrimaryKey(dissionId);
        if (i>0){
            return getDiscussion();
        }
        throw new ParameterErrorException();
    }
}
