/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.miun.projectjava.entitys.Customer;

/**
 *
 * @author antondahlin
 */
public class CustomerListTest {
    
    public CustomerListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCustomers method, of class CustomerList.
     */
    @Test
    public void testGetCustomers() throws Exception {
        System.out.println("getCustomers");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerList instance = (CustomerList)container.getContext().lookup("java:global/classes/CustomerList");
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomersByName method, of class CustomerList.
     */
    @Test
    public void testGetCustomersByName() throws Exception {
        System.out.println("getCustomersByName");
        String name = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerList instance = (CustomerList)container.getContext().lookup("java:global/classes/CustomerList");
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomersByName(name);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomersByEmail method, of class CustomerList.
     */
    @Test
    public void testGetCustomersByEmail() throws Exception {
        System.out.println("getCustomersByEmail");
        String email = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerList instance = (CustomerList)container.getContext().lookup("java:global/classes/CustomerList");
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomersByEmail(email);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class CustomerList.
     */
    @Test
    public void testAddCustomer() throws Exception {
        System.out.println("addCustomer");
        Customer customer = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CustomerList instance = (CustomerList)container.getContext().lookup("java:global/classes/CustomerList");
        instance.addCustomer(customer);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
