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
public enum Policies {

    BASIC_PLAN("Basic Plan"),
    PREMUIM_PLAN("Premuim Plan");
    
    private final String policy;

    private Policies(String policy) {
        this.policy = policy;
    }

    public String getPolicy() {
        return policy;
    }    

}
