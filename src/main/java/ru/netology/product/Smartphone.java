package ru.netology.product;


public class Smartphone extends Product {

    private String maker;


    public Smartphone(int id, int price, String name, String maker) {
        super(id, price, name);
        this.maker = maker;
    }

//    public String getMaker() {
//        return maker;
//    }

//    public void setMaker(String maker) {
//        this.maker = maker;
//    }
}
