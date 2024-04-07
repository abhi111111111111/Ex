
public class ReverseString {

	public static void main(String[] args) 
	{
	String str = "abhishek", nstr = "";
	char ch;
	System.out.println("Orignal String "+ str);
for (int i=0;i<str.length();i++)
{
	ch=str.charAt(i);
	nstr=ch+nstr;
}
System.out.println("Reverse String "+ nstr);
	}

}
