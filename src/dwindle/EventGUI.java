package dwindle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YuTsai
 */
public class EventGUI extends javax.swing.JFrame {
    
    public static int decision;
    
    /**
     * Creates new form GUI
     * @throws java.io.IOException
     */
    public EventGUI() throws IOException{
        initComponents();
        
        EventDeck.currentCard = Dwindle.deck.deal();
        
        Stats.day++;
        
        //Update EventGUI Information
        resourceLabel.setText("Resources: " + Stats.resources);
        resourceDieLabel.setText("Resource Dice: " + Stats.resourceDice);
        healthLabel.setText("Player Health: " + Stats.health);
        dayLabel.setText("Day: " + Stats.day);
        
        jTextArea1.setText(EventDeck.currentCard.getStory());
        choice1Button.setText(EventDeck.currentCard.getOption1());
        choice2Button.setText(EventDeck.currentCard.getOption2());
        choice3Button.setText(EventDeck.currentCard.getOption3());
        choice4Button.setText(EventDeck.currentCard.getOption4());
        
    }
    EventMechanics eventMech = new EventMechanics();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        resourceLabel = new javax.swing.JLabel();
        resourceDieLabel = new javax.swing.JLabel();
        healthLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        choice1Button = new javax.swing.JButton();
        choice2Button = new javax.swing.JButton();
        choice3Button = new javax.swing.JButton();
        choice4Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        resourceLabel.setForeground(new java.awt.Color(255, 255, 255));
        resourceLabel.setText("Resource: 4");

        resourceDieLabel.setForeground(new java.awt.Color(255, 255, 255));
        resourceDieLabel.setText("Resource Die: 11");

        healthLabel.setForeground(new java.awt.Color(255, 255, 255));
        healthLabel.setText("Health: 8");

        dayLabel.setForeground(new java.awt.Color(255, 255, 255));
        dayLabel.setText("Day: 10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resourceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(resourceDieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(healthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(73, 73, 73)
                .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resourceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resourceDieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(healthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        choice1Button.setText("Give him some food (lose one resource dice)");
        choice1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1ButtonActionPerformed(evt);
            }
        });

        choice2Button.setText("Refuse and insist he find his own place and own food");
        choice2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2ButtonActionPerformed(evt);
            }
        });

        choice3Button.setText("Be very quiet and pretend there's no one here");
        choice3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3ButtonActionPerformed(evt);
            }
        });

        choice4Button.setText("Tell him you don't have any food left");
        choice4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choice1Button)
                    .addComponent(choice2Button)
                    .addComponent(choice3Button)
                    .addComponent(choice4Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choice1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice3Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice4Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void choice1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ButtonActionPerformed

        decision = 1;
        eventMech.Choice1();
        EventGUI2 gui2 = new EventGUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice1ButtonActionPerformed

    private void choice2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ButtonActionPerformed

        decision = 2;
        eventMech.Choice2();
        EventGUI2 gui2 = new EventGUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice2ButtonActionPerformed

    private void choice3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ButtonActionPerformed

        decision = 3;
        eventMech.Choice3();
        EventGUI2 gui2 = new EventGUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice3ButtonActionPerformed

    private void choice4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ButtonActionPerformed

        decision = 4;
        eventMech.Choice4();
        EventGUI2 gui2 = new EventGUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice4ButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException{
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
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EventGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EventGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choice1Button;
    private javax.swing.JButton choice2Button;
    private javax.swing.JButton choice3Button;
    private javax.swing.JButton choice4Button;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel resourceDieLabel;
    private javax.swing.JLabel resourceLabel;
    // End of variables declaration//GEN-END:variables
}
