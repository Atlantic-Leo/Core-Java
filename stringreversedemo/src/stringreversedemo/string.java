package stringreversedemo;

public class string {
	
	public static void main(String[] args) {
		

		String  s ="Rahul";
		
		String tString="";
		//-1 because the index of last char "l" will be 4 and s.length() will be 5
		for(int i=s.length()-1;i>=0;i--)
		{
			tString=tString+s.charAt(i);
			
		}
		
		System.out.println(tString);
		
		
		
		
	}
	
	
	

}
