package com.nchu.rebooks.model;

import org.springframework.data.relational.core.mapping.Table;

@Table("school")
public class School extends BaseNamed {
    private String address;
    private String tel;
    private String info;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
