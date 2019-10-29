/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;

import gui.MainDialog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 *
 * @author stephan_wink
 */

// TODO: add log4j for generic logging
// TODO: add user statistic handling
// TODO: load user statistic from file
// TODO: do we need a configuration dialog for the user settings?
// TODO: Add different user handling and selection at start (dialog with combo box)
// TODO: if next is pressed, focus back to the data entry field
// TODO: tetris should be slower

public class Launcher 
{
    private final static Logger log = LogManager.getLogger(Launcher.class);

            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*MyMqttClient client = MyMqttClient.getInstance();
                client.setAddress("tcp://192.168.178.45:1883");
                client.setIdentifier("macBook_pro");
                client.connectClient();
                
        TracerFrame tracer = new TracerFrame(client);
        tracer.setTitle("MQTTracer");*/
                
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        tracer.setVisible(true);
        }
        });*/
        //</editor-fold>
        
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tracer.setVisible(true);
            }
        //</editor-fold>
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        tracer.setVisible(true);
        }
        });*/
        //</editor-fold>
        
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tracer.setVisible(true);
            }
        });*/
        
        log.info("starting...");
        log.error("this is an error");
        log.warn("this is a warning");
        
        MainDialog start = new MainDialog();
        start.Start();
    }
    
}
