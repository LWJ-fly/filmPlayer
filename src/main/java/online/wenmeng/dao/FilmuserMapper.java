package online.wenmeng.dao;

import online.wenmeng.bean.Filmuser;
import online.wenmeng.bean.FilmuserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmuserMapper {
    long countByExample(FilmuserExample example);

    int deleteByExample(FilmuserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Filmuser record);

    int insertSelective(Filmuser record);

    List<Filmuser> selectByExample(FilmuserExample example);

    Filmuser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Filmuser record, @Param("example") FilmuserExample example);

    int updateByExample(@Param("record") Filmuser record, @Param("example") FilmuserExample example);

    int updateByPrimaryKeySelective(Filmuser record);

    int updateByPrimaryKey(Filmuser record);
}