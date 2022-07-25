package arraysdemo;

public class array_sort {
	
	public static void main(String[] args) {
		
		//swap two numbers
		int a=4;
		int b=5;
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//swap numbers without temp variable
		
		int c=4;
		int d=5;
		
	    c=c+d; //c=9
	    d=c-d; //d=9-5=4
	    c=c-d; //c=9-4=5
	    
	    System.out.println("c="+c);
	    System.out.println("d="+d);
	    
	    //sorting array
	    int t=0;
	    
	    int arr[]= {2,5,9,4};
	    
	    //two for loops for comparing the first and second indexes
	    for(int i=0;i<4;i++)
	    {
	    	for(int j=i+1;j<4;j++)
	    	{
	    		if(arr[i]>arr[j])
	    		{
	    			t=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=t;
	    			
	    		}
	    	}
	    }
	    
	  System.out.print("Sorted array = ");
	  for(int i=0;i<4;i++)
	  {
		  System.out.print(arr[i]);
	  }
	    
	    
	    
	    
		
		
	}
	
	
	

}
