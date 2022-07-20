
public class AustralianTraffic implements Traffic {
	
	public static void main(String[] args) {

        //we need to create an object for interface as we are implementing the methods of an interface in another class		
		Traffic t = new AustralianTraffic();
		t.greenGo();
		t.redStop();
		t.FlashYellow();
		
	}
	public void redStop()
	{
		System.out.println("Stop");
	}
	
	public void greenGo()
	{
		System.out.println("Go");
	}
	
	public void FlashYellow()
	{
		System.out.println("Ready");
	}


}
