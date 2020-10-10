/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.customer;

import java.io.Serializable;

/**
 *
 * @author HILTON9
 */
public class Address implements Serializable {
    private String street;
    private String suburb;
    private String city;
    private int postalCode;

    public Address() {
    }
    
    public Address(String street, String suburb, String city, int postalCode) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{\n\t\t\t" + "street=" + street + "\n\t\t\t suburb=" + suburb + "\n\t\t\t city=" + city + "\n\t\t\t postalCode=" + postalCode + '}';
    }
    
    
}
