/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;

import ejb.SoldItemsListRemote;
import entities.SoldItems;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * This is a container class the date needed
 * for the VATCounterReader class, but it also
 * have some data checking methods.
 * @author Mikael Falck
 */
public class ContainerVATCounterReader {

    /**
     * The main constructor sets members to default values.
     */
    ContainerVATCounterReader(){
        totalSold = 0;
        fromDateFilled = false;
        toDateFilled = false;
    }
    /**
     * The secondary constructor is used to set the dates
     * right away, the parameters accepts only a certain
     * format (yyyy-mm-dd), otherwise the dates will not
     * be set.
     * @param fdate, is the from date parameter (String).
     * @param tdate, is the to date parameter (String).
     */
    ContainerVATCounterReader(String fdate, String tdate){
        totalSold = 0;
        setFromDate(fdate);
        setToDate(tdate);
    }
    
    /**
     * This method takes the parameter and check so the value in it is on the
     * right format to make a date object, if it passes the format check it i 
     * will set the "To date" member.
     * @param date, String that is converted to date Object.
     * @return boolean true if date format was ok and date is set, else false.
     */
    public boolean setToDate(String date){
        if(isDate(date)){
            tDate = makeDate(date);
            return toDateFilled = true;
        } else{
            return false;
        }
    }
    
    /**
     * This method takes the parameter and check so the value in it is on the
     * right format to make a date object, if it passes the format check it i 
     * will set the "From date" member.
     * @param date, String that is converted to date Object.
     * @return boolean true if date format was ok and date is set, else false.
     */
    public boolean setFromDate(String date){
        if(isDate(date)){
            fDate = makeDate(date);
            return fromDateFilled = true;
        } else{
            return false;
        }
    }
    
    /**
     * This method is used to get the "to date" date object.
     * @return date object from "To date".
     */
    public Date getToDate(){
        return tDate;
    }
    
    /**
     * This method is used to get the "from date" date object.
     * @return date object from "from date".
     */
    public Date getFromDate(){
        return fDate;
    }
    
    /**
     * returns a double either from the database if the to and from date is correctly filled, else 0.
     * @return if to date and from date correctly filled then it will return the total sold between those dates from the database.
     */
    public double getTotalSold(){
        if(allFilled()){
            readPriceFromDB();
            return totalSold;
        }
        return 0;
    }
    
    /**
     * Returns the VAT from the totalSold.
     * @return totalSold*0.2 for VAT on 25%.
     */
    public double getVATTotal(){
        if(allFilled()){
            readPriceFromDB();
            return round(totalSold*calcVAT,2);
        }
        return 0;
    }
    
    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    /**
     * Used to check that to and from date is set.
     * @return boolean true if both to and from date is set.
     */
    public boolean allFilled(){
        if(!toDateFilled){
            return false;
        }else{
            return fromDateFilled;
        }
    }
    
    /**
     *Resets the date checkers so the user most put in new dates.
     */
    public void resetFilled(){
        toDateFilled = false;
        fromDateFilled = false;
    }
    
    /**
     * method used to make sure that from date is before then to date.
     * @return boolean true if from date is before or equal to date, else false.
     */
    public boolean correctOrderOfDate(){
        if(fDate.equals(tDate) || fDate.before(tDate)){
            return true;
        }
        return false;
    }
    
    private boolean isDate(String date){
        if(date.length()== 10){
            for(int i = 0; i<10; i++){
                char c = date.charAt(i);
                if((i==4 || i==7) && !(date.charAt(i)=='-')){
                    return false;
                }else if(!Character.isDigit(date.charAt(i)) && !(i==4 || i==7)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private Date makeDate(String tmpStr){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date tmpDate = new Date();
        try{
            tmpDate = formatter.parse(tmpStr);
        } catch(ParseException e){
            e.printStackTrace();
        }
        return tmpDate;
    }
    
    private void readPriceFromDB(){
        SoldItemsListRemote list = lookupSoldItemsListRemote();
        List<SoldItems> DBList = list.getSoldItemsByInterval(getFromDate(), getToDate());
        totalSold=0;
        for(SoldItems it: DBList){
            totalSold = totalSold + it.getPrice();
        }
    }
    //members
    private Date fDate;
    private Date tDate;
    private boolean fromDateFilled;
    private boolean toDateFilled;
    private double totalSold;
    //const to calc VAT
    private final double calcVAT = 0.2; //för att få ut rätt värde.

    private SoldItemsListRemote lookupSoldItemsListRemote() {
        try {
            Context c = new InitialContext();
            return (SoldItemsListRemote) c.lookup("java:comp/env/SoldItemsList");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }


    
    
}