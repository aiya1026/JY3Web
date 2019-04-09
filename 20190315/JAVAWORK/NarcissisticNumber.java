public class NarcissisticNumber
{
	public static void main(String[] args)
	{
		//100-999中的水仙花数。
		//153=1^3+5^3+3^3.(水仙花数)
		for(int i=100;i<=999;i++)
		{
			int a=i/100;
			int b=i/10%10;
			int c=i%10;
			double result = Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
			{
				if(i==result){
					System.out.println(i);
				}
			}
		}
		

	}
}