/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.customer;

import guitest.policy.BasicPlan;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author HILTON9
 */
public class Customer implements Serializable {
    private PersonalDetails personalDetails;
    private CompanyDetails companyDetails;
    private Benefitiary benefitiary;
    private List<Dependent> dependents; 
    private String notes;
    private AccountStatus status;
    private String attachments;
    private PreferedContactMethod preferedContactMethod;
    private PreferedDeliveryMethod preferedDeliveryMethod;
    private BasicPlan basicPlan;
    
}
