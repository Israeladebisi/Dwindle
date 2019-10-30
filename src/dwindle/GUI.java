/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwindle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YuTsai
 */
public class GUI extends javax.swing.JFrame {
    
    public static int decision;
    
    /**
     * Creates new form GUI
     * @throws java.io.IOException
     */
    public GUI() throws IOException{
        initComponents();
        
        EventDeck.currentCard = Dwindle.mainDeck.loadRandomCard();
        
        /*
        int triggerArray = Stats.day;
        triggerArray = triggerArray;
        EventCard.foundTriggers[triggerArray] = EventCard.getTriggerWords();
        System.out.println(EventCard.foundTriggers.toString());
        */
        
        Stats.day++;
        
        resources.setText("Resources: " + Stats.resources);
        resourceDice.setText("Resource Dice: " + Stats.resourceDice);
        playerHealth.setText("Player Health: " + Stats.health);
        day.setText("Day: " + Stats.day);
        
        eventStory.setText(EventDeck.currentCard.getStory());
        choice1Button.setText(EventDeck.currentCard.getOption1());
        choice2Button.setText(EventDeck.currentCard.getOption2());
        choice3Button.setText(EventDeck.currentCard.getOption3());
        choice4Button.setText(EventDeck.currentCard.getOption4());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextPhaseButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        resources = new javax.swing.JLabel();
        resourceDice = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        choice1Button = new javax.swing.JButton();
        choice2Button = new javax.swing.JButton();
        choice3Button = new javax.swing.JButton();
        choice4Button = new javax.swing.JButton();
        playerHealth = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventStory = new javax.swing.JTextArea();

        nextPhaseButton.setText("Next Phase");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resources.setText("Resources: 5");

        resourceDice.setText("Resource Dice: 2");

        day.setText("Day: 1");

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

        playerHealth.setText("Player Health: 10");

        eventStory.setEditable(false);
        eventStory.setColumns(20);
        eventStory.setLineWrap(true);
        eventStory.setRows(5);
        eventStory.setWrapStyleWord(true);
        jScrollPane1.setViewportView(eventStory);

        jLayeredPane1.setLayer(resources, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(resourceDice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(day, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(choice1Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(choice2Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(choice3Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(choice4Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(playerHealth, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choice3Button)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(resources)
                        .addGap(18, 18, 18)
                        .addComponent(resourceDice)
                        .addGap(18, 18, 18)
                        .addComponent(playerHealth)
                        .addGap(18, 18, 18)
                        .addComponent(day))
                    .addComponent(choice1Button)
                    .addComponent(choice2Button)
                    .addComponent(choice4Button))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resources)
                    .addComponent(day)
                    .addComponent(resourceDice)
                    .addComponent(playerHealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choice1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choice2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choice3Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choice4Button))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ButtonActionPerformed
        // TODO add your handling code here:
        //int diff = 5 - Integer.parseInt(EventCard.mech4);
        decision = 1;
        
        GUI2 gui2 = new GUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice1ButtonActionPerformed

    private void choice2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ButtonActionPerformed
        // TODO add your handling code here:
        decision = 2;
        
        GUI2 gui2 = new GUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice2ButtonActionPerformed

    private void choice3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ButtonActionPerformed
        // TODO add your handling code here:
        decision = 3;
        
        GUI2 gui2 = new GUI2();
        gui2.setVisible(true);
        dispose();
    }//GEN-LAST:event_choice3ButtonActionPerformed

    private void choice4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ButtonActionPerformed
        // TODO add your handling code here:
        decision = 4;
        
        GUI2 gui2 = new GUI2();
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choice1Button;
    private javax.swing.JButton choice2Button;
    private javax.swing.JButton choice3Button;
    private javax.swing.JButton choice4Button;
    private javax.swing.JLabel day;
    private javax.swing.JTextArea eventStory;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextPhaseButton;
    private javax.swing.JLabel playerHealth;
    private javax.swing.JLabel resourceDice;
    private javax.swing.JLabel resources;
    // End of variables declaration//GEN-END:variables
}