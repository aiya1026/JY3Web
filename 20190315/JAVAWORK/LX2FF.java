import java.util.*;
public class LX2FF
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������x:");
		int num = scanner.nextInt();
		
		int y = f(num);
		System.out.println(y);
		
	}
	public static int f(int c)
	{
		int result = c*c -2*c + 4;
		return result;
	}
}