import java.util.*;
public class LX032
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������x:");
		int x = scanner.nextInt();

		int y = f(x);
		System.out.println(y);
	}
	public static int f(int z)
	{
		int s = z++;
		return s;
	}
}