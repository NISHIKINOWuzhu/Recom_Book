package com.nchu.rebooks.model;

import org.springframework.data.annotation.Id;

public class BaseEntity {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
