
public class invertedpyramid {
	

		public static void main(String[] args) {
			
	        int k=1;
	        
	        //outer loop will run four times
	        //run the loop from reverse if necessary to build the required logic
	        //analyse and think to create the outer and innner for loops
	        //analyse how many times outer loop should run and for how many times innner for loop should run for each run of the outer for loop
			for(int i=4;i>0;i--)
			{
				for(int j=0;j<=4-i;j++)
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


