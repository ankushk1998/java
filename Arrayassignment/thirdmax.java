package Arrayassignment;

public class thirdmax {

	public static void main(String[] args) {
		
		int a[]= {3,9,5,8,88,78,35};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		
 
		}
		System.out.println(a[a.length-3]);	
		  
	}

}
