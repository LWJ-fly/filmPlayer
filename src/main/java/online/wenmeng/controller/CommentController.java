package online.wenmeng.controller;

import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class CommentController extends BaseController {

    @Autowired
    private CommentService commentService;

    /**
     *查询电影评论
     * 参数：movieId: 电影id
     *
     * 返回：当前电影所有评论
     *      comments 存储电影的评论信息
     */
    @RequestMapping("getMovieComment/{movieId}")
    public Map<String,Object> getMovieComment(@PathVariable("movieId") int movieId){
        return commentService.getMovieComment(movieId);
    }


    /**
     *修改评论点赞数量
     * 参数：commentsId:评论自身的id（唯一键那个，用来找到这个评论）
     *     stars:点赞个数
     *
     * 注意：你需要做的是把传过来stars直接覆盖原来的数据就行
     *
     * 返回：不用返回任何东西
     */
    @RequestMapping("setStars/{commentsId}/{stars}")
    public Map<String,Object> setStars(HttpSession session,@PathVariable("commentsId") int commentsId, @PathVariable("stars") int stars) throws ParameterErrorException {
        return commentService.setStars(commentsId,stars);
    }

    /**
     *删除电影评论
     * 参数：movieId:电影id(用于返回该电影的所有评论)
     *     commentsId:评论id（用于删除评论时后台查询使用）
     *
     * 返回：返回当前电影所有评论（调用getMovieComment(movieId)）
     */
    @RequestMapping("deleteMovieComment/{movieId}/{commentsId}")
    public Map<String,Object> deleteMovieComment(@PathVariable("movieId") int movieId,@PathVariable("commentsId") int commentsId) throws ParameterErrorException {
        return commentService.deleteMovieComment(movieId,commentsId);

    }

}
