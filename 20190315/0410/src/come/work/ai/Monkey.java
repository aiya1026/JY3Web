package come.work.ai;

public class Monkey {
		
	//�޲ι�����
	public Monkey() {
		mName = "���";
		type = "ʯ��";
	}
	//�������췽�� �в����Ĺ��췽��(��δд�޲Σ��вι�������Ĭ�ϸ����޲εĹ�����)
	public Monkey(String name,String type1) {
		mName = name;
		type = type1;
	}
	
	String mName;
	
	String type;
	
	public void jump()
	{
		System.out.println("��");
	}
	
	public void fiy()
	{
		System.out.println("��");
	}
	
	public static void main(String[] args) {
		Monkey sun2 = new Monkey();
		System.out.println(sun2.type);
		Monkey sun = new Monkey("�����","⨺�");
		System.out.println(sun.type);
	}
	
	
}
