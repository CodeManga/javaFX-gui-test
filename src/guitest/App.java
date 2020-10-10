/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author HILTON9
 */
public class App {
//    static boolean isDashboardSelected = false;
//    static boolean isSalesPanelSelected = false;
//    static boolean isSuppliersPanelSelected = false;
//    static boolean isInventoryPanelSelected = false;
//    static boolean isCemeteryManagementPanelSelected = false;
//    static boolean isUserManagementPanelSelected = false;
//    static boolean isEventCalenderPanelSelected = false;
//    static boolean isFuneralPackagesPanelSelected = false;
//    
//    static boolean isAllSalesSelected = true;
//    static boolean isCustomersSelected = false;
//    static boolean isPackagesSelected = false;
//    
//    static final Color SELECTED_COLOR = new Color(65, 119, 160);
//    static final Color HOVER_COLOR = new Color(247, 68, 71);
//    static final Color DEFUALT_HOVER_COLOR = new Color(10,18,50);
//    
//    static final Color SELECTED_UNDERLINE_HEADER = new Color(247, 68, 71);
//    static final Color DEFUALT_UNDERLINE_HEADER = new Color(255, 255, 255);
//    static final Color HOVER_UNDERLINE_HEADER = new Color(65, 119, 160);
//    
//    static public void setDefualtSetValues() {
//        isCemeteryManagementPanelSelected = false;
//        isDashboardSelected = false;
//        isEventCalenderPanelSelected = false;
//        isFuneralPackagesPanelSelected = false;
//        isInventoryPanelSelected = false;
//        isSuppliersPanelSelected = false;
//        isUserManagementPanelSelected = false;
//        isSalesPanelSelected = false;
//    }
    
//    static public void resetUnderlineSelectedValues() {
//        isPackagesSelected = false;
//        isCustomersSelected = false;
//        isAllSalesSelected = false;
//    }
    
//    public void swicthAppPanel(JPanel panel) {
//        layeredAppPanel.removeAll();
//        layeredAppPanel.add(panel);
//        layeredAppPanel.repaint();
//        layeredAppPanel.revalidate();
//    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    javax.swing.UIManager.setLookAndFeel( javax.swing.UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Login().setVisible(true);
            }
        });
    }
}
