/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startpage;

import ejb.ConsultationListRemote;
import entities.Consultation;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.DefaultListModel;

/**
 *
 * @author Edvin
 */
public class SelectConsultation extends javax.swing.JPanel {

    /**
     * Creates new form SelectConsultation
     */
    private List<Consultation> consultationList = lookupConsultationListRemote().getConsultationByAccepted(true);
    public SelectConsultation() {
        initComponents();
        informationLabel.setVisible(false);
        DefaultListModel listModel = new DefaultListModel();
        
            for(Consultation con : consultationList) {
                listModel.addElement(con.getCustomerID().getName() + " " + con.getCustomerID().getLastName());
                    
                
            }
            selectConsultationList.setModel(listModel);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectConsultationList = new javax.swing.JList();
        nextButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        informationLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 521));

        chooseText.setText("Välj vilken konsultation du vill skapa ett ärende från:");

        selectConsultationList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(selectConsultationList);

        nextButton.setText("Nästa");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Tillbaka");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        informationLabel.setForeground(new java.awt.Color(255, 0, 0));
        informationLabel.setText("Välj en konsultation i listan för att skapa nytt ärende");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chooseText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nextButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(goBackButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(informationLabel))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chooseText)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(goBackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informationLabel)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
         if(selectConsultationList.isSelectionEmpty()){
            //informationLabel.setVisible(true);
            return;
        }
        Consultation con= consultationList.get(selectConsultationList.getAnchorSelectionIndex());
        System.out.println(con.getCustomerID().getName());
        
          //  this.setVisible(false);
        NewReparation rep = new NewReparation(con);
         
        removeAll();
        setLayout(new BorderLayout());
        add(rep, BorderLayout.CENTER);
        validate();
        repaint();// TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        Schedule schema = new Schedule();
        
        removeAll();
        setLayout(new BorderLayout());
        add(schema, BorderLayout.CENTER);
       
        validate();
        repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_goBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseText;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JList selectConsultationList;
    // End of variables declaration//GEN-END:variables

    private ConsultationListRemote lookupConsultationListRemote() {
        try {
            Context c = new InitialContext();
            return (ConsultationListRemote) c.lookup("java:comp/env/ConsultationList");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
