/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.RollbackException;
import se.miun.projectjava.entitys.Guitars;

/**
 *
 * @author Robin
 */
@Named
@Stateless
public class NewGuitar {
    
    @EJB
    private GuitarList guitarList;
    
    private String name;
    private int price;
    private String description;
    private boolean sold;
    private final String defaultPath="guitars/";
    private String filepath;//<--- behöver lösa denna del asap
    
    /**
     *
     * @throws RollbackException
     * adds a guitar to the database with a default filepath + name of the file in the directory(supposed to)
     * and with appropriate data
     */
    public void add() throws RollbackException{
        Guitars guitars = new Guitars();
        
        guitars.setName(name);
        guitars.setDescription(description);
        guitars.setImagePath(defaultPath+filepath);
        guitars.setPrice(price);
        guitars.setSold(sold);
        
        try{
            guitarList.addGuitar(guitars);
        }catch(RollbackException e){
            System.err.println("RollBackException: " + e.getMessage());
        }
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSold() {
        return sold;
    }

    public String getFilepath() {
        return filepath;
    }
}
