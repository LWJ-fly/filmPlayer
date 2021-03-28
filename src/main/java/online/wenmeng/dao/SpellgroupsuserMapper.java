package online.wenmeng.dao;

import online.wenmeng.bean.Spellgroupsuser;
import online.wenmeng.bean.SpellgroupsuserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SpellgroupsuserMapper {
    long countByExample(SpellgroupsuserExample example);

    int deleteByExample(SpellgroupsuserExample example);

    int deleteByPrimaryKey(Integer spellgroupid);

    int insert(Spellgroupsuser record);

    int insertSelective(Spellgroupsuser record);

    List<Spellgroupsuser> selectByExample(SpellgroupsuserExample example);

    Spellgroupsuser selectByPrimaryKey(Integer spellgroupid);

    int updateByExampleSelective(@Param("record") Spellgroupsuser record, @Param("example") SpellgroupsuserExample example);

    int updateByExample(@Param("record") Spellgroupsuser record, @Param("example") SpellgroupsuserExample example);

    int updateByPrimaryKeySelective(Spellgroupsuser record);

    int updateByPrimaryKey(Spellgroupsuser record);
}