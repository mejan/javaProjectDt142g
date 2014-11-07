/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;



import ejb.NewSoldItemRemote;
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
 * @author Mikael Falck.
 * 
 * The Main purpose of the class is to 
 * Contain input data and control it's
 * the right kind of data so it can use
 * for the database.
 */
public class ContainerVATCounter {
    /**
     * The main constructor for the class
     * it sets all the data members to
     * default values.
     */
    ContainerVATCounter(){
        con();
    }
 
    /**
    * The secondary constructor is used to set all the
    * main values right a way.
    * @param pro is to set the product name.
    * @param pri is to set the price on the product.
    * @param da is to set the date it was sold.
    */
    ContainerVATCounter(String pro, double pri, String da){
        con();
        setProduct(pro);
        setPrice(pri);
        setDate(da);
    }
    
    private void con(){
        proFilled=false;
        priFilled=false;
        daFilled=false;
        product="";
        price=0;
    }
    
    /**
     *This method is used to add the data to the database.
     */
    public void add(){        
        
        NewSoldItemRemote newSoldItem = lookupNewSoldItemRemote();
        
        newSoldItem.setItemName(getProduct());
        newSoldItem.setPrice(getPrice());
        newSoldItem.setDateOfSale(getDateOfSale());
        newSoldItem.add();
        
        System.out.println("NewSoldItem added.");
    }
    
    /**
     *This method is made to set the Value for
     * product name witch can be all kind of
     * characters and therefor takes a String.
     * @param pro
     */
    public void setProduct(String pro){
        product = pro;
        proFilled = true;
    }
    
    /**
     * This method "setDate" is used to set the date object for
     * when a product is sold.
     * @param da, sting that gets converted into date object.
     * @return boolean, true if it was a good date, else false.
     */
    public boolean setDate(String da){
        if(da.length()== 10){
            for(int i = 0; i<10; i++){
                char c = da.charAt(i);
                if((i==4 || i==7) && !(da.charAt(i)=='-')){
                    return false;
                }else if(!Character.isDigit(da.charAt(i)) && !(i==4 || i==7)){
                    return false;
                }
            }
            daFilled=true;
            setDateOfSale(da);
            return true;
        }
        return false;
    }
    
    /**
     * This method is used to reset all the filled
     * controls to so the users doesn't add empty fields
     * the database.
     */
    public void resetFilled(){
        proFilled = false;
        priFilled = false;
        daFilled = false;
    }
    
    /**
     * This method is used to set price on
     * the product was sold for.
     * @param pri
     */
    public void setPrice(double pri){
        price=pri;
        priFilled = true;
    }
    
    /**
     * This method is used to get the product name that is
     * currently in this container class.
     * @return a String with the productName in it.
     */
    public String getProduct(){
        return product;
    }
    
    /**
     * This method gets the price that is currently in this
     * container class.
     * @return a double with price in it.
     */
    public double getPrice(){
        return price;
    }

    /**
     * This method is used to get the currently set date
     * in this container class.
     * @return a date object.
     */
    public Date getDateOfSale() {
        return dateOfSale;
    }
    
    private void setDateOfSale(String tmpDate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try{
            dateOfSale = formatter.parse(tmpDate);
        } catch(ParseException e){
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used to check if all members been set.
     * @return boolean, true if member data is set, else false.
     */
    public boolean allFilled(){
        if(!priFilled){
            return false;
        }else if(!daFilled){
            return false;
        }else{
            return proFilled;
        }
    }
    
    
    private boolean proFilled;
    private boolean daFilled;
    private boolean priFilled;
    private String product;
    private double price;
    private Date dateOfSale;
    

    private NewSoldItemRemote lookupNewSoldItemRemote() {
        try {
            Context c = new InitialContext();
            return (NewSoldItemRemote) c.lookup("java:comp/env/NewSoldItem");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}