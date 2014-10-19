package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-19T17:36:41")
@StaticMetamodel(SoldItems.class)
public class SoldItems_ { 

    public static volatile SingularAttribute<SoldItems, String> itemName;
    public static volatile SingularAttribute<SoldItems, Double> price;
    public static volatile SingularAttribute<SoldItems, Integer> soldID;
    public static volatile SingularAttribute<SoldItems, Date> dateOfSale;

}