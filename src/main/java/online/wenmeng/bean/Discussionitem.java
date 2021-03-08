package online.wenmeng.bean;

import java.util.Date;

public class Discussionitem {
    private Integer itemid;

    private Integer userid;

    private Integer discussionid;

    private String content;

    private Date sendtime;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDiscussionid() {
        return discussionid;
    }

    public void setDiscussionid(Integer discussionid) {
        this.discussionid = discussionid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}