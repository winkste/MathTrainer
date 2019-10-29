/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import com.zetcode.snake.Snake;
import com.zetcode.tetris.Tetris;
import data.MathOps;
import data.MinusOp;
import data.PlusOp;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import settings.UserSettings;


/**
 *
 * @author stephan_wink
 */
public class MainDialog extends javax.swing.JFrame {
    

    private MathOps test;
    private UserSettings user;


    /**
     * Creates new form MqttStarter
     */
    public MainDialog() {

        user = new UserSettings("Lily", 10);
        initComponents();

    }

    public MainDialog(String hostname) {
        this();
        this.setTitle("Mathe Trainer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        log_jta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        minus_jb = new javax.swing.JButton();
        plus_jb = new javax.swing.JButton();
        mul_jb = new javax.swing.JButton();
        div_jb = new javax.swing.JButton();
        formula_jtf = new javax.swing.JTextField();
        result_jtf = new javax.swing.JTextField();
        next_jb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        log_jta.setBackground(new java.awt.Color(102, 102, 102));
        log_jta.setColumns(20);
        log_jta.setForeground(new java.awt.Color(255, 255, 255));
        log_jta.setRows(5);
        jScrollPane1.setViewportView(log_jta);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/wshield.png"))); // NOI18N

        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        minus_jb.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        minus_jb.setText("-");
        minus_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_jbActionPerformed(evt);
            }
        });
        jPanel1.add(minus_jb);

        plus_jb.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        plus_jb.setText("+");
        plus_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_jbActionPerformed(evt);
            }
        });
        jPanel1.add(plus_jb);

        mul_jb.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        mul_jb.setText("*");
        mul_jb.setEnabled(false);
        mul_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mul_jbActionPerformed(evt);
            }
        });
        jPanel1.add(mul_jb);

        div_jb.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        div_jb.setText("/");
        div_jb.setEnabled(false);
        div_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_jbActionPerformed(evt);
            }
        });
        jPanel1.add(div_jb);

        formula_jtf.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        formula_jtf.setText("29 + 12 = ");
        formula_jtf.setEnabled(false);

        result_jtf.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        result_jtf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        result_jtf.setText("-999");

        next_jb.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        next_jb.setText(">");
        next_jb.setEnabled(false);
        next_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(formula_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(result_jtf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(next_jb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formula_jtf, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(result_jtf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next_jb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minus_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_jbActionPerformed
        test = new MinusOp(user.getTestsToGameCount());
        startChallange("minus Test gestartet\n");
    }//GEN-LAST:event_minus_jbActionPerformed

    private void plus_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_jbActionPerformed

        test = new PlusOp(user.getTestsToGameCount());
        startChallange("plus Test gestartet\n");
    }//GEN-LAST:event_plus_jbActionPerformed

    private void mul_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mul_jbActionPerformed

        this.log_jta.append("mal challange gestartet\n");
    }//GEN-LAST:event_mul_jbActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void div_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_jbActionPerformed
        this.log_jta.append("teilen challange gestartet\n");
    }//GEN-LAST:event_div_jbActionPerformed

    private void next_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_jbActionPerformed
        if(null != this.test)
        {
            if(isNumeric(this.result_jtf.getText()))
            {
                int result = Integer.parseInt(this.result_jtf.getText());
                if(this.test.validateResult(result))
                {
                    this.log_jta.append(this.formula_jtf.getText() + this.result_jtf.getText() + " R\n");
                }
                else
                {
                    this.log_jta.append(this.formula_jtf.getText() + this.result_jtf.getText() + " F\n");
                }
            
                if(this.test.isTestCycleCompleted())
                {
                    this.next_jb.setEnabled(false);
                    enableTestStarts(true);
                    JOptionPane.showMessageDialog(MainDialog.this, "Gut gemacht!\n "
                            + "Dafür gibt es jetzt zur Belohnung ein Spiel.\n "
                            + "Mach dich bereit!");
                    startTheGame();
                    this.formula_jtf.setText("");
                    this.result_jtf.setText("");

                }
                else
                {
                    this.test.calculateNextTest();
                    this.formula_jtf.setText(this.test.getOperation());
                    this.result_jtf.setText("");
                    this.next_jb.setEnabled(true);
                }
            }
            else
            {
                this.log_jta.append(" Das war keine Zahl, versuche es noch einmal!\n");
            }
        }
        
    }//GEN-LAST:event_next_jbActionPerformed


    public void Start()
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainDialog.this.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton div_jb;
    private javax.swing.JTextField formula_jtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea log_jta;
    private javax.swing.JButton minus_jb;
    private javax.swing.JButton mul_jb;
    private javax.swing.JButton next_jb;
    private javax.swing.JButton plus_jb;
    private javax.swing.JTextField result_jtf;
    // End of variables declaration//GEN-END:variables

    private void enableTestStarts(boolean enable) {
        this.minus_jb.setEnabled(enable);
        this.plus_jb.setEnabled(enable);
        //this.mul_jb.setEnabled(enable);
        //this.div_jb.setEnabled(enable);
        
    }

    private void startTheGame() 
    {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Tetris();
            ex.setVisible(true);
        });
    }

    private void startChallange(String log) {
        
        if(null != test)
        {
            this.log_jta.append(log);
            enableTestStarts(false);
            this.next_jb.setEnabled(true);
            this.test.calculateNextTest();
            this.formula_jtf.setText(test.getOperation());
            this.result_jtf.setText("");
        }
    }
    
    public static boolean isNumeric(String strNum) 
    {
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    class DataCollector extends SwingWorker<Long, Object>
    {

        @Override
        protected Long doInBackground() throws Exception 
        {
            try 
            { 
                Thread.sleep(30000);
            } catch ( InterruptedException e ) { }
            new DataCollector().execute();
            return (0L);
        }
        
        @Override protected void done()
        {
            //TODO
        }
    }
}