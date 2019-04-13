package com.nba.model;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户编号
     */
    private Integer uid;

    /**
     * 是否管理员
     */
    private Integer isadmin;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 发帖数
     */
    private Integer threads;

    /**
     * 回帖数
     */
    private Integer posts;

    /**
     * 积分
     */
    private Integer credits;

    /**
     * 金币
     */
    private Integer golds;

    /**
     * 创建时间
     */
    private Integer createDate;

    /**
     * 登录时间
     */
    private Integer loginDate;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getGolds() {
        return golds;
    }

    public void setGolds(Integer golds) {
        this.golds = golds;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Integer loginDate) {
        this.loginDate = loginDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getIsadmin() == null ? other.getIsadmin() == null : this.getIsadmin().equals(other.getIsadmin()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getThreads() == null ? other.getThreads() == null : this.getThreads().equals(other.getThreads()))
            && (this.getPosts() == null ? other.getPosts() == null : this.getPosts().equals(other.getPosts()))
            && (this.getCredits() == null ? other.getCredits() == null : this.getCredits().equals(other.getCredits()))
            && (this.getGolds() == null ? other.getGolds() == null : this.getGolds().equals(other.getGolds()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getIsadmin() == null) ? 0 : getIsadmin().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getThreads() == null) ? 0 : getThreads().hashCode());
        result = prime * result + ((getPosts() == null) ? 0 : getPosts().hashCode());
        result = prime * result + ((getCredits() == null) ? 0 : getCredits().hashCode());
        result = prime * result + ((getGolds() == null) ? 0 : getGolds().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", email=").append(email);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", threads=").append(threads);
        sb.append(", posts=").append(posts);
        sb.append(", credits=").append(credits);
        sb.append(", golds=").append(golds);
        sb.append(", createDate=").append(createDate);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}