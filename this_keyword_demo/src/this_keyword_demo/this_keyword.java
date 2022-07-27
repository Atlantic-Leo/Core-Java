package this_keyword_demo;

public class this_keyword {
	
	int a=2;
	
	//this keyword refers to current object and the object scope lies in class level
	
	public void getData()
	{
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		
		this_keyword t = new this_keyword();
		t.getData();
		
	}

}
