/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.TestSessionBeanRemote;
import javax.ejb.Stateless;

/**
 *
 * @author antondahlin
 */
@Stateless
public class TestSessionBean implements TestSessionBeanRemote {

    @Override
    public String getResult() {
        return "Dansade i neon!";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
