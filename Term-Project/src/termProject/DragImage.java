/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termProject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.RepaintManager;

/**
 *
 * @author Georgia Snelling
 */
public class DragImage {
    
  static int imageWidth = 60, imageHeight = 60;
  int imageX, imageY;
  
  private int place;
  private String name;
  private String imageSRC;
  private int orderNumber;
  private int actualAnimal;

  Image image;

  public DragImage(int place, String name, String imageSRC, int orderNumber, int actualAnimal) {
    
    this.place = place;
    this.name = name;
    this.imageSRC = imageSRC;
    this.orderNumber = orderNumber;
    this.actualAnimal = actualAnimal;

    //image = i;
    //addMouseMotionListener(this);
  }
  
  public int getInitialPlace()
  {
      return place;
  }
  
  public String getImageName()
  {
      return name;
  }
  
  public String getImageFileName()
  {
      return imageSRC;
  }
  
  public int getorderNumber()
  {
      return orderNumber;
  }
  
  public int getActualAnimal()
  {
      return actualAnimal;
  }
  
  public ImageIcon getIcon()
  {
      ImageIcon image = new ImageIcon( this.getClass().getResource(imageSRC) );
      return image;
  }
}
//
//  public void mouseDragged(MouseEvent e) {
//    imageX = e.getX();
//    imageY = e.getY();
//    //repaint();
//  }
//
//  public void mouseMoved(MouseEvent e) {
//  }
//
//  public void paint(Graphics g) {
//    Graphics2D g2 = (Graphics2D) g;
//
//    //g2.drawImage(image, imageX, imageY, this);
//  }
//
//  public static void main(String[] args) {
//    String imageFile = "A.jpg";
//    // Turn off double buffering
//    RepaintManager.currentManager(null).setDoubleBufferingEnabled(false);
//
//    Image image = Toolkit.getDefaultToolkit().getImage(DragImage.class.getResource(imageFile));
//    image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
//    JFrame frame = new JFrame("DragImage");
//    
//    //frame.getContentPane().add(new DragImage(String name, String imageSRC, int orderNumber));
//   // frame.setSize(300, 300);
//    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    //frame.setVisible(true);
//  }
//
//}
