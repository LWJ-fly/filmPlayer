package online.wenmeng.bean;

import java.util.Date;

public class Comments {
    private Integer commentsid;

    private Integer userid;

    private Integer moveid;

    private String uesravatar;

    private String textvalue;

    private Double filmscore;

    private Integer filmstars;

    private Date commentstime;

    private String username;

    public Integer getCommentsid() {
        return commentsid;
    }

    public void setCommentsid(Integer commentsid) {
        this.commentsid = commentsid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMoveid() {
        return moveid;
    }

    public void setMoveid(Integer moveid) {
        this.moveid = moveid;
    }

    public String getUesravatar() {
        return uesravatar;
    }

    public void setUesravatar(String uesravatar) {
        this.uesravatar = uesravatar == null ? null : uesravatar.trim();
    }

    public String getTextvalue() {
        return textvalue;
    }

    public void setTextvalue(String textvalue) {
        this.textvalue = textvalue == null ? null : textvalue.trim();
    }

    public Double getFilmscore() {
        return filmscore;
    }

    public void setFilmscore(Double filmscore) {
        this.filmscore = filmscore;
    }

    public Integer getFilmstars() {
        return filmstars;
    }

    public void setFilmstars(Integer filmstars) {
        this.filmstars = filmstars;
    }

    public Date getCommentstime() {
        return commentstime;
    }

    public void setCommentstime(Date commentstime) {
        this.commentstime = commentstime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}