/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startpage;

import ejb.ConsultationListRemote;
import ejb.NewReparationsRemote;
import ejb.ReparationsListRemote;
import entities.Consultation;
import entities.Reparations;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Edvin
 */
public class NewReparation extends javax.swing.JPanel {

    /**
     * Creates new form NyttArende
     */
    private Reparations reparation;
    private Consultation consultation;
    public NewReparation(Consultation con) {
        consultation=con;
        initComponents();
        //System.out.println(consultation.getCustomerID().getName());
        Integer hej = consultation.getConsultationID();
        repIdLabel.setText(hej.toString());
        customerNameLabel.setText(consultation.getCustomerID().getLastName() + " " + consultation.getCustomerID().getName() );
        descriptionArea.setText(consultation.getDescription());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String datestring = dateFormat.format(d); 
        
        informationLabel.setVisible(false);
    }
    //private boolean isEmpty(){
      //  if(repIdLabel.)
    //}
    private boolean isInt(String s){
        if(s.isEmpty()){
                return false;
            }
        for(int i =0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(!(Character.isDigit(c))){
               return false; 
            }
            
            
        }
        System.out.println("är int");
        return true;
        
    }
    
     private boolean isDate(String date){
        if(date.length()== 10){
            for(int i = 0; i<10; i++){
                char c = date.charAt(i);
                if((i==4 || i==7) && !(date.charAt(i)=='-')){
                    return false;
                }else if(!Character.isDigit(date.charAt(i)) && !(i==4 || i==7)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
 
    private Date makeDate(String tmpStr){
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date tmpDate = new Date();
        try{
            tmpDate = formatter.parse(tmpStr);
        } catch(ParseException e){
            e.printStackTrace();
        }
        return tmpDate;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        repIdLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hoursWorkedText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        informationLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 521));

        saveButton.setText("Spara");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Ärendenummer: ");

        jLabel2.setText("Kund:");

        repIdLabel.setText("jLabel8");

        customerNameLabel.setText("jLabel3");

        jLabel3.setText("Abetet har pågått i");

        jLabel5.setText("timmar");

        hoursWorkedText.setText("0");
        hoursWorkedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursWorkedTextActionPerformed(evt);
            }
        });

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane1.setViewportView(descriptionArea);

        jLabel7.setText("Beskrivning av ärendet");

        goBackButton.setText("Avbryt");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        informationLabel.setForeground(new java.awt.Color(255, 0, 0));
        informationLabel.setText("Fyll i all information för att kunna spara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goBackButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(repIdLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(informationLabel))
                                .addComponent(customerNameLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hoursWorkedText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(repIdLabel)
                    .addComponent(informationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(hoursWorkedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(goBackButton))
                .addContainerGap(421, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       lookupNewReparationsRemote1().setCustomerID(consultation.getCustomerID());
       System.out.println("Namn: " + consultation.getCustomerID().getName());
       if(isInt(hoursWorkedText.getText())){ 
           
            lookupNewReparationsRemote1().setHoursWorked(Integer.parseInt(hoursWorkedText.getText()));
            System.out.println("timmar lagt till");
       }
       else{
           System.out.println("avbryter 1");
          // informationLabel.setVisible(true);
          return;
       }
       
      
       
       if(descriptionArea.getText().isEmpty()){
           //informationLabel.setVisible(true);
           return;
       }
       Date d=new Date();
       
       lookupNewReparationsRemote1().setRecieved(d);
       lookupNewReparationsRemote1().setDone(d);
       lookupNewReparationsRemote1().setImagePath("default");
       lookupNewReparationsRemote1().setDescription(descriptionArea.getText());
       
       System.out.println("svart");
       lookupNewReparationsRemote1().add();
       lookupConsultationListRemote().removeConsultation(consultation);
       System.out.println("skalle");
       Schedule schema = new Schedule();
       
       removeAll();
       setLayout(new BorderLayout());
       add(schema, BorderLayout.CENTER);
       
       validate();
       repaint();// TODO add your handling code here:  
       
               
     
    }//GEN-LAST:event_saveButtonActionPerformed

    private void hoursWorkedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursWorkedTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursWorkedTextActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        Schedule schema = new Schedule();
       
        removeAll();
        setLayout(new BorderLayout());
        add(schema, BorderLayout.CENTER);
       
        validate();
        repaint();// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_goBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JButton goBackButton;
    private javax.swing.JTextField hoursWorkedText;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel repIdLabel;
    private javax.swing.JButton saveButton;
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

    /*private NewReparationsRemote lookupNewReparationsRemote1() {
        try {
            Context c = new InitialContext();
            return (NewReparationsRemote) c.lookup("java:comp/env/NewReparations");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }*/

    private ReparationsListRemote lookupReparationsListRemote() {
        try {
            Context c = new InitialContext();
            return (ReparationsListRemote) c.lookup("java:comp/env/ReparationsList");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private NewReparationsRemote lookupNewReparationsRemote1() {
        try {
            Context c = new InitialContext();
            return (NewReparationsRemote) c.lookup("java:comp/env/NewReparations");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    

 
}
