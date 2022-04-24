package com.pga;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppStartStopListener implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent e)  { 
    	int count = (int)e.getServletContext().getAttribute("COUNT");
    	try {
    		  FileWriter w = new FileWriter(new File("/tmp/count.txt"));
    		  
    		  BufferedWriter bw = new BufferedWriter(w);
    		  bw.write(""+count);
    		  bw.close();
    		}catch(IOException e1) { e1.printStackTrace();}
    }

    public void contextInitialized(ServletContextEvent e)  { 
    	  try {
    		  FileReader r = new FileReader(new File("/tmp/count.txt"));
    		  BufferedReader br = new BufferedReader(r);
    		  int cnt = Integer.parseInt(br.readLine());
    		  e.getServletContext().setAttribute("COUNT", cnt);
    	  }catch(IOException e1) { e1.printStackTrace(); }
    }
}
