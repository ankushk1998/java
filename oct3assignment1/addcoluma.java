package com.java.oct3assignment1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class addcoluma {
	public static void main(String[] args) {
		
	
	try { 
		Scanner sc=new Scanner(System.in);
		Connection con=connectionmaster.getconnection();
		PreparedStatement pst = con.prepareStatement("alter table emp ADD gender varchar(100)");
		PreparedStatement pst1 = con.prepareStatement("insert into emp(eid , ename , salary , deptid , designation,gender) values(?,?,?,?,?,?)");
        System.out.println("please enter id");
        pst1.setInt(1, Integer.parseInt(sc.nextLine()));
        System.out.println("please enter employee name");
        pst1.setString(2, sc.nextLine());
        System.out.println("please enter employee salary");
        pst1.setInt(3, Integer.parseInt(sc.nextLine()));
        System.out.println("please enter employee deptid");
        pst1.setInt(4, Integer.parseInt(sc.nextLine()));
        System.out.println("please enter employee designation");
        pst1.setString(5, sc.nextLine());
        System.out.println("please enter employee gender");
        pst1.setString(6, sc.nextLine());
        
        
        //execute the update
        pst1.executeUpdate();
        
        con.close();
		
          
          
          //execute the update
          pst.executeUpdate();
          
          con.close();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	try {
		Connection con=connectionmaster.getconnection();
		Statement st=con.createStatement();
  		ResultSet rs=st.executeQuery("select avg(salary),emp.gender from emp group by gender ");
  		while(rs.next())
  			System.out.println(rs.getInt(1)+" "+rs.getString(2));
          
          //close the connection
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
}
