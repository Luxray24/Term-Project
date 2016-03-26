/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Swarner, Georgia Snelling
 */
public class Quiz extends javax.swing.JFrame {

    /**
     * Creates new form quizJFrame
     */
    public final int NUMBER_OF_POSITIONS = 4;
    public final int NUMBER_OF_QUESTIONS = 2;

    TermProjectJFrame mainFrame;
    Question questions;

    public Quiz() {
        initComponents();
        questions = new Question();
        this.setLocationRelativeTo(null);
        mainMenuJButton.setVisible(false);
        nextJButton.setVisible(false);
        this.remove(option1);
        this.remove(option2);
        this.remove(option3);
        this.remove(correctAnswer);
        setRandom();
        setQuestion();
        setOptions();
        setOptionPositions();
    }

    Random random = new Random();
    int randomInt = 0;
    int w = 0;
    int x = 0;
    int y = 0;
    int z = 0;

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
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        correctAnswer = new javax.swing.JRadioButton();
        submitJButton = new javax.swing.JButton();
        mainMenuJButton = new javax.swing.JButton();
        nextJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        questionJLabel.setText("Which of the following is a Consumer?");

        optionGroup.add(option1);
        option1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        option1.setText("Ficus");

        optionGroup.add(option2);
        option2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        option2.setText("Algae");

        optionGroup.add(option3);
        option3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        option3.setText("Plankton");

        optionGroup.add(correctAnswer);
        correctAnswer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correctAnswer.setText("Bear");

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
        nextJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correctAnswer)
                            .addComponent(option3)
                            .addComponent(questionJLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(option1)
                                .addComponent(option2)))
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
                .addGap(26, 26, 26)
                .addComponent(option1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correctAnswer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(mainMenuJButton)
                    .addComponent(nextJButton))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (correctAnswer.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congrats!  You got it right!");
            mainMenuJButton.setVisible(true);
            nextJButton.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Oops.  Looks like that wasn't it.  Please try again.");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void mainMenuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuJButtonActionPerformed
        mainFrame = new TermProjectJFrame();
        this.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_mainMenuJButtonActionPerformed

    private void nextJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJButtonActionPerformed
        setRandom();
        setQuestion();
        setOptions();
        setOptionPositions();
    }//GEN-LAST:event_nextJButtonActionPerformed

    private void setRandom() {
        randomInt = random.nextInt(NUMBER_OF_QUESTIONS);
        w = random.nextInt(NUMBER_OF_POSITIONS);
        x = random.nextInt(NUMBER_OF_POSITIONS);
        y = random.nextInt(NUMBER_OF_POSITIONS);
        z = random.nextInt(NUMBER_OF_POSITIONS);
        while (true) {
            if (w == x || w == y || w == z) {
                w = random.nextInt(NUMBER_OF_POSITIONS);
                continue;
            } else if (x == y || x == z) {
                x = random.nextInt(NUMBER_OF_POSITIONS);
                continue;
            } else if (y == z) {
                y = random.nextInt(NUMBER_OF_POSITIONS);
                continue;
            } else {
                break;
            }
        }
    }

    private void setQuestion() {
        //questionJLabel.setText(questions.questions[randomInt]);
    }

    private void setOptions() {
        option1.setText(questions.option1[randomInt]);
        option2.setText(questions.option2[randomInt]);
        option3.setText(questions.option3[randomInt]);
        correctAnswer.setText(questions.correctAnswer[randomInt]);
    }

    private void setOptionPositions() {
        for (int i = 0; i < 4; i++) {
            if (w == i) {
                this.add(option1);
            } else if (x == i) {
                this.add(option2);
            } else if (y == i) {
                this.add(option3);
            } else if (z == i) {
                this.add(correctAnswer);
            }
        }
    }

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
    private javax.swing.JRadioButton correctAnswer;
    private javax.swing.JButton mainMenuJButton;
    private javax.swing.JButton nextJButton;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.ButtonGroup optionGroup;
    private javax.swing.JLabel questionJLabel;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
