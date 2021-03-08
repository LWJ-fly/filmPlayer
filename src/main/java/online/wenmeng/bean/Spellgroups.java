package online.wenmeng.bean;

import java.util.Date;

public class Spellgroups {
    private Integer spellgroupid;

    private Integer userid;

    private String filmtitle;

    private String content;

    private Integer filmcount;

    private Integer realcount;

    private Date starttime;

    private Date endtime;

    public Integer getSpellgroupid() {
        return spellgroupid;
    }

    public void setSpellgroupid(Integer spellgroupid) {
        this.spellgroupid = spellgroupid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getRealcount() {
        return realcount;
    }

    public void setRealcount(Integer realcount) {
        this.realcount = realcount;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}