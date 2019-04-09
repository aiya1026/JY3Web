package com.neuedu.test;
/**
 * 统计字符数组 char[ ] chs = {'统'，'计'，'一'，'个'，'字'，'符'，'在'，'字'，'符'，'串'，'中'}中字符 ’字‘出现的位置
 * @author lx
 *
 */
public class Work2 {
          public static void main(String[] args)
          {
        	  char[] chas= {'统','计','一','个','字','符','在','字','符','串','中'};
        	  char unm = '字';
        	  for(int i=0;i<=chas.length-1;i++)
        	  {
        		  if(chas[i] == unm) 
        		  {
        			  System.out.print(i+1);
        		  }
        	  }
          }
}
