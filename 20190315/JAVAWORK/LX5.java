import java.util.Scanner;
public class LX5
{
	public static void main(String[] args)
	{
		//接受键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int a = sc.nextInt();
		System.out.println("您输入的值:"+a*a);
		//1光年=946080000000 * 4.2
		//0.45m=0.00045km
		double bird = 0.00045;
		double lightYear = 946080000000.0 * 4.2;
		System.out.println(lightYear / bird);
		//v^=2gh
		double x = 2 * 9.8 * 384;
		System.out.println(Math.sqrt(x)); 






	}
}