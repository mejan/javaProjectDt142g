/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.GuitarsListRemote;
import ejb.NewGuitarsRemote;
import java.io.IOException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.RollbackException;

/**
 *
 * @author antondahlin
 */
@Stateless
public class NewGuitars implements NewGuitarsRemote {
    @EJB
    private GuitarsListRemote guitarsList;
    
    private String name;
    private String description;
    private byte[] image;
    private String imagePath;
    private int price;
    private boolean sold;
    
    @Override
    public void add() throws IOException, RollbackException{  
            
            Guitars guitar = new Guitars();
            guitar.setName(name);
            guitar.setDescription(description);
            guitar.setPrice(price);
            guitar.setSold(sold);
            guitar.setImage(image);
            guitar.setImagePath(imagePath);
        try{    
            guitarsList.addGuitar(guitar);
        }catch(RollbackException e){
            System.err.println("RollBackException: " + e.getMessage());
        }
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    public byte[] getImage() {
        return image;
    }
    
    @Override
    public void setImage(byte[] image) {
        this.image = image;
    }
    
    public int getPrice() {
        return price;
    }
    
    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    
    public boolean isSold() {
        return sold;
    }
    
    @Override
    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}