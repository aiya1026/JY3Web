package come.work.ai;

import java.util.Scanner;

public class UserTest {
	
	
	public static void main(String[] args) {
		//创建一个user的对象
		User user = new User();
		//创建一个键盘输入的对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = scanner.next();
		System.out.println("请输入密码：");
		String psw = scanner.next();
		//调用检查用户的方法
		boolean checkUser = user.checkUser(username, psw);
		//System.out.println(checkUser);
		System.out.println(checkUser == true ? "登录成功":"登录失败");
		//关闭水流
		scanner.close();
	}

}
