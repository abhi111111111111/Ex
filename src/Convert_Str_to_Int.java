
public class Convert_Str_to_Int {

	public  void method1()
	{
String s= "200";
int i = Integer.parseInt(s);
System.out.println("Integer is"+ i);
	}
	
	public void method2()
	 {
		int k = 200;
		String s = Integer.toString(k);
		System.out.println("String is "+s);
	 }
	public static void main(String[] args) 
	{
		Convert_Str_to_Int csti = new Convert_Str_to_Int();
		
		csti.method1();
		csti.method2();
		
		
	}

}
