import java.util.*;
public class LX6while
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.print("������һ����:");
		    int a = scanner.nextInt();
			System.out.println("�����������:"+a);
			if(a==-1)
			{
				break;
			}
			System.out.println();
		}
	}
}