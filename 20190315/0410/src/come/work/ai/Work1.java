package come.work.ai; 
/**
 * ��
 * ��һ��ʳ��ĳ���
 * ����Զ���
 * 
 * 
 * ��        class
 * ��Ϊ     =>   ����
 *����      =>   ����
 * @author lx
 *������������
 *array
 *class
 *interface
 */
public class Work1 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 18;
		p1.sex = '��';
		p1.height = 180;
		p1.weight = 300.0;
		
		System.out.println("p1������:"+p1.age);
		System.out.println("p1���Ա�:"+p1.sex);
		System.out.println("p1�����:"+p1.height);
		System.out.println("p1������:"+p1.weight);
		
		
	}
	

}
 class Person
 {
	 //��������;
	 //��Ա������
	 int age;
	 
	 char sex;
	 
	 int height;
	 
	 double weight;
	 
	 public void eat()
	 {
		 System.out.println("���ڳԷ�....");
	 }	 
	 
	 public void sleep()
	 {
		 System.out.println("����˯��....");
	 }	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
