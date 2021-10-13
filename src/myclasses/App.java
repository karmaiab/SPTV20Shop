/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Buyer;
import entity.Product;

/**
 *
 * @author User
 */
public class App {
    public void run(){
        Product product = new Product();
        product.setProductName("cake");
        product.setProductPrice(10);
        product.setProductExpireDays(30);
        Buyer buyer = new Buyer();
        buyer.setFirstName("Daniil");
        buyer.setLastName("Mozgov");
        buyer.setBuyersAge(18);
        System.out.printf("%s %s bought a %s which costs %s euros",
                        buyer.getFirstName(),
                        buyer.getLastName(),
                        product.getProductName(),
                        product.getProductPrice()
                );
    }
}
