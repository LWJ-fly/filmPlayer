package online.wenmeng.dao;

import online.wenmeng.bean.Discussionitem;
import online.wenmeng.bean.DiscussionitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussionitemMapper {
    long countByExample(DiscussionitemExample example);

    int deleteByExample(DiscussionitemExample example);

    int deleteByPrimaryKey(Integer itemid);

    int insert(Discussionitem record);

    int insertSelective(Discussionitem record);

    List<Discussionitem> selectByExample(DiscussionitemExample example);

    Discussionitem selectByPrimaryKey(Integer itemid);

    int updateByExampleSelective(@Param("record") Discussionitem record, @Param("example") DiscussionitemExample example);

    int updateByExample(@Param("record") Discussionitem record, @Param("example") DiscussionitemExample example);

    int updateByPrimaryKeySelective(Discussionitem record);

    int updateByPrimaryKey(Discussionitem record);
}