/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldpage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mejan
 */
public class ContainerVATCounterReader {

    public ContainerVATCounterReader(){
        totalSold = 200000;
        fromDateFilled = false;
        toDateFilled = false;
    }
    
    public boolean setToDate(String date){
        if(isDate(date)){
            tDate = makeDate(date);
            return toDateFilled = true;
        } else{
            return false;
        }
    }
    
    public boolean setFromDate(String date){
        if(isDate(date)){
            fDate = makeDate(date);
            return fromDateFilled = true;
        } else{
            return false;
        }
    }
    
    public Date getToDate(){
        return tDate;
    }
    
    public Date getFromDate(){
        return fDate;
    }
    
    public double getTotalSold(){
        return totalSold;
    }
    
    public double getVATTotal(){
        return totalSold*calcVAT;
    }
    
    public boolean allFilled(){
        if(!toDateFilled){
            return false;
        }else{
            return fromDateFilled;
        }
    }
    
    public void resetFilled(){
        toDateFilled = false;
        fromDateFilled = false;
    }
    
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
            System.out.println(tmpDate.toString());
        } catch(ParseException e){
            e.printStackTrace();
        }
        return tmpDate;
    }
    
    //members
    private Date fDate;
    private Date tDate;
    private boolean fromDateFilled;
    private boolean toDateFilled;
    private double totalSold;
    //const to calc VAT
    private final double calcVAT = 0.25;
}