/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startpage;

import ejb.ConsultationListRemote;
import entities.Consultation;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class NewConsultation extends javax.swing.JPanel {
List<Consultation> consultationList = lookupConsultationListRemote().getConsultationByAccepted(false);
Consultation consultation;
DefaultListModel listModel = new DefaultListModel();
    /**
     * Creates new form NewConsultation
     */
    public NewConsultation() {
        initComponents();
        
        
            for(Consultation con : consultationList) {
                System.out.println(con.getDescription());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date d =con.getDate();
                String datestring = dateFormat.format(d);
                
               
                listModel.addElement(datestring + ", " + con.getCustomerID().getName() + " " + con.getCustomerID().getLastName() + ", " + con.getTimeInterval());
                    
                
            }
            selectConsultationList.setModel(listModel);
            
        //int i = 0;
        //NewConsuationPanel [] ncp = new NewConsuationPanel [100]; 
        
        /*for(Consultation keso : kes) {
            
            ncp[i]=new NewConsuationPanel(); 
            ncp[i].setText(keso.getDescription());
            ncp[i].setConsultation(keso);
            //setLayout(new BorderLayout());
            add(ncp[i]);
            
            //ncp[i].setVisible(true);
            i++;
            System.out.println(i);
        }
        
        //this.updateUI();*/
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goBackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectConsultationList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripionArea = new javax.swing.JTextArea();
        acceptButton = new javax.swing.JButton();
        dontAcceptButton = new javax.swing.JButton();

        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(700, 521));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        goBackButton.setText("Tillbaka");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        selectConsultationList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        selectConsultationList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectConsultationListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(selectConsultationList);

        descripionArea.setColumns(20);
        descripionArea.setRows(5);
        jScrollPane2.setViewportView(descripionArea);

        acceptButton.setText("Acceptera");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        dontAcceptButton.setText("Acceptera inte");
        dontAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontAcceptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goBackButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dontAcceptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(acceptButton)
                    .addComponent(dontAcceptButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        Schedule schema = new Schedule();
       
        removeAll();
        setLayout(new BorderLayout());
        add(schema, BorderLayout.CENTER);
       
        validate();
        repaint();// TODO add your handling code here:
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        int i=selectConsultationList.getSelectedIndex();
        if(i>=0){
            System.out.println(i + " : i acceptbutton");
            consultation=consultationList.get(i);
            listModel.remove(i);
            selectConsultationList.setModel(listModel);
        
            consultation.setAccepted(true);
            lookupConsultationListRemote().updateConsultation(consultation);
            consultationList = lookupConsultationListRemote().getConsultationByAccepted(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void dontAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontAcceptButtonActionPerformed
        int i=selectConsultationList.getSelectedIndex();
        if(i>=0){
            consultation=consultationList.get(i);
            listModel.remove(i);
            selectConsultationList.setModel(listModel);
            lookupConsultationListRemote().removeConsultation(consultation);
            consultationList = lookupConsultationListRemote().getConsultationByAccepted(false);
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_dontAcceptButtonActionPerformed

    private void selectConsultationListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectConsultationListValueChanged
        System.out.println(selectConsultationList.getAnchorSelectionIndex()); 
        System.out.println(consultationList.get(selectConsultationList.getAnchorSelectionIndex()).getDescription());
        String name = consultationList.get(selectConsultationList.getAnchorSelectionIndex()).getCustomerID().getName();
        String lastname = consultationList.get(selectConsultationList.getAnchorSelectionIndex()).getCustomerID().getLastName();
        String description = consultationList.get(selectConsultationList.getAnchorSelectionIndex()).getDescription();
        String phone = consultationList.get(selectConsultationList.getAnchorSelectionIndex()).getCustomerID().getPhoneNumber();
        String email = consultationList.get(selectConsultationList.getAnchorSelectionIndex()).getCustomerID().getEmail();
        descripionArea.setText(name + " " + lastname + "\n" + phone + "\n" + email + "\n" + "\n" + description);
    }//GEN-LAST:event_selectConsultationListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JTextArea descripionArea;
    private javax.swing.JButton dontAcceptButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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