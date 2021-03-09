package online.wenmeng.service;

import online.wenmeng.bean.Comments;
import online.wenmeng.bean.Movies;
import online.wenmeng.bean.MoviesExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.MoviesMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    @Autowired
    private MoviesMapper moviesMapper;

    public Map<String, Object> dddddd() {
        return null;
    }

    public Map<String, Object> findAllMovies() {
        MoviesExample moviesExample  = new MoviesExample();
        List<Movies> movies = moviesMapper.selectByExample(moviesExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,movies);
    }

    public Map<String, Object> findMoviesById(String name) {
        MoviesExample moviesExample  = new MoviesExample();
        moviesExample.createCriteria().andMovenameLike(name);
        List<Movies> movies = moviesMapper.selectByExample(moviesExample);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,movies);
    }

    public Map<String, Object> findMovieInfo(int movieId) {
        return MyUtils.getNewMap(Config.SUCCESS,null,null,moviesMapper.selectByPrimaryKey(movieId));
    }

    public Map<String, Object> addMovie(Movies movies) throws ParameterErrorException {
        //生成ID
        int movieId = 0;
        while (true){
            movieId = MyUtils.getRandomNum();
            if (moviesMapper.selectByPrimaryKey(movieId)==null){
                break;
            }
        }
        movies.setMoveid(movieId);
        int insert = moviesMapper.insert(movies);
        if (insert>0){
            return findAllMovies();
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> deleteMovie(int movieId) throws ParameterErrorException {
        int i = moviesMapper.deleteByPrimaryKey(movieId);
        if (i>0){
            return findAllMovies();
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> addMovieCommentCount(int movieId) throws ParameterErrorException {
        Movies movies = moviesMapper.selectByPrimaryKey(movieId);
        if (movies!=null){
            movies.setCommentcounts(movies.getCommentcounts()+1);
            int i = moviesMapper.updateByPrimaryKey(movies);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,movies);
            }
        }
        throw new ParameterErrorException();
    }

    /**
     * 将电影中的评论减一
     * @param movieId 电影的ID
     * @return
     * @throws ParameterErrorException
     */
    public Map<String, Object> subMovieCommentCount(int movieId) throws ParameterErrorException {
        Movies movies = moviesMapper.selectByPrimaryKey(movieId);
        if (movies!=null){
            movies.setCommentcounts(movies.getCommentcounts()>0?movies.getCommentcounts()-1:0);
            int i = moviesMapper.updateByPrimaryKey(movies);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,movies);
            }
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> addMovieComment(Comments comments) throws ParameterErrorException {
        Integer moveid = comments.getMoveid();
        //自己的电影评论数量+1
        addMovieCommentCount(moveid);
        //通知评论增加
        return new CommentService().addMovieComment(comments);
    }



}
