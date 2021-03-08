package online.wenmeng.bean;

public class Filmuser {
    private Integer userid;

    private String username;

    private String useravatar;

    private String gerder;

    private String qq;

    private String phone;

    public Filmuser(Integer userid, String username, String useravatar, String gerder, String qq, String phone) {
        this.userid = userid;
        this.username = username;
        this.useravatar = useravatar;
        this.gerder = gerder;
        this.qq = qq;
        this.phone = phone;
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

    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder == null ? null : gerder.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}