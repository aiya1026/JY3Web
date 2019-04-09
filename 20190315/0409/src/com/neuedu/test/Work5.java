package com.neuedu.test;
/**
 * 如下例业务是，计算条码验证，描述如下: 题目：en-13 条码验证计算 验证码条码共 13 位，代表了一件商品编码，
 * 前 12 位（692116851128）有具体代表含义，第 13 位是通过如下步骤算出来的:
   第 1 步：取出该数的奇数位和，c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20
   第 2 步：取出该数的偶数位和，c2 = 9 + 1 + 6 + 5 + 1 + 8 = 30
   第 3 步：将"奇数和"不"偶数和的三倍"相加，cc = c1+c2*3 = 20 + 30 * 3 = 110
   第 4 步：取结果的个位数（对 10 取余）：110 的个位数为（110%10=0）
   第 5 步：用 10 减去这个个位数：10 - 0 = 10
   第 6 步：对得到的数再取个位数（对 10 取余）：10%10=0
   所以校验码为 0
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
