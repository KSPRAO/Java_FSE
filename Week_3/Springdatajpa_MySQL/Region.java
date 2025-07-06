package com.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Region {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Region{code='" + code + "', name='" + name + "'}";
    }
}
