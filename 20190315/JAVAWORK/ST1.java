import java.util.*;
public class ST1
{
	public static void main(String[] args)
	{
		//创建键盘输入的对象
		Scanner scanner = new Scanner(System.in);
		//定义初始化账户名和密码
		char userName = 'a';
		char passWord = 'b';
		System.out.print("请输入账户名:");
		//接受键盘输入的第一个字符串
		String inputUser = scanner.next();
		System.out.print("请输入密码:");
		//接受键盘输入的第二个字符串
		String inputPsw = scanner.next();
		//根据索引取出字符中的第一个字符
		char c1 = inputUser.charAt(0);
		//根据索引取出密码中的第一个字符
		char c2 = inputPsw.charAt(0);
		
		//if(c1 == userName && c2 == passWord)
		if(c1 == userName || c2 == passWord)
		{
		 System.out.println("success");
		}
	}
}