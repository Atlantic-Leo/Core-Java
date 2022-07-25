package arraysdemo;

public class multi_dimensional_arrays {
	
	public static void main(String[] args) {
		
		int a[][]=new int[2][3];
		//2 rows and 3 columns

		a[0][0]=2;
		a[0][1]=9;//first row second column
		a[0][2]=10;
		a[1][0]=6;
		a[1][1]=4;
		a[1][2]=3; //second row third column
		
		//i=0 because index always starts with 0
		//outer for loop stands for row and inner for loop stands for column
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		
		}
		
	}
	

	
	
	
	
	

}







