package come.work.ai;

public class Monkey {
		
	//无参构造器
	public Monkey() {
		mName = "悟空";
		type = "石猴";
	}
	//两个构造方法 有参数的构造方法(若未写无参，有参构造器会默认覆盖无参的构造器)
	public Monkey(String name,String type1) {
		mName = name;
		type = type1;
	}
	
	String mName;
	
	String type;
	
	public void jump()
	{
		System.out.println("跳");
	}
	
	public void fiy()
	{
		System.out.println("飞");
	}
	
	public static void main(String[] args) {
		Monkey sun2 = new Monkey();
		System.out.println(sun2.type);
		Monkey sun = new Monkey("假悟空","猕猴");
		System.out.println(sun.type);
	}
	
	
}
