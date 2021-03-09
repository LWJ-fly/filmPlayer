package online.wenmeng.bean;

import java.util.Date;

public class Discussion {
    private Integer discussionid;

    private Integer mainuserid;

    private String filmtitle;

    private String content;

    private Integer filmcount;

    private Date starttime;

    public Integer getDiscussionid() {
        return discussionid;
    }

    public void setDiscussionid(Integer discussionid) {
        this.discussionid = discussionid;
    }

    public Integer getMainuserid() {
        return mainuserid;
    }

    public void setMainuserid(Integer mainuserid) {
        this.mainuserid = mainuserid;
    }

    public String getFilmtitle() {
        return filmtitle;
    }

    public void setFilmtitle(String filmtitle) {
        this.filmtitle = filmtitle == null ? null : filmtitle.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getFilmcount() {
        return filmcount;
    }

    public void setFilmcount(Integer filmcount) {
        this.filmcount = filmcount;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }
}