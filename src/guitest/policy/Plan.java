/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.policy;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HILTON9
 */
public class Plan {
    private double premium;
    private Date effectiveFrom;
    private Date effectiveTo;
    private double payOutAmount;
    private List<PaymentHistory> paymentHistory;
}
