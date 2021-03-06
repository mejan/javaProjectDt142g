/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikael Falck.
 * 
 * JPanel graphic base class.
 * Used to make the GUI for adding VAT
 * to the Mysql database. In this JPanel 
 * there is one add button, and three JTextFields 
 * plus 4 JLabels.
 * 
 * VATCounter use the class ContainerVATCounter for
 * Contain all the user input.
 * 
 */
public class VATCounter extends javax.swing.JPanel {

    /**
     * Creates new form VetCounter
     * 
     * This is the constructor and it starts by
     * calling the Generated Code by NetBeans from Design mode.
     * The constructor also creates a new object of the class
     * ContainerVATCounter.
     */
    public VATCounter() {
        initComponents();
        addSold = new ContainerVATCounter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prodLabel = new javax.swing.JLabel();
        prodTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceUnitLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        addSoldButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(148, 148, 148));

        prodLabel.setText("Produkt:");

        prodTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prodTextFieldFocusLost(evt);
            }
        });

        priceLabel.setText("Pris:");

        priceUnitLabel.setText("Kr");

        priceTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceTextFieldFocusLost(evt);
            }
        });

        dateLabel.setText("Datum den såldes:");

        dateTextField.setText("yyyy-mm-dd");
        dateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateTextFieldFocusLost(evt);
            }
        });

        addSoldButton.setText("Lägg till");
        addSoldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSoldButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prodLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceUnitLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(addSoldButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodLabel)
                    .addComponent(prodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceUnitLabel)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(addSoldButton)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void addSoldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSoldButtonActionPerformed
            if(addSold.allFilled()){
                if(surePopup(addSold.getDateOfSale(),addSold.getProduct(), addSold.getPrice())){
                    addSold.add();
                    addSold.resetFilled();
                    resetVATCounter();
                }
            }
    }//GEN-LAST:event_addSoldButtonActionPerformed

    private void prodTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prodTextFieldFocusLost
        String empty = "Du måste fylla i ett produktnamn.";
        
        if((prodTextField.getText().length() != 0) && !prodTextField.equals(empty)){
                addSold.setProduct(prodTextField.getText());
        }else{
            prodTextField.setText(empty);
        }
    }//GEN-LAST:event_prodTextFieldFocusLost

    private void priceTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTextFieldFocusLost
        String format = "Du kan bara skriva ett flyttta.";
        String empty = "Du måste skriva in ett pris.";
        
        if((priceTextField.getText().length() != 0) && !priceTextField.equals(empty)){
            try{
                double d = Double.parseDouble(priceTextField.getText());
                addSold.setPrice(d);
            } catch(NumberFormatException nfe){
                priceTextField.setText(format);
            }
        } else{
            priceTextField.setText(empty);
        }
    }//GEN-LAST:event_priceTextFieldFocusLost

    private void dateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateTextFieldFocusLost
        String format = "yyyy-mm-dd";
        String empty = "Du måste fylla i ett datum.";
        
        if((dateTextField.getText().length() != 0) && !dateTextField.equals(empty)){
            if(!dateTextField.equals(format) && addSold.setDate(dateTextField.getText())){
                System.out.println("Date is set");
            }else{
                dateTextField.setText(format);
            }
        } else{
            dateTextField.setText(empty);
        }
    }//GEN-LAST:event_dateTextFieldFocusLost

    private void resetVATCounter(){
        priceTextField.setText("");
        prodTextField.setText("");
        dateTextField.setText("yyyy-mm-dd");
   }
    
    private boolean surePopup(Date da, String pro, double price){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        int tmp =  JOptionPane.showConfirmDialog(null,
            "Är du säker på att du vill lägga till "+ pro + " för " + Double.toString(price) + " kr som var sålt " + formatter.format(da) + "."
            , "Please select",
            JOptionPane.YES_NO_OPTION);
        if(tmp == 0)
            return true;
        else
            return false;
    }
    
    private final ContainerVATCounter addSold;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSoldButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel priceUnitLabel;
    private javax.swing.JLabel prodLabel;
    private javax.swing.JTextField prodTextField;
    // End of variables declaration//GEN-END:variables
}
