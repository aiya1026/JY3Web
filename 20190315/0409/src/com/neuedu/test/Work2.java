package com.neuedu.test;
/**
 * ͳ���ַ����� char[ ] chs = {'ͳ'��'��'��'һ'��'��'��'��'��'��'��'��'��'��'��'��'��'��'��'��'}���ַ� ���֡����ֵ�λ��
 * @author lx
 *
 */
public class Work2 {
          public static void main(String[] args)
          {
        	  char[] chas= {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
        	  char unm = '��';
        	  for(int i=0;i<=chas.length-1;i++)
        	  {
        		  if(chas[i] == unm) 
        		  {
        			  System.out.print(i+1);
        		  }
        	  }
          }
}
