/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Reparations;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface ReparationsListRemote {
    List<Reparations> getReparations();
    
    void addReparations(Reparations reparations);
    
    void updateReparations(Reparations reparations);
}
