/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;

import javax.swing.JTextField;

/**
 *
 * @author mejan
 */
public class VATCounterReader extends javax.swing.JPanel {

    /**
     * Creates new form VetCounterReader
     */
    public VATCounterReader() {
        getPaid = new ContainerVATCounterReader();
        initComponents();
        gotPaidTextField.setEditable(false);
        vatIsTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromDateLabel = new javax.swing.JLabel();
        toDateLabel = new javax.swing.JLabel();
        fromDateTextField = new javax.swing.JTextField();
        toDateTextField = new javax.swing.JTextField();
        gotPaidLabel = new javax.swing.JLabel();
        gotPaidTextField = new javax.swing.JTextField();
        valueUnitLabelOne = new javax.swing.JLabel();
        vatIsProcsLabel = new javax.swing.JLabel();
        valueUnitLabelTwo = new javax.swing.JLabel();
        vatIsTextField = new javax.swing.JTextField();
        getButton = new javax.swing.JButton();
        dateErrorLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(148, 148, 148));
        setMaximumSize(new java.awt.Dimension(350, 342));
        setMinimumSize(new java.awt.Dimension(350, 342));

        fromDateLabel.setText("Från datum");

        toDateLabel.setText("Till datum");

        fromDateTextField.setText("yyyy-mm-dd");
        fromDateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fromDateTextFieldFocusLost(evt);
            }
        });

        toDateTextField.setText("yyyy-mm-dd");
        toDateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                toDateTextFieldFocusLost(evt);
            }
        });

        gotPaidLabel.setText("Tog betalt:");

        valueUnitLabelOne.setText("kr");

        vatIsProcsLabel.setText("varav moms:");

        valueUnitLabelTwo.setText("kr");

        getButton.setText("Hämta");
        getButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getButtonActionPerformed(evt);
            }
        });

        dateErrorLabel.setForeground(new java.awt.Color(167, 6, 6));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromDateLabel)
                            .addComponent(fromDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toDateLabel)
                            .addComponent(toDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gotPaidLabel)
                            .addComponent(vatIsProcsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gotPaidTextField)
                                    .addComponent(vatIsTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valueUnitLabelTwo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(valueUnitLabelOne, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDateLabel)
                    .addComponent(toDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gotPaidLabel)
                    .addComponent(gotPaidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueUnitLabelOne))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vatIsProcsLabel)
                    .addComponent(valueUnitLabelTwo)
                    .addComponent(vatIsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getButtonActionPerformed
        // TODO add your handling code here:
        if(getPaid.allFilled()){
            if(getPaid.correctOrderOfDate()){
                gotPaidTextField.setText(String.valueOf(getPaid.getTotalSold()));
                vatIsTextField.setText(String.valueOf(getPaid.getVATTotal()));
                getPaid.resetFilled();
            }else{
                dateErrorLabel.setText("Ogiltig kombination av datum.");
            }
        }
    }//GEN-LAST:event_getButtonActionPerformed

    private void toDateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toDateTextFieldFocusLost
        // TODO add your handling code here:
        setDateTextField(toDateTextField);
    }//GEN-LAST:event_toDateTextFieldFocusLost

    private void fromDateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fromDateTextFieldFocusLost
        // TODO add your handling code here:
        setDateTextField(fromDateTextField);
    }//GEN-LAST:event_fromDateTextFieldFocusLost

    private void setDateTextField(JTextField tx){
        boolean tmp = false;
        
        if((tx.getText().length() != 0) && !tx.equals(empty)){
            if(!tx.equals(format)){
                if(tx == fromDateTextField){
                    tmp = getPaid.setFromDate(tx.getText());
                } else if(tx == toDateTextField){
                    tmp = getPaid.setToDate(tx.getText());
                }
            }else{
                tx.setText(format);
            }
        } else{
            tx.setText(empty);
        }
        
        if(tmp){
            System.out.println("Date is set");
        } else{
            tx.setText(format);
        }
    }
    
    private ContainerVATCounterReader getPaid;
    private static final String empty="Du måste sätta ett datum här";
    private static final String format = "yyyy-mm-dd";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateErrorLabel;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JTextField fromDateTextField;
    private javax.swing.JButton getButton;
    private javax.swing.JLabel gotPaidLabel;
    private javax.swing.JTextField gotPaidTextField;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JTextField toDateTextField;
    private javax.swing.JLabel valueUnitLabelOne;
    private javax.swing.JLabel valueUnitLabelTwo;
    private javax.swing.JLabel vatIsProcsLabel;
    private javax.swing.JTextField vatIsTextField;
    // End of variables declaration//GEN-END:variables
}
