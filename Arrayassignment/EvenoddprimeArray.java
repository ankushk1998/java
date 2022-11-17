package Arrayassignment;

public class EvenoddprimeArray {

	public static void Odd_Even(int a[]) {
		int counteven = 0;
		int countodd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
		}
		System.out.println("Total Even Numbers is" + counteven);
		System.out.println("Total Odd Numbers is" + countodd);

	}

	public static void prime(int a[]) {
		int countprime = 0;

		int i, j, m = 0;
		for (i = 0; i < a.length; i++) {
			int flag = 0;
			m = a[i] / 2;
			
			if (a[i] <= 1) {
				flag = 1;

			} else {
				for (j = 2; j <= m; j++) {
					if (a[i] % j == 0) {
						flag = 1;

					}
				}
				if (flag == 0) {
					countprime++;
				}
			}

		}
		System.out.println("Total count of Prime Numbers:" + countprime);

	}
public static void perfect(int a[]) {
	int countperfect=0;
	for (int i = 0; i < a.length; i++) {
		int sum=0;
		int no=1;
		while(no <= a[i]/2)  
		{  
		if(a[i] % no == 0)  
		{  
			sum = sum + no;  
		}no++;
		}if(sum==a[i])  
		{  
			countperfect++;
		}
		
	}System.out.println("Total count of Perfect Numbers :"+countperfect);
}
	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 5, 6,13, 7,18, 81, 91, 54 };
		EvenoddprimeArray.Odd_Even(a);
		EvenoddprimeArray.perfect(a);
		EvenoddprimeArray.prime(a);
	}

}
