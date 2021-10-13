/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author User
 */
public class Product {
    private String productName;
    private int productPrice;
    private int productExpireDays;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductExpireDays() {
        return productExpireDays;
    }

    public void setProductExpireDays(int productExpireDays) {
        this.productExpireDays = productExpireDays;
    }
}
