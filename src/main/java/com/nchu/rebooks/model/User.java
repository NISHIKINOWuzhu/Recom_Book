package com.nchu.rebooks.model;

import org.springframework.data.relational.core.mapping.Table;

@Table("user")
public class User extends BaseNamed{

    private String pwd;
    private String sex;
    private String email;
    private String tel;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
