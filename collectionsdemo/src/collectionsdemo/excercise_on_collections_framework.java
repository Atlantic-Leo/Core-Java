package collectionsdemo;

import java.util.ArrayList;

public class excercise_on_collections_framework {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,4,4,1,2};
		
		//print the unique numbers and number of times each number is printed
		//output -> 1-2 , 2-2 , 4-2
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			//initialzing a variable to count each occurence of the elements present in the array
			int k=0;
			//checking whether the element from the array is already present in the array list
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				//checking for the remaining places of same element in the array
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
		
					
				}
				
				
				System.out.println(a[i]);
				System.out.println(k);
				//k=1 if a number is unique in the array
				if(k==1)
				{
					System.out.println(a[i]+"is unique number");
				}
			}
	
			
		}
				
	}

}
