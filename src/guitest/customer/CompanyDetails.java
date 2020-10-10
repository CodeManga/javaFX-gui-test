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
public class CompanyDetails implements Serializable {
    private String companyName;
    private String jobTitle;
    private double salary;
    private Contacts companyContacts;

    public CompanyDetails(String companyName, String jobTitle, double salary, Contacts companyContacts) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyContacts = companyContacts;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public Contacts getCompanyContacts() {
        return companyContacts;
    }
    
    
}
