/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.customer;

/**
 *
 * @author HILTON9
 */
public enum MaritalStatus {
    SINGLE("Single"),
    MARRIED("Married"),
    DEVORCED("Devorced");
    
    private String status;

    private MaritalStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
