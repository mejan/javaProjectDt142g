/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.ConsultationListRemote;
import ejb.CustomerListRemote;
import ejb.NewReparationsRemote;
import ejb.NewSoldItemRemote;
import ejb.SoldItemsListRemote;
import ejb.TestSessionBeanRemote;
import entities.Consultation;
import entities.Customer;
import entities.SoldItems;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author antondahlin
 */
public class Main {
    @EJB
    private static SoldItemsListRemote soldItemsList;
    
    @EJB
    private static NewSoldItemRemote newSoldItem;
    
    @EJB
    private static NewReparationsRemote newReparations;
    
    @EJB
    private static ConsultationListRemote consultationList;
    
    @EJB
    private static CustomerListRemote customerList;
    
    @EJB
    private static TestSessionBeanRemote testSessionBean;
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<SoldItems> kuk = soldItemsList.getSoldItems();
        /*System.out.println("Resultatet är: " + testSessionBean.getResult());
        System.out.println("Resultatet är: " + customerList.getTest());
        
        List<Customer> customerlist = customerList.getCustomers();
        List<Consultation> consultationlist = consultationList.getConsultationByAccepted(false);
       
        Date datee = new Date();
        
        for(Customer it: customerlist){
            System.out.println(it.getName() + " " +  it.getLastName());
        }   
        
        for(Consultation it: consultationlist){
            System.out.println(it.getCustomerID().getName() + " " + it.getCustomerID().getLastName() + " HAVE CONSULTATION AT: " + it.getTime() + " : " + it.getDate());
        }
        
        Consultation konsulat = consultationList.getConsultationByAccepted(false).get(1);
        
        
        
        //newReparations.add(consultation.getCustomerID(), 2, "images/resource", datee, datee);
        //newReparations.setCustomerIDINT(konsulat.getCustomerID().getCustomerID());
        
        newReparations.setCustomerID(konsulat.getCustomerID());
        
        newReparations.setHoursWorked(4);
        newReparations.setRecieved(datee);
        newReparations.setDone(datee);
        newReparations.setImagePath("resources/image/regeN.png");
        newReparations.add();
        //System.out.println("Regen bor: " + newReparations.getHoursWorked());
        
        
        newSoldItem.setItemName("Strängar");
        newSoldItem.setDateOfSale(datee);
        newSoldItem.setPrice(100.50);
        newSoldItem.add();*/
        
    }
}
