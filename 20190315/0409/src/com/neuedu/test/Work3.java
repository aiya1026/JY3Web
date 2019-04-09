package com.neuedu.test;
/**
 * 字符串："123456789012" 将字符串的奇数位数字相加为 c1 = 1 + 3 + 5 + 7 + 9 + 1 
 * 将字符串的偶数位数字相加为 c2 = 2 + 4 + 6 + 8 + 0 + 2
 * @author lx
 *
 */
public class Work3 {
		public static void main(String[] args) {
			String str="123456789012";
			int c1 = 0;
			int c2 = 0;
			for(int i=0;i<=str.length()-1;i+=2)
			{
				char c = str.charAt(i);
				c1 += (int)c-48;
				System.out.println((int)c-48);
				
			}
			System.out.println(c1);
			for(int j=1;j<=str.length()-1;j+=2)
			{
				char c = str.charAt(j);
				c2 += (int)c-48;
				System.out.println((int)c-48);
				
			}
			System.out.println(c2);
		}		
}
