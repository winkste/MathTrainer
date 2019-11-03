/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import settings.UserSets;

/**
 *
 * @author stephan_wink
 */
public class UserSettings extends javax.swing.JDialog {
    
    private final static Logger log = LogManager.getLogger(MainDialog.class);
    private List <UserSets> users;
    public static final int OK = 1;
    public static final int CANCEL = 0;
    private int result = CANCEL;
    private int actualUser = 0;


    /**
     * Creates new form UserSelection
     */
    public UserSettings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        users = UserSets.LoadUserSettingsFromFile();
        initComponents();
        initComboBoxes();
        LoadUserSettingsFromLocal(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userSel_jcb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ok_jb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        testLength_jcb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gameSel_jcb = new javax.swing.JComboBox<>();
        divLevel_js = new javax.swing.JSlider();
        mulLevel_js = new javax.swing.JSlider();
        subLevel_js = new javax.swing.JSlider();
        addLevel_js = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cancel_jb = new javax.swing.JButton();
        failuresInTest_jcb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        userSel_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lily", "Heike", "Stephan" }));
        userSel_jcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userSel_jcbItemStateChanged(evt);
            }
        });

        jLabel1.setText("Wähle einen Spieler aus:");

        ok_jb.setText("ok");
        ok_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_jbActionPerformed(evt);
            }
        });

        jLabel2.setText("Länge der Tests:");

        testLength_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "30" }));

        jLabel3.setText("Schwierigkeitsgrad Addieren:");

        jLabel4.setText("Schwierigkeitsgrad Subtrahieren:");

        jLabel5.setText("Schwierigkeitsgrad Multiplizieren:");

        jLabel6.setText("Schwierigkeitsgrad Dividieren:");

        jLabel7.setText("Spiel:");

        gameSel_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Snake", "Tetris" }));

        divLevel_js.setMajorTickSpacing(1);
        divLevel_js.setMaximum(10);
        divLevel_js.setPaintLabels(true);
        divLevel_js.setPaintTicks(true);
        divLevel_js.setSnapToTicks(true);

        mulLevel_js.setMajorTickSpacing(1);
        mulLevel_js.setMaximum(10);
        mulLevel_js.setPaintLabels(true);
        mulLevel_js.setPaintTicks(true);
        mulLevel_js.setSnapToTicks(true);

        subLevel_js.setMajorTickSpacing(1);
        subLevel_js.setMaximum(10);
        subLevel_js.setPaintLabels(true);
        subLevel_js.setPaintTicks(true);
        subLevel_js.setSnapToTicks(true);

        addLevel_js.setMajorTickSpacing(1);
        addLevel_js.setMaximum(10);
        addLevel_js.setPaintLabels(true);
        addLevel_js.setPaintTicks(true);
        addLevel_js.setSnapToTicks(true);

        cancel_jb.setText("Abbrechen");
        cancel_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_jbActionPerformed(evt);
            }
        });

        failuresInTest_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "90", "95", "100" }));

        jLabel8.setText("Erlaubte Fehler pro Tests:");

        jLabel9.setText("leicht           mittel         schwierig");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addLevel_js, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subLevel_js, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(divLevel_js, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mulLevel_js, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(cancel_jb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ok_jb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userSel_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(failuresInTest_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(testLength_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gameSel_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSel_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(testLength_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(failuresInTest_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gameSel_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLevel_js, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subLevel_js, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mulLevel_js, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divLevel_js, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_jb)
                    .addComponent(cancel_jb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userSel_jcbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userSel_jcbItemStateChanged
        this.log.trace("item change listener:" + this.userSel_jcb.getSelectedIndex());
        if(this.actualUser != this.userSel_jcb.getSelectedIndex())
        {
            StoreUserSettingsLocal(this.actualUser);
            this.actualUser = this.userSel_jcb.getSelectedIndex();
            LoadUserSettingsFromLocal(this.userSel_jcb.getSelectedIndex());
            
        }
        
        
    }//GEN-LAST:event_userSel_jcbItemStateChanged

    private void cancel_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_jbActionPerformed
        this.log.trace("cancel button pressed");
        this.result = CANCEL;
        this.setVisible(false);
    }//GEN-LAST:event_cancel_jbActionPerformed

    private void ok_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_jbActionPerformed
        log.trace("ok button pressed");
        this.result = OK;
        StoreUserSettingsLocal(this.userSel_jcb.getSelectedIndex());
        UserSets.StoreUserSettingsToFile(this.users);
        this.setVisible(false);
    }//GEN-LAST:event_ok_jbActionPerformed

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
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserSettings dialog = new UserSettings(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider addLevel_js;
    private javax.swing.JButton cancel_jb;
    private javax.swing.JSlider divLevel_js;
    private javax.swing.JComboBox<String> failuresInTest_jcb;
    private javax.swing.JComboBox<String> gameSel_jcb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSlider mulLevel_js;
    private javax.swing.JButton ok_jb;
    private javax.swing.JSlider subLevel_js;
    private javax.swing.JComboBox<String> testLength_jcb;
    private javax.swing.JComboBox<String> userSel_jcb;
    // End of variables declaration//GEN-END:variables

    public int GetDialogResult() 
    {
        return(this.result);
    }

    public List<UserSets> getUserSettings() 
    {
        return(this.users);
    }
    
    public void setUserSettings(List<UserSets> users, int selection)
    {
        this.users = users;
        this.actualUser = selection;
        if(this.userSel_jcb.getItemCount() > this.actualUser)
        {
            this.userSel_jcb.setSelectedIndex(this.actualUser);
            LoadUserSettingsFromLocal(this.actualUser);
        }       
    }

    private void initComboBoxes() 
    {
        this.userSel_jcb.removeItemListener(this.userSel_jcb.getItemListeners()[0]);
        this.userSel_jcb.setSelectedIndex(0);
        this.userSel_jcb.removeAllItems();
        Iterator<UserSets> iter = users.listIterator();
        while(iter.hasNext())
        {
            this.userSel_jcb.addItem(iter.next().getUserName());
        }
        userSel_jcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userSel_jcbItemStateChanged(evt);
            }
        });

        this.testLength_jcb.setSelectedIndex(0);
        this.testLength_jcb.removeAllItems();
        for (int counts : UserSets.getTestsLookup()) 
        {
            this.testLength_jcb.addItem(Integer.toString(counts));
        }
        this.failuresInTest_jcb.setSelectedIndex(0);
        this.failuresInTest_jcb.removeAllItems();
        for (int counts : UserSets.getFailuresLookup()) 
        {
            this.failuresInTest_jcb.addItem(Integer.toString(counts));
        }

        this.gameSel_jcb.setSelectedIndex(0);
        this.gameSel_jcb.removeAllItems();
        for (String names : UserSets.getGamesLookup()) 
        {
            this.gameSel_jcb.addItem(names);
        }
    }

    private void StoreUserSettingsLocal(int user) 
    {
        this.users.get(user).setIndexToTestsLookup(this.testLength_jcb.getSelectedIndex());
        this.users.get(user).setIndexToFailuresLookup(this.failuresInTest_jcb.getSelectedIndex());
        this.users.get(user).setIndexToGameLookup(this.gameSel_jcb.getSelectedIndex());
        this.users.get(user).setSubsLevel(this.subLevel_js.getValue());
        this.users.get(user).setAddiLevel(this.addLevel_js.getValue());
        this.users.get(user).setDivLevel(this.divLevel_js.getValue());
        this.users.get(user).setMulLevel(this.mulLevel_js.getValue());
    }

    private void LoadUserSettingsFromLocal(int user) 
    {
        this.testLength_jcb.setSelectedIndex(this.users.get(user).getIndexToTestsLookup());
        this.failuresInTest_jcb.setSelectedIndex(this.users.get(user).getIndexToFailuresLookup());
        this.gameSel_jcb.setSelectedIndex(this.users.get(user).getIndexToGameLookup());
        this.subLevel_js.setValue(this.users.get(user).getSubLevel());
        this.addLevel_js.setValue(this.users.get(user).getAddLevel());
        this.mulLevel_js.setValue(this.users.get(user).getMulLevel());
        this.divLevel_js.setValue(this.users.get(user).getDivLevel());       
    }
}
