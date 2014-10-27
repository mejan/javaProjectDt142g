package entities;

import entities.Reparations;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-23T23:51:51")
@StaticMetamodel(ReparationPictures.class)
public class ReparationPictures_ { 

    public static volatile SingularAttribute<ReparationPictures, Integer> pictureID;
    public static volatile SingularAttribute<ReparationPictures, String> imagePath;
    public static volatile SingularAttribute<ReparationPictures, Reparations> repairID;

}