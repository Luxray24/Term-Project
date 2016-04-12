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
    
      //All the factors of the Drag Drop JFrame/objects  
      private int place;
      private String name;
      private String imageSRC;
      private int orderNumber;
      private int actualAnimal;

      Image image;

      //Constructor of class, makes each object
      //Sets each private variable with the matching parameter
      public DragImage(int place, String name, String imageSRC, int orderNumber, int actualAnimal) {

        this.place = place;
        this.name = name;
        this.imageSRC = imageSRC;
        this.orderNumber = orderNumber;
        this.actualAnimal = actualAnimal;

      }

      /**
       * Gets the initial place of the image
       * @return place 
       */
      public int getInitialPlace()
      {
          return place;
      }

      /**
       * Gets the name of the animal in the corresponding photo
       * @return name
       */
      public String getImageName()
      {
          return name;
      }

      /**
       * Gets the image file name 
       * @return image filename
       */
      public String getImageFileName()
      {
          return imageSRC;
      }

      /**
       * Gets the number the image is in order (1 through 4)
       * @return order number
       */
      public int getorderNumber()
      {
          return orderNumber;
      }

      /**
       * Gets the animal in the initial spot as the current image
       * @return actual animal in initial spot
       */
      public int getActualAnimal()
      {
          return actualAnimal;
      }

}