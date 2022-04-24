//Problem: We are loosing the count on restart of Tomcat server
//Solution: Use Listener
package com.pga;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppStartStopListener implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent e)  { 
    		System.out.println("***Tomcat stopped ***");
    		ServletContext ctx = e.getServletContext();
    		Integer cnt = (Integer)ctx.getAttribute("COUNT");
    		try {
    		 FileWriter fw = new FileWriter(new File("/tmp/cnt.txt"));
    		 fw.write(""+cnt);
    		 fw.close();
    		}catch(Exception e1) { e1.printStackTrace();}
    	}

    public void contextInitialized(ServletContextEvent e)  { 
		System.out.println("***Tomcat started ***");
		try {
   		 FileReader fr = new FileReader(new File("/tmp/cnt.txt"));
   		 BufferedReader br = new BufferedReader(fr);
   		 int cnt = Integer.parseInt(br.readLine());
   		 ServletContext ctx = e.getServletContext();
 		 ctx.setAttribute("COUNT", cnt);
		}catch(Exception e1) { e1.printStackTrace();}
    }
}
