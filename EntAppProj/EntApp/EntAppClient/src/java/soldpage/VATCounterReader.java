/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;

/**
 *
 * @author mejan
 */
public class VATCounterReader extends javax.swing.JPanel {

    /**
     * Creates new form VetCounterReader
     */
    public VATCounterReader() {
        initComponents();
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
        vetProcsLabel = new javax.swing.JLabel();
        valueUnitLabelTwo = new javax.swing.JLabel();
        vetProcsTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(148, 148, 148));
        setMaximumSize(new java.awt.Dimension(350, 342));
        setMinimumSize(new java.awt.Dimension(350, 342));

        fromDateLabel.setText("Från datum");

        toDateLabel.setText("Till datum");

        fromDateTextField.setText("yyyy-mm-dd");

        toDateTextField.setText("yyyy-mm-dd");

        gotPaidLabel.setText("Tog betalt:");

        valueUnitLabelOne.setText("kr");

        vetProcsLabel.setText("varav moms:");

        valueUnitLabelTwo.setText("kr");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(vetProcsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gotPaidTextField)
                            .addComponent(vetProcsTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueUnitLabelTwo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(valueUnitLabelOne, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gotPaidLabel)
                    .addComponent(gotPaidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueUnitLabelOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vetProcsLabel)
                    .addComponent(valueUnitLabelTwo)
                    .addComponent(vetProcsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JTextField fromDateTextField;
    private javax.swing.JLabel gotPaidLabel;
    private javax.swing.JTextField gotPaidTextField;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JTextField toDateTextField;
    private javax.swing.JLabel valueUnitLabelOne;
    private javax.swing.JLabel valueUnitLabelTwo;
    private javax.swing.JLabel vetProcsLabel;
    private javax.swing.JTextField vetProcsTextField;
    // End of variables declaration//GEN-END:variables
}