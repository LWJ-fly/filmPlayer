package online.wenmeng.controller;

import online.wenmeng.bean.Comments;
import online.wenmeng.bean.Movies;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    /**
     *查询所有电影
     * 参数：无
     *
     * 返回：电影所有信息
     */
    @RequestMapping("findAllMovies")
    public Map<String,Object> findAllMovies(){
        return movieService.findAllMovies();
    }

    /**
     *查询电影（按名称模糊查询）
     * 参数：name：电影名（模糊查询）
     *
     * 返回：相关名称的电影的所有信息
     */
    @RequestMapping("findMoviesById/{name}")
    public Map<String,Object> findMoviesById(@PathVariable("name") String name){
        return movieService.findMoviesById(name);

    }

    /**
     *查询电影详细信息
     * 参数：movieId：电影id
     *
     * 返回：对应movieId的电影信息
     */
    @RequestMapping("findMovieInfo/{movieId}")
    public Map<String,Object> findMovieInfo(@PathVariable("movieId") int movieId){
        return movieService.findMovieInfo(movieId);

    }

    /**
     *添加电影(唯一键movieId)后台生成
     * 参数：movies:电影对象/或者采用你那种每个字段都拼在地址后面那种
     *
     * 返回：返回所有电影信息（调用findAllMovies()）
     */
    @RequestMapping("addMovie/{movies}")
    public Map<String,Object> addMovie(@PathVariable("movies") Movies movies) throws ParameterErrorException {
        return movieService.addMovie(movies);

    }

    /**
     *删除电影
     * 参数：movieId:电影id
     *
     * 返回：返回所有电影信息（调用findAllMovies()）
     */
    @RequestMapping("deleteMovie/{movieId}")
    public Map<String,Object> deleteMovie(@PathVariable("movieId") int movieId) throws ParameterErrorException {
        return movieService.deleteMovie(movieId);

    }

    /**
     *电影评论数增加
     * 参数：movieId: 电影id
     *
     * 注意：此方法作用 评论个数+1，只在你后台调用
     */
    @RequestMapping("addMovieCommentCount/{movieId}")
    public Map<String,Object> addMovieCommentCount(@PathVariable("movieId") int movieId) throws ParameterErrorException {
        return movieService.addMovieCommentCount(movieId);

    }


    /**
     *创建电影评论
     * 参数：
     *     comments: comments对象/或者采用你那种每个字段都拼在地址后面那种
     *
     * 返回：当前电影所有评论（调用getMovieComment(movieId)，同时调用评论数增加的方法addMovieCommentCount(movieId)）
     */
    @RequestMapping("addMovieComment/{comments}")
    public Map<String,Object> addMovieComment(@PathVariable("comments") Comments comments) throws ParameterErrorException {
        return movieService.addMovieComment(comments);

    }



}
