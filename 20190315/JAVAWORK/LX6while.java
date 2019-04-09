import java.util.*;
public class LX6while
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.print("请输入一个数:");
		    int a = scanner.nextInt();
			System.out.println("您输入的数是:"+a);
			if(a==-1)
			{
				break;
			}
			System.out.println();
		}
	}
}