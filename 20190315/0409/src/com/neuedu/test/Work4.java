package com.neuedu.test;
/**
 * 将一个整数（56123）翻转（32165）
 * @author lx
 *
 */
public class Work4 {
           public static void main(String[] args) {
			String num = "56123";
			for(int i=num.length()-1;i>=0;i--)
           {
        	   System.out.print(num.charAt(i));
           }
}}
