import java.util.*;
public class XT02
{
	public static void main(String[] args)
	{
		int num = 50;
		char c = getIntToChar(num);
		System.out.println(c);
	}
	//定义int转char的方法
	public static char getIntToChar(int num)
	{
		char char1 = (char)num;
		return char1;
	}
}  