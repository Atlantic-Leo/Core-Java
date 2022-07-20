
public class invertedpyramidanotherway {
	
public static void main(String[] args) {
		
        int k=1;
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(k);
			// \t for giving space between numbers
			System.out.print("\t");
			k++;
			}
			// \n for printing in a new line
			System.out.print("\n");
		}
	}

}
