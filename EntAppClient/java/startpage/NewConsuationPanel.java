package startpage;

import ejb.ConsultationListRemote;
import entities.Consultation;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edvin
 */
public class NewConsuationPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewConsuationPanel
     */
    public NewConsuationPanel() {
        initComponents();
    }
    public void setText(String text){
        descriptionArea.setText(text);
    }
    private Consultation consultation;

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

   public Consultation getConsultation() {
        return consultation;
   }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        acceptButton = new javax.swing.JButton();
        dontAcceptButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 521));

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane1.setViewportView(descriptionArea);

        add(jScrollPane1);

        acceptButton.setText("Acceptera");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        add(acceptButton);

        dontAcceptButton.setText("Acceptera inte");
        dontAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontAcceptButtonActionPerformed(evt);
            }
        });
        add(dontAcceptButton);
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        setVisible(false);// TODO add your handling code here:
        consultation.setAccepted(true);
        lookupConsultationListRemote().updateConsultation(consultation);
        
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void dontAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontAcceptButtonActionPerformed
        setVisible(false);// TODO add your handling code here:
        lookupConsultationListRemote().removeConsultation(consultation);
        //lookupConsultationListRemote().updateConsultation(consultation);// TODO add your handling code here:
    }//GEN-LAST:event_dontAcceptButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JButton dontAcceptButton;
    private javax.swing.JScrollPane jScrollPane1;
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