package entities;

import entities.Customer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-23T23:51:51")
@StaticMetamodel(Consultation.class)
public class Consultation_ { 

    public static volatile SingularAttribute<Consultation, Date> date;
    public static volatile SingularAttribute<Consultation, Customer> customerID;
    public static volatile SingularAttribute<Consultation, String> description;
    public static volatile SingularAttribute<Consultation, Boolean> accepted;
    public static volatile SingularAttribute<Consultation, String> timeInterval;
    public static volatile SingularAttribute<Consultation, Date> time;
    public static volatile SingularAttribute<Consultation, Integer> consultationID;
    public static volatile SingularAttribute<Consultation, String> day;

}