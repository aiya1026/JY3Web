public class DIZHU
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i<25)
		{
			System.out.println(i++%7);
			if(i%7==0)
			{
				System.out.println(i);	
			}
		}
	}
}