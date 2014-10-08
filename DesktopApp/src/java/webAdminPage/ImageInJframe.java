/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ludde
 */


class ImageImplement extends JPanel{
    private Image img;
    	  public ImageImplement(Image img) {
	    this.img = img;
	   Dimension size = new Dimension(0,0);
           // Dimension size = new Dimension(img.getWidth(null),img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
          
	    setSize(size);
	    setLayout(null);
            
	  }

    @Override
	  public void paintComponent(Graphics g) {
	    g.drawImage(img,0, 0, null);
            
	  }

	}








public class ImageInJframe extends JFrame{
    
    
    
    
    public static void main(String args[]){
        new ImageInJframe().start();
    }
    
    public void start(){
        ImageImplement panel = new ImageImplement(new ImageIcon("C:\\Users\\Ludde\\Dropbox\\Universitet\\civil\\3\\Applikationsuteckling i java\\Projekt\\1.jpg").getImage());
        add(panel);
        setVisible(true);
        setSize(190,190);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
