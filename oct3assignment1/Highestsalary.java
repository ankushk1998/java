package com.java.oct3assignment1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Highestsalary {
	public static void main(String[] args) {
		try { 
			Scanner sc=new Scanner(System.in);
			Connection con=connectionmaster.getconnection();
			PreparedStatement pst = con.prepareStatement("insert into emp(eid , ename , salary , deptid , designation) values(?,?,?,?,?)");
	          System.out.println("please enter id");
	          pst.setInt(1, Integer.parseInt(sc.nextLine()));
	          System.out.println("please enter employee name");
	          pst.setString(2, sc.nextLine());
	          System.out.println("please enter employee salary");
	          pst.setInt(3, Integer.parseInt(sc.nextLine()));
	          System.out.println("please enter employee deptid");
	          pst.setInt(4, Integer.parseInt(sc.nextLine()));
	          System.out.println("please enter employee designation");
	          pst.setString(5, sc.nextLine());
	          
	          //execute the update
	          pst.executeUpdate();
	          
	          con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Connection con=connectionmaster.getconnection();
			Statement st=con.createStatement();
	  		ResultSet rs=st.executeQuery("select * from emp where salary in (select max(salary) from emp Group By deptid)");
	  		while(rs.next())
	  			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
	          
	          //close the connection
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
