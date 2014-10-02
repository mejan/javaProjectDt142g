/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.ejb.embeddable.EJBContainer;
import javax.faces.validator.Validator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
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
public class NewCustomerConsultationTest {
    
    public NewCustomerConsultationTest() {
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
     * Test of add method, of class NewCustomerConsultation.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator validator = factory.getValidator();
        Set<ConstraintViolation<NewCustomerConsultation>> constraintViolations = validator.validate(instance);
        if(constraintViolations.size() > 0){
    Iterator<ConstraintViolation<NewCustomerConsultation>> iterator = constraintViolations.iterator();
    while(iterator.hasNext()){
        ConstraintViolation<NewCustomerConsultation> cv = iterator.next();
        System.out.println(cv.getMessage());
        System.out.println(cv.getPropertyPath());
    }
 }
        instance.add();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerList method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetCustomerList() throws Exception {
        System.out.println("getCustomerList");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        CustomerList expResult = null;
        CustomerList result = instance.getCustomerList();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetName() throws Exception {
        System.out.println("getName");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetLastName() throws Exception {
        System.out.println("getLastName");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetEmail() throws Exception {
        System.out.println("getEmail");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetPhoneNumber() throws Exception {
        System.out.println("getPhoneNumber");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultationList method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetConsultationList() throws Exception {
        System.out.println("getConsultationList");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        ConsultationList expResult = null;
        ConsultationList result = instance.getConsultationList();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultationID method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetConsultationID() throws Exception {
        System.out.println("getConsultationID");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        int expResult = 0;
        int result = instance.getConsultationID();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetDate() throws Exception {
        System.out.println("getDate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class NewCustomerConsultation.
     */
    @Test
    public void testGetDescription() throws Exception {
        System.out.println("getDescription");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAccepted method, of class NewCustomerConsultation.
     */
    @Test
    public void testIsAccepted() throws Exception {
        System.out.println("isAccepted");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        boolean expResult = false;
        boolean result = instance.isAccepted();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerList method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetCustomerList() throws Exception {
        System.out.println("setCustomerList");
        CustomerList customerList = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setCustomerList(customerList);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetName() throws Exception {
        System.out.println("setName");
        String name = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setName(name);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetLastName() throws Exception {
        System.out.println("setLastName");
        String lastName = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setLastName(lastName);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetEmail() throws Exception {
        System.out.println("setEmail");
        String email = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setEmail(email);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetPhoneNumber() throws Exception {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setPhoneNumber(phoneNumber);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsultationList method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetConsultationList() throws Exception {
        System.out.println("setConsultationList");
        ConsultationList consultationList = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setConsultationList(consultationList);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetDate() throws Exception {
        System.out.println("setDate");
        Date date = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setDate(date);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetDescription() throws Exception {
        System.out.println("setDescription");
        String description = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setDescription(description);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccepted method, of class NewCustomerConsultation.
     */
    @Test
    public void testSetAccepted() throws Exception {
        System.out.println("setAccepted");
        boolean accepted = false;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewCustomerConsultation instance = (NewCustomerConsultation)container.getContext().lookup("java:global/classes/NewCustomerConsultation");
        instance.setAccepted(accepted);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
