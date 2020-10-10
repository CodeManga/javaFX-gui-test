/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.customer;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author HILTON9
 */
public class PersonalDetails implements Serializable {
    private String title;
    private String name;
    private String middleName;
    private String lastName;
    private int policyNumber;
    private long idNumber;
    private MaritalStatus maritalStatus;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private String causeOfDearth;
    private Contacts contacts;

    public PersonalDetails() {
    }

    public PersonalDetails(String title, String name, String middleName, 
            String lastName, int policyNumber, long idNumber, 
            MaritalStatus maritalStatus, Date dateOfBirth, Date dateOfDeath, 
            String causeOfDearth, Contacts contacts) {
        this.title = title;
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.policyNumber = policyNumber;
        this.idNumber = idNumber;
        this.maritalStatus = maritalStatus;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.causeOfDearth = causeOfDearth;
        this.contacts = contacts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getCauseOfDearth() {
        return causeOfDearth;
    }

    public void setCauseOfDearth(String causeOfDearth) {
        this.causeOfDearth = causeOfDearth;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "PersonalDetails\n\t{" + "title=" + title + "\n\t name=" + name + "\n\t middleName=" + middleName + "\n\t lastName=" + lastName + "\n\t policyNumber=" + policyNumber + "\n\t idNumber=" + idNumber + "\n\t maritalStatus=" + maritalStatus + "\n\t dateOfBirth=" + dateOfBirth + "\n\t dateOfDeath=" + dateOfDeath + "\n\t causeOfDearth=" + causeOfDearth + "\n\t contacts=" + contacts.toString() + "\n" + '}';
    }

}
