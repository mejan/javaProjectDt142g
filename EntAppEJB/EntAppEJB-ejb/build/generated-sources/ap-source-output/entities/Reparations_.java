package entities;

import entities.Customer;
import entities.ReparationPictures;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-23T23:51:51")
@StaticMetamodel(Reparations.class)
public class Reparations_ { 

    public static volatile SingularAttribute<Reparations, String> imagePath;
    public static volatile SingularAttribute<Reparations, Customer> customerID;
    public static volatile SingularAttribute<Reparations, String> description;
    public static volatile SingularAttribute<Reparations, Integer> repairID;
    public static volatile ListAttribute<Reparations, ReparationPictures> reparationPicturesList;
    public static volatile SingularAttribute<Reparations, Date> recieved;
    public static volatile SingularAttribute<Reparations, Boolean> isFinished;
    public static volatile SingularAttribute<Reparations, Date> done;
    public static volatile SingularAttribute<Reparations, Integer> hoursWorked;

}