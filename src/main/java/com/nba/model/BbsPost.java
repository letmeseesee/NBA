package com.nba.model;

import java.io.Serializable;

/**
 * bbs_post
 * @author 
 */
public class BbsPost implements Serializable {
    private Integer pid;

    private Integer tid;

    private Integer uid;

    private Integer isfirst;

    private Integer createDate;

    private String message;

    private Integer quotepid;

    private String messageFmt;

    private String uname;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getIsfirst() {
        return isfirst;
    }

    public void setIsfirst(Integer isfirst) {
        this.isfirst = isfirst;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getQuotepid() {
        return quotepid;
    }

    public void setQuotepid(Integer quotepid) {
        this.quotepid = quotepid;
    }

    public String getMessageFmt() {
        return messageFmt;
    }

    public void setMessageFmt(String messageFmt) {
        this.messageFmt = messageFmt;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
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
        BbsPost other = (BbsPost) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getIsfirst() == null ? other.getIsfirst() == null : this.getIsfirst().equals(other.getIsfirst()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getQuotepid() == null ? other.getQuotepid() == null : this.getQuotepid().equals(other.getQuotepid()))
            && (this.getMessageFmt() == null ? other.getMessageFmt() == null : this.getMessageFmt().equals(other.getMessageFmt()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getIsfirst() == null) ? 0 : getIsfirst().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getQuotepid() == null) ? 0 : getQuotepid().hashCode());
        result = prime * result + ((getMessageFmt() == null) ? 0 : getMessageFmt().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", tid=").append(tid);
        sb.append(", uid=").append(uid);
        sb.append(", isfirst=").append(isfirst);
        sb.append(", createDate=").append(createDate);
        sb.append(", message=").append(message);
        sb.append(", quotepid=").append(quotepid);
        sb.append(", messageFmt=").append(messageFmt);
        sb.append(", uname=").append(uname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}