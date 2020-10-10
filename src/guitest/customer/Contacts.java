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
public class Contacts implements Serializable {
    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private String alternativeNumber;
    private String website;
    private Address physicalAddress;
    private Address postalAddress;

    public Contacts() {
    }

    public Contacts(String email, String phone, String mobile, String fax, String alternativeNumber, String website, Address physicalAddress, Address postalAddress) {
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.fax = fax;
        this.alternativeNumber = alternativeNumber;
        this.website = website;
        this.physicalAddress = physicalAddress;
        this.postalAddress = postalAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAlternativeNumber() {
        return alternativeNumber;
    }

    public void setAlternativeNumber(String alternativeNumber) {
        this.alternativeNumber = alternativeNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Address getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(Address physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Override
    public String toString() {
        return "Contacts{\n\t\t" + "email=" + email + "\n\t\t phone=" + phone + "\n\t\t mobile=" + mobile + "\n\t\t fax=" + fax + "\n\t\t alternativeNumber=" + alternativeNumber + "\n\t\t website=" + website + "\n\t\t physicalAddress=" + physicalAddress.toString() + "\n\t\t postalAddress=" + postalAddress.toString() + "\n" + '}';
    }
    
    
    
}
