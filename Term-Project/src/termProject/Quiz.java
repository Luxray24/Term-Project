/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termProject;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Mark Swarner, Georgia Snelling
 */
public class Quiz extends javax.swing.JFrame {

    /**
     * Creates new form quizJFrame
     */
    
    
    ArrayList<Question> multipleQuestionsArray = new ArrayList<Question>();
    Question multipleQuestion = null;
        
    int number;
    int questionNumber;
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String correctAnswer;
    String wrongMessage;
    String correctMessage;
    
    int size;

    TermProjectJFrame mainFrame;
    Question questions;
    

    public Quiz(ArrayList array, Question objQuestion) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        mainMenuJButton.setVisible(false);
                
        multipleQuestionsArray = array;
        multipleQuestion = objQuestion;
        
        size = multipleQuestionsArray.size() ;
        
        number = multipleQuestion.getQuestionNumber();
        String questionNumber = multipleQuestion.getQuestionNumber() + "";
        question = multipleQuestion.getQuestion();
        option1 = multipleQuestion.getOption1();
        option2 = multipleQuestion.getOption2();
        option3 = multipleQuestion.getOption3();
        option4 = multipleQuestion.getOption4();
        correctAnswer = multipleQuestion.getCorrectAnswer();
        
        questionJLabel.setText(questionNumber + ". " + question);
        radio1.setText(option1);
        radio2.setText(option2);
        radio3.setText(option3);
        radio4.setText(option4);
        
        radio1.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage1Name())));
        radio2.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage2Name())));
        radio3.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage3Name())));
        radio4.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage4Name())));
        
//        image1Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage1Name())));
//        image2Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage2Name())));
//        image3Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage3Name())));
//        image4Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage4Name())));
        
        
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
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        submitJButton = new javax.swing.JButton();
        mainMenuJButton = new javax.swing.JButton();
        glossaryJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(864, 439));

        questionJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        questionJLabel.setText("Which of the following is a Consumer?");

        optionGroup.add(radio1);
        radio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio1.setText("Ficus");
        radio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio1MouseClicked(evt);
            }
        });
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        optionGroup.add(radio2);
        radio2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio2.setText("Algae");

        optionGroup.add(radio3);
        radio3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio3.setText("Plankton");

        optionGroup.add(radio4);
        radio4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio4.setText("Bear");

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

        glossaryJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        glossaryJButton.setText("Glossary");
        glossaryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glossaryJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(questionJLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(mainMenuJButton)
                        .addGap(70, 70, 70)
                        .addComponent(glossaryJButton)
                        .addGap(51, 51, 51)
                        .addComponent(submitJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radio1)
                            .addComponent(radio3))
                        .addGap(331, 331, 331)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radio2)
                            .addComponent(radio4))))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(questionJLabel)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio2)
                    .addComponent(radio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio3)
                    .addComponent(radio4))
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenuJButton)
                    .addComponent(glossaryJButton)
                    .addComponent(submitJButton))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
             
        if (radio1.isSelected()) 
        {
            if (option1.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== size )
                {
                    mainMenuJButton.setVisible(true);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,  multipleQuestion.getCorrectMessage());
                    nextButton();
                }
            }
            else
            {
                radio1.setEnabled(false);
                JOptionPane.showMessageDialog(null,  multipleQuestion.getWrongMessage());
            }
        }
        else if (radio2.isSelected()) 
        {
            if (option2.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== size)
                {
                    mainMenuJButton.setVisible(true);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,  multipleQuestion.getCorrectMessage());
                    nextButton();
                }
            }
             else
            {
                radio2.setEnabled(false);
                JOptionPane.showMessageDialog(null,  multipleQuestion.getWrongMessage());
            }
        }
        else if (radio3.isSelected()) 
        {
            if (option3.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== size)
                {
                    mainMenuJButton.setVisible(true);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,  multipleQuestion.getCorrectMessage());
                    nextButton();
                }
            }
             else
            {
                radio3.setEnabled(false);
                JOptionPane.showMessageDialog(null,  multipleQuestion.getWrongMessage());
            }
        }
        else if (radio4.isSelected()) 
        {
            if (option4.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== size)
                {
                    mainMenuJButton.setVisible(true);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,  multipleQuestion.getCorrectMessage());
                    nextButton();
                }
            }
             else
            {
                radio4.setEnabled(false);
                JOptionPane.showMessageDialog(null,  multipleQuestion.getWrongMessage());
            }
        }
        
                
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void mainMenuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuJButtonActionPerformed
        
        this.setVisible(false);
                
    }//GEN-LAST:event_mainMenuJButtonActionPerformed

    private void glossaryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glossaryJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_glossaryJButtonActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio1MouseClicked
        // TODO add your handling code here:
        
        radio1.setBorder(new LineBorder(Color.black, 5));
        
    }//GEN-LAST:event_radio1MouseClicked

    
   

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
                //new Quiz(ArrayList array).setVisible(true);
            }
        });
        
               
    }
    
    public void nextButton()
    {
        radio1.setEnabled(true);
        radio2.setEnabled(true);
        radio3.setEnabled(true);
        radio4.setEnabled(true);
        
        optionGroup.clearSelection();
        
        int currentQuestion = multipleQuestion.getQuestionNumber();
        multipleQuestion = multipleQuestionsArray.get(currentQuestion);
        
        number = multipleQuestion.getQuestionNumber();
        String questionNumber = multipleQuestion.getQuestionNumber() + "";
        question = multipleQuestion.getQuestion();
        option1 = multipleQuestion.getOption1();
        option2 = multipleQuestion.getOption2();
        option3 = multipleQuestion.getOption3();
        option4 = multipleQuestion.getOption4();
        correctAnswer = multipleQuestion.getCorrectAnswer();
        
        questionJLabel.setText(questionNumber + ". " + question);
        radio1.setText(option1);
        radio2.setText(option2);
        radio3.setText(option3);
        radio4.setText(option4);
        
        mainMenuJButton.setVisible(false);
        submitJButton.setVisible(true);
        
//        image1Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage1Name())));
//        image2Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage2Name())));
//        image3Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage3Name())));
//        image4Label.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage4Name())));

        radio1.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage1Name())));
        radio2.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage2Name())));
        radio3.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage3Name())));
        radio4.setIcon(new ImageIcon( this.getClass().getResource(multipleQuestion.getImage4Name())));
        
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton glossaryJButton;
    private javax.swing.JButton mainMenuJButton;
    private javax.swing.ButtonGroup optionGroup;
    private javax.swing.JLabel questionJLabel;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
