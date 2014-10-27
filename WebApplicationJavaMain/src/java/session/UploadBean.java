/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;
 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.SessionScoped;  
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author Max
 */
@ManagedBean
@SessionScoped
@Named
@Stateless
public class UploadBean {
    private Part file1;
    private String imageFileName;

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public Part getFile1() {
        return file1;
    }

    public void setFile1(Part file1) {
        this.file1 = file1;
    }
    private static String getFilename(Part part) {  
        for (String cd : part.getHeader("content-disposition").split(";")) {  
            if (cd.trim().startsWith("filename")) {  
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");  
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.  
            }  
        }
        return null;  
    }
    public void upload(){
        try {
            if(file1 == null){
                setImageFileName("./resources/image/small1.jpg");
            }
            else if(file1.getContentType().startsWith("image")){
                InputStream inputStream = file1.getInputStream();
                FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Max\\Desktop\\WebApplicationJavaMain\\web\\resources\\image\\"+getFilename(file1));  
                 byte[] buffer = new byte[4096];          
                 int bytesRead = 0;  
                 while(true) {                          
                     bytesRead = inputStream.read(buffer);  
                     if(bytesRead > 0) {  
                         outputStream.write(buffer, 0, bytesRead);  
                     }else {  
                         break;  
                     }                         
                 }  
                 outputStream.close();  
                 inputStream.close();      
                 setImageFileName("./resources/image/"+getFilename(file1));
            } 
        } catch (Exception e) {
            System.out.println("No Image Exception");
        }
      
    }
}
