package arraysdemo;

public class smallest_num_in_a_matrix {
	
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
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
		    }
		}
		System.out.println(min);
	}

}
