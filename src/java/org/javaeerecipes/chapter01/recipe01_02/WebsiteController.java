
package org.javaeerecipes.chapter01.recipe01_02;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class WebsiteController {

   
    public WebsiteController() {
    }
    
    private HttpURLConnection connection = null;
    private URL u = null;
    private int code = 0;
    private String status = null;

    public URL getU() {
        return u;
    }

    public void setU(URL u) {
        this.u = u;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
    
    public void site_check() throws IOException{
        u = new URL("http://cvasu.ac.bd/");
        connection = (HttpURLConnection) u.openConnection();
        connection.setRequestMethod("HEAD");
        code = connection.getResponseCode();
                if(code == 200)
                    this.status = "Online";
                else
                   this.status =  "Offline";
        
    }
    
}
