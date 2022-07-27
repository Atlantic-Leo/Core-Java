package super_keyword_demo;

public class child extends parent{
	
	//super keyword refers to the parent class variables , methods and constructors
	
	String nameString="child";
	
	public child()
	{
		super();//always should be the first line
		System.out.println("Constrcutor of child class");
	}
	
	public void getStringData()
	{
		System.out.println(nameString);
		System.out.println(super.nameString);
	}
	
	public void getData()
	{
	    super.getData();
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		
		child c = new child();
		c.getStringData();
		c.getData();
	
		
	}

}
