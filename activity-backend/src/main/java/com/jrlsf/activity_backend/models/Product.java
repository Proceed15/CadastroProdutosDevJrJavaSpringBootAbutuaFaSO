package com.jrlsf.activity_backend.models;

public class Product {
    //Atributos Objetos são contruídos a partir de classes
    private int id;
    private String name;
    private double price;
    private String description;
    private boolean promotion;
    private boolean newProduct;
    private int idCategory;

    //Métodos Construtores
    public Product(int id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public Product(int id, String name, String description, double price, int idCategory, boolean promotion, boolean newProduct){
        //System.out.println("Construindo um Produto");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.idCategory = idCategory;
        this.promotion = promotion;
        this.newProduct = newProduct;
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
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isPromotion() {
        return promotion;
    }
    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
    public boolean isNewProduct() {
        return newProduct;
    }
    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
    public int getIdCategory() {
        return idCategory;
    }
    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
    
}
