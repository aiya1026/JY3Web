package come.work.ai;

public class User {
	//构造器
	public User() {
		//初始化数据
		usernames = new String[] {"hello"};
		psw = new String[] {"123456"};
	}
	
	
	String username;
	
	String password;
	
	//模拟存放的数据
	String[] usernames;
	
	String[] psw;
	
	//检查用户名和密码是否正确
	public boolean checkUser(String username,String password)
	{
		//循环用户数组
		for(int i=0;i<=usernames.length;i++)
		{
			//判断用户数组里是否有输入的用户名
			if(usernames[i].equals(username) && psw[i].equals(password))
			{
				return true;
			}
	
		}
		return false; 
	}

}
