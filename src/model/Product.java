package model;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product> {
    private String idProduct,nameProduct,informationProduct;
    private int price, amount;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, int price, int amount, String informationProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.informationProduct = informationProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInformationProduct() {
        return informationProduct;
    }

    public void setInformationProduct(String informationProduct) {
        this.informationProduct = informationProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", informationProduct=" + informationProduct +
                '}';
    }
    @Override
    public int compareTo(Product a) {
        return (int) (this.getPrice() - a.getPrice());

    }
}
