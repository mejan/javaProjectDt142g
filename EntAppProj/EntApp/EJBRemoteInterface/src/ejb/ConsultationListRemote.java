/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Consultation;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface ConsultationListRemote {
 
    List<Consultation> getConsultationByAccepted(boolean accepted);
    
    void removeConsultation(Consultation consultation);
    
    void updateConsultation(Consultation consultations);
}
