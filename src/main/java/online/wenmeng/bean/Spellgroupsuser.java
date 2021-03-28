package online.wenmeng.bean;

import java.util.Date;

public class Spellgroupsuser {
    private Integer spellgroupid;

    private Integer userid;

    private String username;

    private String useravatar;

    private String gender;

    private Long qq;

    private Long phone;

    private Date jointime;

    private Integer isingroup;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseravatar() {
        return useravatar;
    }

    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar == null ? null : useravatar.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Integer getIsingroup() {
        return isingroup;
    }

    public void setIsingroup(Integer isingroup) {
        this.isingroup = isingroup;
    }
}