package com.example.admin.bean;

import java.util.Date;

public class Daily {
    private Integer id;

    private String ordernum;

    private Date date;

    private String latintude;

    private String longtitude;

    private String username;

    private Integer servicetime;

    private Integer endtime;

    private String startlocation;

    private String endlocation;

    private String tel;

    private String pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLatintude() {
        return latintude;
    }

    public void setLatintude(String latintude) {
        this.latintude = latintude == null ? null : latintude.trim();
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude == null ? null : longtitude.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getServicetime() {
        return servicetime;
    }

    public void setServicetime(Integer servicetime) {
        this.servicetime = servicetime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public String getStartlocation() {
        return startlocation;
    }

    public void setStartlocation(String startlocation) {
        this.startlocation = startlocation == null ? null : startlocation.trim();
    }

    public String getEndlocation() {
        return endlocation;
    }

    public void setEndlocation(String endlocation) {
        this.endlocation = endlocation == null ? null : endlocation.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}