/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

import java.awt.Container;
import java.awt.Point;
import javax.swing.JFrame;

/**
 *
 * @author Ludde
 */
public class WindowDrag {
    Point startclick;
    
    
    public void moveWindow(java.awt.event.MouseEvent evt,Container a){
              
        int xcord= a.getLocation().x;
       int ycord= a.getLocation().y;
       
       int xmove=(xcord+evt.getX())-(xcord+startclick.x);
         int ymove=(ycord+evt.getY())-(ycord+startclick.y);
         
         int X = xcord + xmove;
            int Y = ycord + ymove;
            a.setLocation(X, Y);
    }
    
    public void getMousepos(java.awt.event.MouseEvent evt,Container a){
        startclick = evt.getPoint();
            a.getComponentAt(startclick);
    }
}
