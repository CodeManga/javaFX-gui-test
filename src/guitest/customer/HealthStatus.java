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
public enum HealthStatus implements Serializable {
    ALIVE("Alive"),
    DECEASED("Deceased");
    
    private String status;

    private HealthStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    
}
