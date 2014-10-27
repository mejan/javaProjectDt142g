/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.GuitarsListRemote;
import static entities.FileUtils.decodeToImage;
import static entities.FileUtils.encodeToString;
import static entities.FileUtils.getFileExtension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author antondahlin
 */
@Stateless
public class GuitarsList implements GuitarsListRemote {
    
    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;
    private String imgStr;
    private final static String defaultFilePath="C:\\Users\\Max\\Desktop\\WebApplicationJavaMain\\web\\resources\\";

    @Override
    public List<Guitars> getGuitars(){
        return em.createNamedQuery("Guitars.findAll", Guitars.class).getResultList();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void updateGuitar(Guitars guitar) throws IOException{
        em.merge(guitar);
        
        String s = new String(guitar.getImage());
        String imgP = guitar.getImagePath();
        String extension = getFileExtension(new File(imgP));
        BufferedImage image =decodeToImage(s);
        String path = defaultFilePath+imgP;
        ImageIO.write(image,extension, new File(path));
    }
    
   @Override
    public void addGuitar(Guitars guitars) throws IOException{
        em.persist(guitars);
        em.flush();
        String s = new String(guitars.getImage());
        String imgP = guitars.getImagePath();
        String extension = getFileExtension(new File(imgP));
        BufferedImage image =decodeToImage(s); 
        String path = defaultFilePath+imgP;
        ImageIO.write(image,extension, new File(path));
    }
    
    @Override
    public List<Guitars> getGuitarsForDesktop(){
         TypedQuery<Guitars> guitarsQuery = 
            em.createNamedQuery("Guitars.findAll", Guitars.class);
        List <Guitars> resultFromQuery= guitarsQuery.getResultList();
        try {
            for(Guitars it: resultFromQuery){
                String imageSRC = (defaultFilePath+it.getImagePath());
                BufferedImage img = ImageIO.read(new File(imageSRC));
                String extension= getFileExtension(new File(it.getImagePath()));
                imgStr = encodeToString(img, extension );
                it.setImage(imgStr.getBytes());
                //String s = new String(it.getImage());
            }
        } catch (IOException ex) {
                System.out.println(ex);
        }
        return resultFromQuery;
    }
    
    @Override
    public void removeGuitars(Guitars guitars){
        guitars = em.merge(guitars);
        em.remove(guitars);
    }
    
    
}
