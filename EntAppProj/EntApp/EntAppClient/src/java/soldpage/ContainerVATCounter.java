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
public class ContainerVATCounter {
    //konstruktor.
    ContainerVATCounter(){
        con();
    }
    //
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
    
    public void add(){        
        
        NewSoldItemRemote newSoldItem = lookupNewSoldItemRemote();
        
        newSoldItem.setItemName(getProduct());
        newSoldItem.setPrice(getPrice());
        newSoldItem.setDateOfSale(getDateOfSale());
        newSoldItem.add();
        
        System.out.println("NewSoldItem added.");
    }
    
    
    public void setProduct(String pro){
        product = pro;
        proFilled = true;
    }
    
    boolean setDate(String da){
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
    
    public void resetFilled(){
        proFilled = false;
        priFilled = false;
        daFilled = false;
    }
    
    public void setPrice(double pri){
        price=pri;
        priFilled = true;
    }
    
    public String getProduct(){
        return product;
    }
    
    public double getPrice(){
        return price;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }
    
    private void setDateOfSale(String tmpDate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try{
            dateOfSale = formatter.parse(tmpDate);
            System.out.println(dateOfSale.toString());
        } catch(ParseException e){
            e.printStackTrace();
        }
    }
    
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
