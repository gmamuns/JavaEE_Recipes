
package org.javaeerecipes.chapter01.recipe01_02;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "helloController")
@RequestScoped
public class HelloWorldController implements Serializable{

    private String hello = null;
    private Date date = null;
    
    public HelloWorldController() {
        hello = "Hello World from JSF Bean";
        date = new Date();
            }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
