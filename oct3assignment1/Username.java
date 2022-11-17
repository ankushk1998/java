package com.java.oct3assignment1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class Username {
public static void main(String[] args) {
	
	try { 
		Scanner sc=new Scanner(System.in);
		Connection con=connectionmaster.getconnection();
		PreparedStatement pst = con.prepareStatement("select * from emp where ename=?");
          
          System.out.println("please enter user name");
          pst.setString(1, sc.nextLine());
          ResultSet res = pst.executeQuery();
	
          while (res.next()) {
              if(res.getString(1).isEmpty()) {
            	  System.out.println("user not found");
            	  
              }
              else {
            	  System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getInt(4)+" "+res.getString(5)+" "+res.getString(6));
              }
          }
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
