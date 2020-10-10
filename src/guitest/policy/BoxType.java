/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.policy;

/**
 *
 * @author HILTON9
 */
public enum BoxType {
    CAKET_NORMAL("Normal Casket"),
    ROUND_CASKET("Round Casket"),
    STANDARD_COFFIN("Standard Coffin"),
    PREMIUM_COFFIN("Premuim Coffin");
    
    private String status;

    private BoxType(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    
}
