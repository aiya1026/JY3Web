package come.work.ai; 
/**
 * 类
 * 对一类食物的抽象
 * 万物皆对象
 * 
 * 
 * 人        class
 * 行为     =>   方法
 *属性      =>   变量
 * @author lx
 *引用数据类型
 *array
 *class
 *interface
 */
public class Work1 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 18;
		p1.sex = '男';
		p1.height = 180;
		p1.weight = 300.0;
		
		System.out.println("p1的年龄:"+p1.age);
		System.out.println("p1的性别:"+p1.sex);
		System.out.println("p1的身高:"+p1.height);
		System.out.println("p1的体重:"+p1.weight);
		
		
	}
	

}
 class Person
 {
	 //声明变量;
	 //成员变量；
	 int age;
	 
	 char sex;
	 
	 int height;
	 
	 double weight;
	 
	 public void eat()
	 {
		 System.out.println("正在吃饭....");
	 }	 
	 
	 public void sleep()
	 {
		 System.out.println("正在睡觉....");
	 }	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
