/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;

/**
 *
 * @author mejan
 */
public class InputContainerVetCounter {
    
    InputContainerVetCounter(){
        product="";
        date="";
        price=0;
    }
    
    InputContainerVetCounter(String pro, double pri, String da){
        product = pro;
        date = da;
        price = pri;
    }
    
    void setProduct(String pro){
        product = pro;
        System.out.println(product);
    }
    
    void setDate(String da){
        date = da;
        System.out.println(date);
    }
    
    void setPrice(double pri){
        price=pri;
        System.out.println(price);
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

    private String product;
    private String date;
    private double price;
}
