package arraysdemo;

public class max_num_in_column_of_min_num {
	//maximum number in the column of a minimum number
	// 3 should be printed in the output
	
	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		//2 rows and 3 columns

		a[0][0]=2;
		a[0][1]=9;//first row second column
		a[0][2]=1;
		a[1][0]=6;
		a[1][1]=4;
		a[1][2]=3; //second row third column
		
		int min =a[0][0];
		int column = 0;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					column=j;
				}
		    }
		}
		
		System.out.println("Minimum number in the matrix : "+min);
		System.out.println("Column number of the minimum number : "+column);
		 
		int max=0;
		//taking 2 rows
		for(int k=0;k<2;k++)
		{
			if(a[k][column]>max)
			{
				max=a[k][column];
			}
		}
		
		System.out.println("Maximum number in the column of minimum number : "+max);
		

		
	}

}
