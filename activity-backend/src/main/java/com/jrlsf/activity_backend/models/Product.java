package com.jrlsf.activity_backend.models;

public class Product {
    //Atributos Objetos são contruídos a partir de classes
    private int id;
    private String name;
    private double price;
    //Métodos Públicos Get e Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
        //O this indica que é este atributo especificamente, meio redundante :\
    }
    public String getName() {
        return name;
        //Não precisa de this
        //Métodos gets geralmente não precisam de this
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }    
}
