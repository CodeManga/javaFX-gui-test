/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.customer;

import java.io.*;

/**
 *
 * @author HILTON9
 */
public enum AccountStatus implements Serializable {
    ACTIVE("Active"),
    PENDING_APPROVAL("Pending Approval"),
    DEACTIVE_LEVEL_1("Account Deactive - Client Deceased"),
    DEACTIVE_LEVEL_2("Account Deactive - Client Defualted Payment");
    
    private String status;

    private AccountStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    

}
