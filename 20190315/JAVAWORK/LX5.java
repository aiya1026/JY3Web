import java.util.Scanner;
public class LX5
{
	public static void main(String[] args)
	{
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������:");
		int a = sc.nextInt();
		System.out.println("�������ֵ:"+a*a);
		//1����=946080000000 * 4.2
		//0.45m=0.00045km
		double bird = 0.00045;
		double lightYear = 946080000000.0 * 4.2;
		System.out.println(lightYear / bird);
		//v^=2gh
		double x = 2 * 9.8 * 384;
		System.out.println(Math.sqrt(x)); 






	}
}