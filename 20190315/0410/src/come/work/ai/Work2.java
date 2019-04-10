package come.work.ai;

public class Work2 {
	
	public Work2() {
		System.out.println("默认构造方法");
	}
	
	 //成员变量
	int age;
	
	String str;
	
	int[] nums;
	
	double price;
	
	
	public static void main(String[] args) {
		//int i = 3/0;(算术异常)
		//构造器|构造方法
		Work2 work2 = new Work2();
		//Work2 work2 = null(空指针异常)
		System.out.println(work2.price);
	}
	

}
