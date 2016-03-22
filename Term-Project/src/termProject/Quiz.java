/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termProject;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark
 */
public class Quiz extends javax.swing.JFrame {

    /**
     * Creates new form quizJFrame
     */
    TermProjectJFrame mainFrame;
    public Quiz() {
        initComponents();
        mainMenuJButton.setVisible(false);
        nextJButton.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionGroup = new javax.swing.ButtonGroup();
        questionJLabel = new javax.swing.JLabel();
        optionA = new javax.swing.JRadioButton();
        optionB = new javax.swing.JRadioButton();
        optionC = new javax.swing.JRadioButton();
        optionD = new javax.swing.JRadioButton();
        submitJButton = new javax.swing.JButton();
        mainMenuJButton = new javax.swing.JButton();
        nextJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        questionJLabel.setText("Which of the following is a Consumer?");

        optionGroup.add(optionA);
        optionA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        optionA.setText("Ficus");

        optionGroup.add(optionB);
        optionB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        optionB.setText("Algae");

        optionGroup.add(optionC);
        optionC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        optionC.setText("Plankton");

        optionGroup.add(optionD);
        optionD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        optionD.setText("Bear");

        submitJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        mainMenuJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mainMenuJButton.setText("<< Main Menu");
        mainMenuJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuJButtonActionPerformed(evt);
            }
        });

        nextJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nextJButton.setText("Next >>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionD)
                            .addComponent(optionB)
                            .addComponent(optionA)
                            .addComponent(optionC)
                            .addComponent(questionJLabel))
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainMenuJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextJButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionJLabel)
                .addGap(18, 18, 18)
                .addComponent(optionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(mainMenuJButton)
                    .addComponent(nextJButton))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(optionD.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Congrats!  You got it right!");
            mainMenuJButton.setVisible(true);
            nextJButton.setVisible(true);
        } else
        {
            JOptionPane.showMessageDialog(null, "Oops.  Looks like that wasn't it.  Please try again.");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void mainMenuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuJButtonActionPerformed
        mainFrame = new TermProjectJFrame();
        this.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_mainMenuJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mainMenuJButton;
    private javax.swing.JButton nextJButton;
    private javax.swing.JRadioButton optionA;
    private javax.swing.JRadioButton optionB;
    private javax.swing.JRadioButton optionC;
    private javax.swing.JRadioButton optionD;
    private javax.swing.ButtonGroup optionGroup;
    private javax.swing.JLabel questionJLabel;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}