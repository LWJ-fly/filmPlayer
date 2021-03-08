package online.wenmeng.dao;

import online.wenmeng.bean.Spellgroups;
import online.wenmeng.bean.SpellgroupsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpellgroupsMapper {
    long countByExample(SpellgroupsExample example);

    int deleteByExample(SpellgroupsExample example);

    int deleteByPrimaryKey(Integer spellgroupid);

    int insert(Spellgroups record);

    int insertSelective(Spellgroups record);

    List<Spellgroups> selectByExample(SpellgroupsExample example);

    Spellgroups selectByPrimaryKey(Integer spellgroupid);

    int updateByExampleSelective(@Param("record") Spellgroups record, @Param("example") SpellgroupsExample example);

    int updateByExample(@Param("record") Spellgroups record, @Param("example") SpellgroupsExample example);

    int updateByPrimaryKeySelective(Spellgroups record);

    int updateByPrimaryKey(Spellgroups record);
}