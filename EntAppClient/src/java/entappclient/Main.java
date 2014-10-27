/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.ConsultationListRemote;
import ejb.CustomerListRemote;
import ejb.GuitarsListRemote;
import ejb.NewGuitarsRemote;
import ejb.NewReparationsRemote;
import ejb.NewSoldItemRemote;
import ejb.ReparationsListRemote;
import ejb.SoldItemsListRemote;
import ejb.TestSessionBeanRemote;
import entities.Consultation;
import entities.Customer;
import entities.Guitars;
import entities.SoldItems;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import static webAdminPage.FileUtils.encodeToString;
import static webAdminPage.FileUtils.getFileExtension;


/**
 *
 * @author antondahlin
 */
public class Main {
    @EJB
    private static NewGuitarsRemote newGuitars;

    
    @EJB
    private static SoldItemsListRemote soldItemsList;
    
    @EJB
    private static GuitarsListRemote guitarsList;
    
    @EJB
    private static ReparationsListRemote reparationsList;
    
    //Inkluderar remoteinterface för de olika remote-bönorna.
    //Högerklicka och välj call enterprise bean. . . 
    
    @EJB
    private static NewSoldItemRemote newSoldItem;
    
    @EJB
    private static NewReparationsRemote newReparations;
    
    @EJB
    private static ConsultationListRemote consultationList;
    
    @EJB
    private static CustomerListRemote customerList;
    
    @EJB
    private static TestSessionBeanRemote testSessionBean;
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        // TODO code application logic here
        System.out.println("Resultatet är: " + testSessionBean.getResult());
        System.out.println("Resultatet är: " + customerList.getTest());
        
        
        //Hämtar alla rader i databasen utifrån bönorna.
        List<Customer> customerlist = customerList.getCustomers();
     /*   List<Consultation> consultationlist = consultationList.getConsultationByAccepted(false);
       
        
        //Ett nytt date-objekt
        Date datee = new Date();
        //Skriver ut alla kunder och några attribut.
        for(Customer it: customerlist){
            System.out.println(it.getName() + " " +  it.getLastName());
        }   
        //SKriver ut alla konsultationer
        for(Consultation it: consultationlist){
            System.out.println(it.getCustomerID().getName() + " " + it.getCustomerID().getLastName() + " HAVE CONSULTATION AT: " + it.getTime() + " : " + it.getDate());
        }   */
        
        //Testar att ta ut en specifik konsultation ifrån bönan
        /*Consultation konsultation = consultationList.getConsultationByAccepted(false).get(1);
        
        konsultation.setDescription("Jag luktar jude");
        consultationList.updateConsultation(konsultation);
        
        List<Reparations> reparationslist = reparationsList.getReparations();
        
        Reparations specificReparation = reparationslist.get(0);
        
        specificReparation.setHoursWorked(specificReparation.getHoursWorked() - 1335);
        reparationsList.updateReparations(specificReparation);
        
        List<Guitars> guitarList = guitarsList.getGuitars();
        
        Guitars guitar = guitarList.get(0);

        System.out.println(guitar.getName() + " : " + guitar.getPrice() + " : " + guitar.getDescription());
        
        /*guitar.setDescription("Jesus lever");
        
        guitarsList.updateGuitar(guitar);
        
        System.out.println(guitar.getName() + " : " + guitar.getPrice() + " : " + guitar.getDescription());*/
        
        //Hur man lägger till en reparation utifrån en konsultation
        
        /*newReparations.setCustomerID(konsultation.getCustomerID());
        newReparations.setHoursWorked(4);
        newReparations.setRecieved(datee);
        newReparations.setDone(datee);
        newReparations.setImagePath("resources/image/regeN.png");
        newReparations.add();*/
        
        //System.out.println("Regen bor: " + newReparations.getHoursWorked());
        
        //Hur man lägger till ett nytt sålt item.
        
        
        /*newSoldItem.setItemName("Strängar");
        newSoldItem.setDateOfSale(datee);
        newSoldItem.setPrice(100.50);
        newSoldItem.add();*/
        
        /*Date lower;
        Date upper;
        String s_lower = "2014-02-11";
        String s_upper = "2014-07-11";
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //try{
        lower = df.parse(s_lower);
        upper = df.parse(s_upper);*/
        /*}catch(Exception e){
        
        }*/
        
        
        //List<SoldItems> solditems = soldItemsList.getSoldItemsByInterval(lower, upper);
        
        //double result = soldItemsList.getSoldItemsByInterval(lower,upper);
        
        
        /*double result=0;
        
        for(SoldItems it: solditems){
            System.out.println("Date: " + it.getDateOfSale());
            result+=it.getPrice();
            System.out.println("Nuvarande; " + result);
        }
        
        System.out.println("Momsen är: " + result*0.2);
        
        
        List<Guitars> guitarslist = guitarsList.getGuitars();
        
        for(Guitars it: guitarslist){
            System.out.println("Guitar: " + it.getName());
        }*/
        
        /*URL url = new URL("http://10.14.9.57:8080/WebApplicationJavaMain/resources/image/small1.png");

        Image image = Toolkit.getDefaultToolkit().createImage(url);
        
        
        JFrame editorFrame = new JFrame("Image Demo");
        editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();
        editorFrame.setLocationRelativeTo(null);
        editorFrame.setVisible(true);*/
        
        
        
        //Hur man tar bort en konsultation
        //consultationList.removeConsultation(consultationlist.get(0));
        
        /*String imgStr;
        //den här byter du ut mot vad din funktion ger efter du valt fil
        String imagePath="C:\\Users\\Admin\\Pictures\\namna1.jpg";
        String fileName = null;
        byte[] imgbytes = null;
        try{
            String imageSRC = (imagePath);
            File f= new File(imageSRC);
            fileName=f.getName();
            BufferedImage img = ImageIO.read(f);
            String extension= getFileExtension(f);
            imgStr = encodeToString(img,extension);
            imgbytes = imgStr.getBytes();
            System.out.println("hej");
            
        }catch(IOException e){
            System.out.println(e);
        }
        String dbFilePath="images/";
                    System.out.println("hej");

        newGuitars.setImage(imgbytes);
        newGuitars.setImagePath(dbFilePath+fileName);            System.out.println("hej");

        newGuitars.setDescription("hej");
        newGuitars.setName("då");
        newGuitars.setPrice(10);
                    System.out.println("då");

        newGuitars.setSold(true);
        newGuitars.add();
                    System.out.println("hej");*/

        
    }
}
