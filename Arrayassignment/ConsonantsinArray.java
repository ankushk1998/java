package Arrayassignment;

public class ConsonantsinArray {

	public static void main(String[] args) {
		char a[]= {'a','n','k','u','s','h','k'};
		System.out.println("vowels:- ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
			{
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("consonants :- ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u')
			{
				System.out.print(a[i]+" ");
			}
		}
	}}
//	
	


