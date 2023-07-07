package com.example.Shop.entity;

public class Product {
    //ma san pham
    private int productId;
    //ten san pham
    private String productName;
    //hinh anh san pham
    private String productImage;
    //gia san pham
    private double productPrice;
    //tieu de cho san pham
    private String productTitle;
    //mo ta san pham
    private String productDescription;

    public Product(int productId, String productName, String productImage, double productPrice, String productTitle, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
