package online.wenmeng.dao;

import online.wenmeng.bean.Discussion;
import online.wenmeng.bean.DiscussionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DiscussionMapper {
    long countByExample(DiscussionExample example);

    int deleteByExample(DiscussionExample example);

    int deleteByPrimaryKey(Integer discussionid);

    int insert(Discussion record);

    int insertSelective(Discussion record);

    List<Discussion> selectByExample(DiscussionExample example);

    Discussion selectByPrimaryKey(Integer discussionid);

    int updateByExampleSelective(@Param("record") Discussion record, @Param("example") DiscussionExample example);

    int updateByExample(@Param("record") Discussion record, @Param("example") DiscussionExample example);

    int updateByPrimaryKeySelective(Discussion record);

    int updateByPrimaryKey(Discussion record);
}