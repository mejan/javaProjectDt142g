/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webAdminPage;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Ludde
 */
public class PicBox extends javax.swing.JPanel {

    /**
     * Creates new form PicBox
     */
    public PicBox() {
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

        picLabel1 = new javax.swing.JLabel();
        picText1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(248, 248, 248));

        picLabel1.setBackground(new java.awt.Color(248, 248, 248));
        picLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        picText1.setText("Bild 1");
        picText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picText1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picText1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(picText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void picText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picText1ActionPerformed
        
       this.setSelect();
        
        
    }//GEN-LAST:event_picText1ActionPerformed

    private void setSelect() {
        for(int i=0; i<webbadmin.pics.length; i++){
            if(webbadmin.pics[i].picText1 != this.picText1){
                webbadmin.pics[i].picText1.setSelected(false);
            }
        }
    }
    
    public ImageIcon getPic(){
    
    return picture;
}

      public JLabel getPicLabel(){
        return picLabel1;
    }
    
public JCheckBox getCheckBox(){
    
    return picText1;
}

public String getDesc(){
    return desc;
}

public String getPicName(){
    
    return picText1.getText();
}


   public void setAdminWindow(WebbAdmin master) {
       webbadmin = master;
   } 
public String getPrice(){
    return price;
}

public Boolean getSold(){
    return isSold;
}

public byte[] getImgDb(){
    return imgDB;
}

public String getImgPath(){
    return imgPath;
}

public void setInfo(ImageIcon a,String b,String c,boolean d,String e, Boolean issold,byte [] imgdb, String imgpath){
    picture=a;
    desc=c;
    picLabel1.setIcon(a);
    picText1.setText(b);
    status=d;
    price=e;
    isSold=issold;
    imgDB = imgdb;
    imgPath=imgpath;
    
}

public void removeImage(){
    picLabel1.setIcon(null);
    picText1.setText(null);
    status = false;
    desc=null;
    price=null;
}

public boolean getCecked(){
    
    
    return status;
}

public void setChecked(boolean a){
    status=a;
}

public void sort(PicBox[] a){
    
   
    for(int j=0; j<a.length; j++){
    PicBox temp ;
            
    if(a[j].getCecked()!=true && j+1 < a.length){
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
    }

}
        
    
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel picLabel1;
    private javax.swing.JCheckBox picText1;
    // End of variables declaration//GEN-END:variables
 private ImageIcon picture;
 private String desc;
 private String price;
 boolean status;
 WebbAdmin webbadmin;
 Boolean isSold;
 byte[] imgDB;
 String imgPath;
 
}
