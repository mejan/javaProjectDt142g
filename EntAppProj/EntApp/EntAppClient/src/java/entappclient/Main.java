/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.ConsultationListRemote;
import ejb.CustomerListRemote;
import ejb.NewReparationsRemote;
import ejb.TestSessionBeanRemote;
import entities.Consultation;
import entities.Customer;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author antondahlin
 */
public class Main {
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
        System.out.println("Resultatet är: " + testSessionBean.getResult());
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
        
        //Consultation consultation = consultationList.getConsultationByAccepted(false).get(0);
        
        //newReparations.add(consultation.getCustomerID(), 2, "images/resource", datee, datee);
    }
}
