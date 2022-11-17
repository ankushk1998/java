package Arrayassignment;

 class DynamicArray {
	
	 
	
	private int array[];   
	private int count;   
	private int sizeofarray;   
	
	public DynamicArray()   
	{   
	array = new int[1];   
	count = 0;   
	sizeofarray = 1;   
	}   
	
	public void addElement(int a)   
	{   
	
	if (count == sizeofarray)   
	{   
	   
	growSize();   
	}   
	//appens an element at the end of the array   
	array[count] = a;   
	count++;   
	}   
	
	public void growSize()   
	{   
	    
	int temp[] = null;   
	if (count == sizeofarray)   
	{   
	
	temp = new int[sizeofarray * 2];   
	{   
	for (int i = 0; i < sizeofarray; i++)   
	{   
	
	temp[i] = array[i];   
	}   
	}   
	}   
	array = temp;   
	sizeofarray= sizeofarray * 2;   
	}   
	
	public void addElementAt(int index, int a)   
	{   
	
	if (count == sizeofarray)   
	{   
	
	growSize();   
	}   
	for (int i = count - 1; i >= index; i--)   
	{   
	
	array[i + 1] = array[i];   
	}   
	
	array[index] = a;   
	count++;   
	}   
	public static void main(String[] args)   
	{   
	DynamicArray da = new DynamicArray();   
	
	da.addElement(2);   
	da.addElement(23);   
	da.addElement(30);   
	da.addElement(7);   
	da.addElement(8);   
	da.addElement(21);   
	da.addElement(77);   
	da.addElement(83);   
	da.addElement(91);   
	da.addElement(42);  
	System.out.println("Elements of the array:");   
	
	for (int i = 0; i < da.sizeofarray; i++)   
	{   
	System.out.print(da.array[i] + " ");   
	}   
	System.out.println();   
	
	System.out.println("Size of the array: " + da.sizeofarray);   
	System.out.println("No. of elements in the array: " + da.count);  
	
	da.addElementAt(5, 99); 
	System.out.println("\nElements of the array after adding an element at index 5:");   
	
	for (int i = 0; i < da.sizeofarray; i++)   
	{   
	System.out.print(da.array[i] + " ");   
	}   
	System.out.println();   
	
	System.out.println("Size of the array: " + da.sizeofarray);   
	System.out.println("No. of elements in the array: " + da.count);   
	}  
	}  


