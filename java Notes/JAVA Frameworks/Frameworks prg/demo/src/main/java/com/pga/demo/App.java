package com.pga.demo;

import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/pga";
        String user = "root";
        String pwd = "root";
        Connection con = DriverManager.getConnection(url,user,pwd);
        String sql = "insert into student values(1,'abc',81)";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        con.close();
    }
}
