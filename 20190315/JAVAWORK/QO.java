public class QO
{
	public static void main(String[] args)
	{
		String str ="789654321";
		for(int i=1;i<str.length();i+=2)
		{
			char c = str.charAt(i);
			System.out.print(c);
		}
	}
}