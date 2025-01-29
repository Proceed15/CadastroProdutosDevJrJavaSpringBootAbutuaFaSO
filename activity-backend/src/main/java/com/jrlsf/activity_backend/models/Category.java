package com.jrlsf.activity_backend.models;

public class Category {
    private int CatId;
    private String CatName;


public Category(int id, String Name){
    this.CatId = CatId;
    this.CatName = CatName;
}
public Category(){}
public int getCatId() {
    return CatId;
}
public void setCatId(int catId) {
    CatId = catId;
}
public String getCatName() {
    return CatName;
}
public void setCatName(String catName) {
    CatName = catName;
}

}
