import java.util.*;
public class ST1
{
	public static void main(String[] args)
	{
		//������������Ķ���
		Scanner scanner = new Scanner(System.in);
		//�����ʼ���˻���������
		char userName = 'a';
		char passWord = 'b';
		System.out.print("�������˻���:");
		//���ܼ�������ĵ�һ���ַ���
		String inputUser = scanner.next();
		System.out.print("����������:");
		//���ܼ�������ĵڶ����ַ���
		String inputPsw = scanner.next();
		//��������ȡ���ַ��еĵ�һ���ַ�
		char c1 = inputUser.charAt(0);
		//��������ȡ�������еĵ�һ���ַ�
		char c2 = inputPsw.charAt(0);
		
		//if(c1 == userName && c2 == passWord)
		if(c1 == userName || c2 == passWord)
		{
		 System.out.println("success");
		}
	}
}