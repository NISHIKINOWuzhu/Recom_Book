package com.nchu.rebooks.model;

import org.springframework.data.relational.core.mapping.Table;

@Table("course")
public class Course extends BaseNamed{
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
