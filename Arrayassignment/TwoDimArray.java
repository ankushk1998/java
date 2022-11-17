package Arrayassignment;

public class TwoDimArray {

	public static void main(String[] args) {
		   int n=3;
	        int a[][] = { { 3,2,4},
	        		        { 5,7,7}, 
	        		        { 9,5,8} };
	        for (int i = 0; i < n; i++) {
	        	System.out.println("");
	            for(int j=0;j<n;j++) {
	                if((i!=0  &&   j!=0)  &&  (i!=n-1  &&  j!=n-1)) {
	                    System.out.print("   ");
	                    continue;
	            	
            	}
	                System.out.print(a[i][j]+"  ");
	            }
	            System.out.println();
	        }
	    }
	

	}


