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
        totalSold = 0;
    }
    
    public boolean setToDate(String date){
        if(isDate(date)){
            tDate = makeDate(date);
            return true;
        } else{
            return false;
        }
    }
    
    public boolean setFromDate(String date){
        if(isDate(date)){
            fDate = makeDate(date);
            return true;
        } else{
            return false;
        }
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
    private double totalSold;
    //const to calc VAT
    private final double calcVAT = 0.75;
}