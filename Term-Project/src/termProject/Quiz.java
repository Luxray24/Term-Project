/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

    TermProjectJFrame mainFrame;
    Question questions;

    public Quiz(ArrayList array, Question objQuestion, String imageName) {
        initComponents();
        //groupButton();
        //questions = new Question();
        this.setLocationRelativeTo(null);
        mainMenuJButton.setVisible(false);
        nextJButton.setVisible(false);
        
        multipleQuestionsArray = array;
        multipleQuestion = objQuestion;
        
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
        
        ImageIcon roomImage;
        roomImage = new ImageIcon( this.getClass().getResource(imageName) );
        imageLabel.setIcon(roomImage);
        
        
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
        nextJButton = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(864, 439));

        questionJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        questionJLabel.setText("Which of the following is a Consumer?");

        optionGroup.add(radio1);
        radio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radio1.setText("Ficus");

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

        nextJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nextJButton.setText("Next >>");
        nextJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJButtonActionPerformed(evt);
            }
        });

        imagePanel.setMaximumSize(new java.awt.Dimension(529, 416));
        imagePanel.setMinimumSize(new java.awt.Dimension(529, 416));
        imagePanel.setLayout(null);
        imagePanel.add(imageLabel);
        imageLabel.setBounds(0, 0, 580, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainMenuJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio4)
                            .addComponent(radio3)
                            .addComponent(questionJLabel)
                            .addComponent(radio2)
                            .addComponent(radio1))))
                .addGap(18, 18, 18)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(questionJLabel)
                .addGap(26, 26, 26)
                .addComponent(radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio4)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(mainMenuJButton)
                    .addComponent(nextJButton))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
             
        if (radio1.isSelected()) 
        {
            if (option1.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== 3)
                {
                    mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(false);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Congrats!  You got it right!");
                    //mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(true);
                    submitJButton.setVisible(false);
                }
            }
            else
            {
                radio1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Oops.  Looks like that wasn't it.  Please try again.");
            }
        }
        else if (radio2.isSelected()) 
        {
            if (option2.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== 3)
                {
                    mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(false);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Congrats!  You got it right!");
                    //mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(true);
                    submitJButton.setVisible(false);
                }
            }
             else
            {
                radio2.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Oops.  Looks like that wasn't it.  Please try again.");
            }
        }
        else if (radio3.isSelected()) 
        {
            if (option3.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== 3)
                {
                    mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(false);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Congrats!  You got it right!");
                    //mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(true);
                    submitJButton.setVisible(false);
                }
            }
             else
            {
                radio3.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Oops.  Looks like that wasn't it.  Please try again.");
            }
        }
        else if (radio4.isSelected()) 
        {
            if (option4.equals(correctAnswer))
            {
                if (multipleQuestion.getQuestionNumber()== 3)
                {
                    mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(false);
                    submitJButton.setEnabled(false);
                    radio1.setEnabled(false);
                    radio2.setEnabled(false);
                    radio3.setEnabled(false);
                    radio4.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Congrats!  You got through all the questions!  Go back to the Main Map to choose another game!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Congrats!  You got it right!");
                    //mainMenuJButton.setVisible(true);
                    nextJButton.setVisible(true);
                    submitJButton.setVisible(false);
                }
            }
             else
            {
                radio4.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Oops.  Looks like that wasn't it.  Please try again.");
            }
        }
        
                
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void mainMenuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuJButtonActionPerformed
        
        this.setVisible(false);
                
    }//GEN-LAST:event_mainMenuJButtonActionPerformed

    private void nextJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJButtonActionPerformed
        
        radio1.setEnabled(true);
        radio2.setEnabled(true);
        radio3.setEnabled(true);
        radio4.setEnabled(true);
        
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
        nextJButton.setVisible(false);
        submitJButton.setVisible(true);
        
    }//GEN-LAST:event_nextJButtonActionPerformed

    
   

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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton mainMenuJButton;
    private javax.swing.JButton nextJButton;
    private javax.swing.ButtonGroup optionGroup;
    private javax.swing.JLabel questionJLabel;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
