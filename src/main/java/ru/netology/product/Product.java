package ru.netology.product;


public class Product {

    protected int id;
    protected int price;

    protected String name;

//    public Product() {

//    }

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }


//    public int getPrice() {
//        return price;
//    }

//    public void setPrice(int price) {
//        this.price = price;
//    }

   public int getId() {
        return id;
   }

//    public void setId(int id) {
//        this.id = id;
//   }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

}