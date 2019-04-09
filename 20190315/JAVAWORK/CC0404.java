public class CC0404
{
	public static void main(String[] args)
	{
		//找出偶数位数字
		//String str = "789654321";
		//for(int i=1;i<str.length();i+=2)
		//{
			//char c = str.charAt(i);
			//System.out.print(c);
		//}



		//找出1-10内3的倍数的和
		//int i = 1;
		//int sum = 0;
		//while(i<=10)
		//{
			//if(i%3==0)
			//{
				//sum += i;
			//}
			//i++;
		//}
		//System.out.println(sum);



		//用循环打印九九乘法表
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");	
			}
			System.out.println("\n");

		}

	}
}