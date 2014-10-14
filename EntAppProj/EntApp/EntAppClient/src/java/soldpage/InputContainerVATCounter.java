/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;



import ejb.NewSoldItemRemote;
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
 * @author mejan
 */
public class InputContainerVATCounter {
    
    InputContainerVATCounter(){
        product="";
        date="";
        price=0;
    }
    
    InputContainerVATCounter(String pro, double pri, String da){
        product = pro;
        date = da;
        price = pri;
    }
    
    void add(){
        Date datee = new Date();
        
        
        NewSoldItemRemote newSoldItem = lookupNewSoldItemRemote();
        
        newSoldItem.setItemName(getProduct());
        newSoldItem.setPrice(getPrice());
        newSoldItem.setDateOfSale(datee);
        newSoldItem.add();
        //lookupNewSoldItemRemote().add();
        
        
        /*lookupNewSoldItemRemote().setItemName(getProduct());
        lookupNewSoldItemRemote().setPrice(getPrice());
        lookupNewSoldItemRemote().setDateOfSale(getDateOfSale());
        lookupNewSoldItemRemote().add();*/
        
        System.out.println("NewSoldItem added.");
    }
    
    
    void setProduct(String pro){
        product = pro;
        System.out.println(product);
        
        
        //newSoldItem.setItemName(product);
        //lookupNewSoldItemRemote().setItemName(product);
    }
    
    void setDate(String da){
        date = da;
        //System.out.println(date);
        
        //newSoldItem.setDateOfSale(datee);
        //lookupNewSoldItemRemote().setDateOfSale(startDate);
    }
    
    void setPrice(double pri){
        price=pri;
        System.out.println(price);
        
        //newSoldItem.setPrice(price);
        //lookupNewSoldItemRemote().setPrice(price);
    }
    
    String getProduct(){
        return product;
    }
    
    String getDate(){
        return date;
    }
    
    double getPrice(){
        return price;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
        Date startDate = new Date();
        
        Date datee = new Date();
        try {

            startDate = df.parse(dateOfSale);
            String newDateString = df.format(startDate);
            //System.out.println(newDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        this.dateOfSale = startDate;
        System.out.println(startDate.toString());
    }
    
    

    private String product;
    private String date;
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
