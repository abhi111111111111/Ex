

	
abstract class ABs
{
	abstract void method1();
}

public class AbstractExample 
{
	public static void main(String[] args) 
	{
	
// AbstractExample ae = new AbstractExample();
ABs a = new ABs() {
	
	@Override
	void method1()
	{
		System.out.println("Abstract method body");
		
	}
};
	}

}
