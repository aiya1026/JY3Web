import java.util.*;
public class LX07
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������x1:");
		int x1 = scanner.nextInt();
		System.out.print("������y1:");
		int y1 = scanner.nextInt();
		System.out.print("������x2:");
		int x2 = scanner.nextInt();
		System.out.print("������y2:");
		int y2 = scanner.nextInt();
		double l = f(x1,y1,x2,y2);
		System.out.println(l);
	}
	public static double f(int x1,int y1,int x2,int y2)
	{
		double result = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return result;
	}
	
}