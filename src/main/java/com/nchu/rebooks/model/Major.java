package com.nchu.rebooks.model;

import org.springframework.data.relational.core.mapping.Table;

@Table("major")
public class Major extends BaseNamed{
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
