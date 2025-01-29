package com.jrlsf.activity_backend.models;

public class Product {
    //Atributos Objetos são contruídos a partir de classes
    private int id;
    private String name;
    private double price;
    private String description;
    private String option;
    private String category;
    
    //Método Construttor
    public Product(int id, String name, double price, String description, String option, String category){
        //System.out.println("Construindo um Produto");
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.option = option;
        this.category = category;
    }
    public Product(){
        
    }

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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getOption() {
        return option;
    }
    public void setOption(String option) {
        this.option = option;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(double price) {
        this.price = price;
    }    
}
