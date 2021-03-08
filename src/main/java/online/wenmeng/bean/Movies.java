package online.wenmeng.bean;

import java.util.Date;

public class Movies {
    private Integer moveid;

    private String movename;

    private String moveavatar;

    private String startdata;

    private Date filmtime;

    private Double filmscore;

    private String director;

    private String actors;

    private String filmtype;

    private String filmdescribe;

    private String filmplace;

    private Integer commentcounts;

    public Integer getMoveid() {
        return moveid;
    }

    public void setMoveid(Integer moveid) {
        this.moveid = moveid;
    }

    public String getMovename() {
        return movename;
    }

    public void setMovename(String movename) {
        this.movename = movename == null ? null : movename.trim();
    }

    public String getMoveavatar() {
        return moveavatar;
    }

    public void setMoveavatar(String moveavatar) {
        this.moveavatar = moveavatar == null ? null : moveavatar.trim();
    }

    public String getStartdata() {
        return startdata;
    }

    public void setStartdata(String startdata) {
        this.startdata = startdata == null ? null : startdata.trim();
    }

    public Date getFilmtime() {
        return filmtime;
    }

    public void setFilmtime(Date filmtime) {
        this.filmtime = filmtime;
    }

    public Double getFilmscore() {
        return filmscore;
    }

    public void setFilmscore(Double filmscore) {
        this.filmscore = filmscore;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors == null ? null : actors.trim();
    }

    public String getFilmtype() {
        return filmtype;
    }

    public void setFilmtype(String filmtype) {
        this.filmtype = filmtype == null ? null : filmtype.trim();
    }

    public String getFilmdescribe() {
        return filmdescribe;
    }

    public void setFilmdescribe(String filmdescribe) {
        this.filmdescribe = filmdescribe == null ? null : filmdescribe.trim();
    }

    public String getFilmplace() {
        return filmplace;
    }

    public void setFilmplace(String filmplace) {
        this.filmplace = filmplace == null ? null : filmplace.trim();
    }

    public Integer getCommentcounts() {
        return commentcounts;
    }

    public void setCommentcounts(Integer commentcounts) {
        this.commentcounts = commentcounts;
    }
}