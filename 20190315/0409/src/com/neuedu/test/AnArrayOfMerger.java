package com.neuedu.test;

import java.util.Arrays;

/**
 * 现在给出两个数组: 数组A：{1,7,9,11,13,15,17,19} 数组B：{2,4,6,8,10} 两个数组合并为数组c,按升序排列
 * @author lx
 *
 */
public class AnArrayOfMerger {
     public static void main(String[] args) {
		int[] A = {1,7,9,11,13,15,17,19};
		int[] B = {2,4,6,8,10};
		int[] C = new int[A.length+B.length];
		System.out.println(Arrays.toString(C));
		System.arraycopy(A,0,C,0,A.length);
		System.arraycopy(B,0,C,A.length,B.length);//把B的值赋给C;
		System.out.println(Arrays.toString(C));
		for(int i=0;i<C.length-1;i++)
		{
			for(int j=0;j<C.length-1-i;j++)
				if(C[j]>C[j+1])
				{
					int temp = C[j];
					C[j] = C[j+1];
					C[j+1] = temp;
				}
		}
		System.out.println(Arrays.toString(C));
	}
}
