/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.miun.projectjava.entitys;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antondahlin
 */
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getCustomerID method, of class Customer.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Customer instance = new Customer();
        Integer expResult = null;
        Integer result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerID method, of class Customer.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        Integer customerID = null;
        Customer instance = new Customer();
        instance.setCustomerID(customerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Customer instance = new Customer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Customer instance = new Customer();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Customer instance = new Customer();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Customer.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Customer.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        Customer instance = new Customer();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultationList method, of class Customer.
     */
    @Test
    public void testGetConsultationList() {
        System.out.println("getConsultationList");
        Customer instance = new Customer();
        List<Consultation> expResult = null;
        List<Consultation> result = instance.getConsultationList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsultationList method, of class Customer.
     */
    @Test
    public void testSetConsultationList() {
        System.out.println("setConsultationList");
        List<Consultation> consultationList = null;
        Customer instance = new Customer();
        instance.setConsultationList(consultationList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReparationsList method, of class Customer.
     */
    @Test
    public void testGetReparationsList() {
        System.out.println("getReparationsList");
        Customer instance = new Customer();
        List<Reparations> expResult = null;
        List<Reparations> result = instance.getReparationsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReparationsList method, of class Customer.
     */
    @Test
    public void testSetReparationsList() {
        System.out.println("setReparationsList");
        List<Reparations> reparationsList = null;
        Customer instance = new Customer();
        instance.setReparationsList(reparationsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Customer.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Customer.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
