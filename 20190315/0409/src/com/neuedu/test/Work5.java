package com.neuedu.test;
/**
 * ������ҵ���ǣ�����������֤����������: ��Ŀ��en-13 ������֤���� ��֤�����빲 13 λ��������һ����Ʒ���룬
 * ǰ 12 λ��692116851128���о�������壬�� 13 λ��ͨ�����²����������:
   �� 1 ����ȡ������������λ�ͣ�c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20
   �� 2 ����ȡ��������ż��λ�ͣ�c2 = 9 + 1 + 6 + 5 + 1 + 8 = 30
   �� 3 ������"������"��"ż���͵�����"��ӣ�cc = c1+c2*3 = 20 + 30 * 3 = 110
   �� 4 ����ȡ����ĸ�λ������ 10 ȡ�ࣩ��110 �ĸ�λ��Ϊ��110%10=0��
   �� 5 ������ 10 ��ȥ�����λ����10 - 0 = 10
   �� 6 �����Եõ�������ȡ��λ������ 10 ȡ�ࣩ��10%10=0
   ����У����Ϊ 0
 * @author lx
 *
 */
public class Work5 {
     public static void main(String[] args) {
		String str = "692116851128";
		int c1 = 0;
		int c2 = 0;
		int cc = 0;
		int a = cc;
		for(int i=0;i<=str.length()-1;i+=2)
		{
			char c = str.charAt(i);
			c1 += (int)c-48;
		}
		System.out.println(c1);
		for(int j=1;j<=str.length()-1;j+=2)
		{
			char c = str.charAt(j);
			c2 += (int)c-48;
		}
		System.out.println(c2);
		cc = c1+c2*3;
		System.out.println(cc);
		a = cc%10;
		System.out.println(a);
		int b = 10-a;
		System.out.println(b);
		int c = b%10;
		System.out.println(c);
	}
}
