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
public class Buyer {
    private String firstName;
    private String lastName;
    private int buyersAge;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBuyersAge() {
        return buyersAge;
    }

    public void setBuyersAge(int buyersAge) {
        this.buyersAge = buyersAge;
    }
}
