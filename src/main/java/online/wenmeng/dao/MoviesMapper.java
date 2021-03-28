package online.wenmeng.dao;

import online.wenmeng.bean.Movies;
import online.wenmeng.bean.MoviesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MoviesMapper {
    long countByExample(MoviesExample example);

    int deleteByExample(MoviesExample example);

    int deleteByPrimaryKey(Integer moveid);

    int insert(Movies record);

    int insertSelective(Movies record);

    List<Movies> selectByExample(MoviesExample example);

    Movies selectByPrimaryKey(Integer moveid);

    int updateByExampleSelective(@Param("record") Movies record, @Param("example") MoviesExample example);

    int updateByExample(@Param("record") Movies record, @Param("example") MoviesExample example);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);
}