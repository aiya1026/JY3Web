package come.work.ai;
 /**
  * �������������¹���
  * a ������һ�� 
  * b �����б�һ��
  * ����ֵ���Ͳ�ͬ�����ɷ�������
  * ���������뷵��ֵ����û�й�ϵ
  * ���ط���Ҳ����˵�ǣ�������һ��������ǩ����ͬ�ķ���
  */
public class Point {

	
	public Point() {
		
	}
	
	public Point(int p)
	{
		this(p,p);  
	}
	
	public Point(byte a,int b)
	{
		this.x = a;
		this.y = b;
	}
	
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	int x;
	
	int y;
		
}
