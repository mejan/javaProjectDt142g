/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.CustomerListRemote;
import ejb.TestSessionBeanRemote;
import entities.Customer;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author antondahlin
 */
public class Main {
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
        
        List<Customer> lista = customerList.getCustomers();
        
        
        for(Customer keso: lista){
            System.out.println(keso.getName() + " " +  keso.getLastName());
        }   
    }
}
