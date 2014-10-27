/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

/**
 *
 * @author mejan
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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
       homeButton = new javax.swing.JButton();
        vetButton = new javax.swing.JButton();
        webAdminButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 153));

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopapp/home.png"))); // NOI18N

        vetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopapp/vet.png"))); // NOI18N

        webAdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopapp/webAdmin.png"))); // NOI18N
        webAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webAdminButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.setPreferredSize(new java.awt.Dimension(63, 39));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeButton)
                .addGap(50, 50, 50)
                .addComponent(vetButton)
                .addGap(51, 51, 51)
                .addComponent(webAdminButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(webAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void webAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webAdminButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_webAdminButtonActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton homeButton;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton vetButton;
    public javax.swing.JButton webAdminButton;
    // End of variables declaration//GEN-END:variables
}