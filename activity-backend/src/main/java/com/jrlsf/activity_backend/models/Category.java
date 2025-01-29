package com.jrlsf.activity_backend.models;

public class Category {
    private int id;
    private String name;



public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
public Category(){}
public int getid() {
    return id;
}
public void setid(int id) {
    this.id = id;
}
public String getname() {
    return name;
}
public void setname(String name) {
    this.name = name;
}

}
