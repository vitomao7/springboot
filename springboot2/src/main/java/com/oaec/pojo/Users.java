package com.oaec.pojo;

public class Users {
    private Integer userId;

    private Integer cartid;

    private String userAccount;

    private String userPwd;

    private String userEmail;

    private String userAlive;

    private String userLasttime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAlive() {
        return userAlive;
    }

    public void setUserAlive(String userAlive) {
        this.userAlive = userAlive == null ? null : userAlive.trim();
    }

    public String getUserLasttime() {
        return userLasttime;
    }

    public void setUserLasttime(String userLasttime) {
        this.userLasttime = userLasttime == null ? null : userLasttime.trim();
    }
}