package com.java.oct3assignment1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class secondHighestSalary {
public static void main(String[] args) {
	try {
		Connection con=connectionmaster.getconnection();
		Statement st=con.createStatement();
  		ResultSet rs=st.executeQuery("select * from emp where salary =(select max(salary) from emp where salary<(select max(salary) from emp))");
  		while(rs.next())
  			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
          
          //close the connection
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
