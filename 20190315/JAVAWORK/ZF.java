import java.util.*;
public class ZF
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入要转换的字符:");
		String num = scanner.next();
		//charAt
		//根据指定索引返回char类型的值
		//aaabbcc
		char num = '中'；
		char specialChar = num.charAt(0); 
		int result = getCharToInt(specialChar);
		System.out.println("转换后的字符为:"+result);
	}
	public static int getCharToInt(char c)
	{
		return c;
	}
}