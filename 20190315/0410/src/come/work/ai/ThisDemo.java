package come.work.ai;

public class ThisDemo {
	
	public static void main(String[] args) {
		//ʵ��������
		Money money = new Money(100,"China");
		System.out.println(money.value);
		System.out.println(money.country);
	}

}
class Money
{
	//�޲ι�����
	public Money()
	{
		
	}
	//�вι�����
	public Money(int value,String country)
	{
		this.value = value;
		this.country = country;
	}
	
	//��ֵ
	int value; 
	
	//����
	String country;
	
	
	
	
}