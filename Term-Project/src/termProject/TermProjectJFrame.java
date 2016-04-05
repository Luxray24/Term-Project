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
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Swarner, Georgia Snelling
 */
public class TermProjectJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TermProjectJFrame
     */
    
    public Quiz quiz;
    
    public int points = 0;
    
    
    
    public TermProjectJFrame() {
        initComponents();
        //this.setLocationRelativeTo(null);
        //quiz = new Quiz();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        gamePanel = new javax.swing.JPanel();
        articButton = new javax.swing.JButton();
        marineButton = new javax.swing.JButton();
        rainforestButton = new javax.swing.JButton();
        grasslandButton = new javax.swing.JButton();
        freshwaterButton = new javax.swing.JButton();
        pointsLabel = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gamePanel.setLayout(null);

        articButton.setText("Artic Ecosystem");
        articButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articButtonActionPerformed(evt);
            }
        });
        gamePanel.add(articButton);
        articButton.setBounds(570, 30, 180, 80);

        marineButton.setText("Marine Ecosystem");
        marineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marineButtonActionPerformed(evt);
            }
        });
        gamePanel.add(marineButton);
        marineButton.setBounds(1110, 300, 170, 90);

        rainforestButton.setText("Rainforest Ecosystem");
        rainforestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rainforestButtonActionPerformed(evt);
            }
        });
        gamePanel.add(rainforestButton);
        rainforestButton.setBounds(240, 490, 200, 50);

        grasslandButton.setText("Grassland Ecosystem");
        grasslandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grasslandButtonActionPerformed(evt);
            }
        });
        gamePanel.add(grasslandButton);
        grasslandButton.setBounds(550, 370, 160, 50);

        freshwaterButton.setText("Freshwater Ecosystem");
        freshwaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshwaterButtonActionPerformed(evt);
            }
        });
        gamePanel.add(freshwaterButton);
        freshwaterButton.setBounds(130, 190, 210, 50);

        pointsLabel.setBackground(new java.awt.Color(0, 0, 0));
        pointsLabel.setFont(new java.awt.Font("Tahoma", 0, 42)); // NOI18N
        pointsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pointsLabel.setText("0 Points");
        gamePanel.add(pointsLabel);
        pointsLabel.setBounds(1100, 130, 210, 110);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Map.jpg"))); // NOI18N
        gamePanel.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1300, 990);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1303, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void articButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articButtonActionPerformed
        // TODO add your handling code here:
        String fileName = "/data/Artic.txt";
        
        ArrayList<DragImage> articDrag = new ArrayList<DragImage>();
        DragImage artic = null;
        
        try {
            InputStreamReader isr = new InputStreamReader(
                    this.getClass().getResourceAsStream(fileName));
            BufferedReader br = new BufferedReader(isr);
            while (true) {
                String comment = br.readLine();
                if (comment == null) {
                    break;
                }
                
                int initialPlace = Integer.parseInt(br.readLine());
                String animalName = br.readLine();
                String pictureFileName = br.readLine();
                int imageOrder = Integer.parseInt(br.readLine());
                int actualNameInThatPlace = Integer.parseInt(br.readLine());
                
                DragImage newDrag = new DragImage(initialPlace, animalName, pictureFileName, imageOrder, actualNameInThatPlace);
                articDrag.add(newDrag);
            }
        } catch (IOException e) {

        }
        
        artic = articDrag.get(0);
                
        new DragDrop(articDrag, artic).setVisible(true);
        
        articButton.setEnabled(false);
        
        points += 20;
        pointsLabel.setText(points + " Points");
        hasGameWon(points);
    }//GEN-LAST:event_articButtonActionPerformed

    private void marineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marineButtonActionPerformed
        // TODO add your handling code here:
        String fileName = "/data/Marine.txt";
        
        ArrayList<DragImage> marineDrag = new ArrayList<DragImage>();
        DragImage marine = null;
        
        try {
            InputStreamReader isr = new InputStreamReader(
                    this.getClass().getResourceAsStream(fileName));
            BufferedReader br = new BufferedReader(isr);
            while (true) {
                String comment = br.readLine();
                if (comment == null) {
                    break;
                }
                
                int initialPlace = Integer.parseInt(br.readLine());
                String animalName = br.readLine();
                String pictureFileName = br.readLine();
                int imageOrder = Integer.parseInt(br.readLine());
                int actualNameInThatPlace = Integer.parseInt(br.readLine());
                
                DragImage newDrag = new DragImage(initialPlace, animalName, pictureFileName, imageOrder, actualNameInThatPlace);
                marineDrag.add(newDrag);
            }
        } catch (IOException e) {

        }
        
        marine = marineDrag.get(0);
                
        new DragDrop(marineDrag, marine).setVisible(true);
        
        marineButton.setEnabled(false);
        
        points += 20;
        pointsLabel.setText(points + " Points");
        hasGameWon(points);
    }//GEN-LAST:event_marineButtonActionPerformed

    private void rainforestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rainforestButtonActionPerformed
        // TODO add your handling code here:
        String fileName = "/data/Rainforest.txt";
        
        ArrayList<DragImage> rainforestDrag = new ArrayList<DragImage>();
        DragImage rainforest = null;
        
        try {
            InputStreamReader isr = new InputStreamReader(
                    this.getClass().getResourceAsStream(fileName));
            BufferedReader br = new BufferedReader(isr);
            while (true) {
                String comment = br.readLine();
                if (comment == null) {
                    break;
                }
                
                int initialPlace = Integer.parseInt(br.readLine());
                String animalName = br.readLine();
                String pictureFileName = br.readLine();
                int imageOrder = Integer.parseInt(br.readLine());
                int actualNameInThatPlace = Integer.parseInt(br.readLine());
                
                DragImage newDrag = new DragImage(initialPlace, animalName, pictureFileName, imageOrder, actualNameInThatPlace);
                rainforestDrag.add(newDrag);
            }
        } catch (IOException e) {

        }
        
        rainforest = rainforestDrag.get(0);
                
        new DragDrop(rainforestDrag, rainforest).setVisible(true);
        
        rainforestButton.setEnabled(false);
        
        points += 20;
        pointsLabel.setText(points + " Points");
        hasGameWon(points);
    }//GEN-LAST:event_rainforestButtonActionPerformed

    private void grasslandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grasslandButtonActionPerformed
        // Multiple Choice Questions
        String fileName = "/data/Grasslands.txt";
        String file = "/images/Africa.jpg";
        
        ArrayList<Question> grasslandQuestions = new ArrayList<Question>();
        Question grassland = null;
        
        try {
            InputStreamReader isr = new InputStreamReader(
                    this.getClass().getResourceAsStream(fileName));
            BufferedReader br = new BufferedReader(isr);
            while (true)
            {
                String comment = br.readLine();
                if (comment == null) {
                    break;
                }
                int questionNumber = Integer.parseInt(br.readLine());
                String question = br.readLine();
                String option1 = br.readLine();
                String option2 = br.readLine();
                String option3 = br.readLine();
                String option4 = br.readLine();
                String correctAnswer = br.readLine();
                
                Question newQuestion = new Question(questionNumber, question, option1, option2, option3, option4, correctAnswer);
                grasslandQuestions.add(newQuestion);
            }
        } 
        catch (IOException e) {

        }
        
        grassland = grasslandQuestions.get(0);
        
        new Quiz(grasslandQuestions, grassland, file).setVisible(true);
        
        grasslandButton.setEnabled(false);
        
        points += 20;
        pointsLabel.setText(points + " Points");
        hasGameWon(points);
    }//GEN-LAST:event_grasslandButtonActionPerformed

    private void freshwaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshwaterButtonActionPerformed
        // Multiple Choice Questions
        String fileName = "/data/Freshwater.txt";
        String imageSRC = "/images/Freshwater.jpg";
        
        ArrayList<Question> freshwaterQuestions = new ArrayList<Question>();
        Question freshwater = null;
        
        //importQuestionFiles(filename, grasslandQuestions);
        
        try {
            InputStreamReader isr = new InputStreamReader(
                    this.getClass().getResourceAsStream(fileName));
            BufferedReader br = new BufferedReader(isr);
            while (true)
            {
                String comment = br.readLine();
                if (comment == null) {
                    break;
                }
                int questionNumber = Integer.parseInt(br.readLine());
                String question = br.readLine();
                String option1 = br.readLine();
                String option2 = br.readLine();
                String option3 = br.readLine();
                String option4 = br.readLine();
                String correctAnswer = br.readLine();
                
                Question newQuestion = new Question(questionNumber, question, option1, option2, option3, option4, correctAnswer);
                freshwaterQuestions.add(newQuestion);
            }
        } 
        catch (IOException e) {

        }
        
        freshwater = freshwaterQuestions.get(0);
        
        new Quiz(freshwaterQuestions, freshwater, imageSRC).setVisible(true);
        
        freshwaterButton.setEnabled(false);
        
        points += 20;
        pointsLabel.setText(points + " Points");
        
        hasGameWon(points);
    }//GEN-LAST:event_freshwaterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TermProjectJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermProjectJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermProjectJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermProjectJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TermProjectJFrame().setVisible(true);
            }
        });
        
               
    }
    
    public void hasGameWon(int points)
    {
        if (points == 100)
        {
            int choice = JOptionPane.showConfirmDialog(this, "Congrats!  You have won the game!  Would you like to play again?", "Yay! You won!", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) //If players choose to play again
            {
                points = 0;
                pointsLabel.setText(points + " Points");
                rainforestButton.setEnabled(true);
                articButton.setEnabled(true);
                marineButton.setEnabled(true);
                grasslandButton.setEnabled(true);
                freshwaterButton.setEnabled(true);
            }
            else //Exit game with another game
                System.exit(1);
        }
    }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton articButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton freshwaterButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton grasslandButton;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton marineButton;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JButton rainforestButton;
    // End of variables declaration//GEN-END:variables
}
