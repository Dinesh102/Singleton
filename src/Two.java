
public class Two {

	int a; 
	static Two obj;
	private Two()
	{
		a=10;
	}
	public int getA()
	{
		return a;
	}
	
	public static Two create()
	{
	 obj = new Two();
	 return obj;	
	}
	
}
