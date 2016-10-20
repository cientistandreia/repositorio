package org.myorganization.component.example;

import java.awt.ActiveEvent;

import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import org.apache.commons.logging.LogFactory;
/*
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.faces.event.ActionEvent;
*/
/**
 * Managed bean for the sayHello page example
 */
@ManagedBean(name = "editor")
public class SayHelloBean
{

   // private static final String LogFactory = null;

// 	private static final Logger log = LogFactory.getLog2(SayHelloBean.class);
	//private  final Logger log= Logger.getLogger(this.getClass(SayHelloBean.class));

  

	/*public static Logger getLog() {
		return log;
	}*/

	private String firstName;
    private String lastName;
    private boolean renderGreeting;

    
    public SayHelloBean()
    {
        this.renderGreeting = false;
    }

    public void sayIt(ActiveEvent evt)
    {
        renderGreeting = true;

        System.out.println("The name to say hello is '"+firstName+"' and the last name is '"+lastName+"'.");
    //   if (  log).isInfoEnabled())
        //{
           // log.info("The name to say hello is '"+firstName+"' and the last name is '"+lastName+"'.");
      //  }
    }


    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    public boolean isRenderGreeting()
    {
        return renderGreeting;
    }

    public void setRenderGreeting(boolean renderGreeting)
    {
        this.renderGreeting = renderGreeting;
    }
}
