package come.work.ai;

import java.util.Scanner;

/**
 * ����һ��book����
 * Ҫ��
 *   ����
 *   ҳ��
 *   ��Ǯ
 *   ����
 * ISBN
 *   ����
 *   ������
 *   
 *   ��Ϊ:
 *   ����
 *   �ղ�
 *   ���� ���� ���� ���ؼ۸�
 * @author lx
 *
 */
public class Book {
	
	String bookName;
	
	int pageNum;
	
	double price;
	
	String author;
	
	String ISBN;
	
	String bookType;
	
	String press;
	
	boolean isCollection;
	
	
	public void readbook()
	{
		System.out.println("����.....");
	}
	
	public boolean getCollectionStatus()
	{
		return isCollection;
	}
	
	public double getBookPrice()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����빺�������:");
		int nextInt = scanner.nextInt();
		return price*nextInt;
	}
 }
