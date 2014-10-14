/* 
* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import soldpage.SoldPage;
import startpage.Schedule;
import webAdminPage.WebbAdmin;

/**
 *
 * @author mejan
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        //set the private varible to objects.
        fPage = new Schedule();
        sPage = new SoldPage();
        tPage = new WebbAdmin();
        add(fPage, BorderLayout.WEST);
        pack();
        
        //action listener for main menu.
        mainMenu1.homeButton.addActionListener(this);
        mainMenu1.vetButton.addActionListener(this);
        mainMenu1.webAdminButton.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu1 = new desktopapp.MainMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(mainMenu1, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static Schedule fPage;
    private static SoldPage sPage;
    private static WebbAdmin tPage;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private desktopapp.MainMenu mainMenu1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mainMenu1.homeButton){
            //this.get
            remove(sPage);
            remove(tPage);
            add(fPage,BorderLayout.WEST);
            pack();
        } else if(e.getSource() == mainMenu1.vetButton){
            remove(fPage);
            remove(tPage);
            add(sPage,BorderLayout.WEST);
            pack();
        } else if(e.getSource() == mainMenu1.webAdminButton){
            remove(sPage);
            remove(fPage);
            add(tPage,BorderLayout.WEST);
            pack();
            
        }
    }
}