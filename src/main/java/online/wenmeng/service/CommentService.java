package online.wenmeng.service;

import online.wenmeng.bean.Comments;
import online.wenmeng.bean.CommentsExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CommentsMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentService {

    @Autowired
    private CommentsMapper commentsMapper;


    public Map<String, Object> getMovieComment(int movieId) {
        CommentsExample commentsExample = new CommentsExample();
        commentsExample.createCriteria().andMoveidEqualTo(movieId);
        List<Comments> comments = commentsMapper.selectByExample(commentsExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,comments);
    }

    public Map<String, Object> addMovieComment(Comments comments) throws ParameterErrorException {
        int commentId;
        while (true){
            commentId = MyUtils.getRandomNum();
            if (commentsMapper.selectByPrimaryKey(commentId)==null){
                break;
            }
        }
        comments.setCommentsid(commentId);
        int insert = commentsMapper.insert(comments);
        if (insert>0){
            return getMovieComment(comments.getMoveid());
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> setStars(int commentsId, int stars) throws ParameterErrorException {
        Comments comments = commentsMapper.selectByPrimaryKey(commentsId);
        if (comments!=null){
            comments.setFilmstars(stars);
            int i = commentsMapper.updateByPrimaryKey(comments);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,getMovieComment(comments.getMoveid()));
            }
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> deleteMovieComment(int movieId, int commentsId) throws ParameterErrorException {
        CommentsExample commentsExample = new CommentsExample();
        CommentsExample.Criteria criteria = commentsExample.createCriteria();
        criteria.andMoveidEqualTo(movieId);
        criteria.andCommentsidEqualTo(commentsId);
        int i = commentsMapper.deleteByExample(commentsExample);
        if (i>0){
            //通知电影将评论降1
            new MovieService().subMovieCommentCount(movieId);
            //返回所有的评论
            return getMovieComment(movieId);
        }
        throw new ParameterErrorException();
    }
}
