package Arrayassignment;

public class StringArrayascending {

	public static void main(String[] args) {
		  String s[]= {"java","sql","python","c","html","boot","reactjs"};
		     System.out.println("arranged string  on the basis on length are  : ");
		     for(int i=0;i<s.length;i++)
		     {
		    	 for(int j=i+1;j<s.length;j++)
		    	 {
		    		 if(s[i].length()>s[j].length())
		    		 {
		    			 String temp=s[i];
		    			 s[i]=s[j];
		    			 s[j]=temp;
		    		 }
		    	 }
		    	 System.out.print(" "+s[i]);
		     }
			}}