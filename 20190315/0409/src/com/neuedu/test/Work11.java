package com.neuedu.test;

/**
 * 统计字符串“统计一个字符在字符串中的所有位置”中字符 '字'出现的所有位置
 * @author lx
 *
 */
public class Work11 {
           public static void main(String[] args) {
           String a="统计一个字符在字符串中的所有位置";
           char b='符';
           for(int i=0;i<=a.length();i++)
           {
        	   if(a.charAt(i) == b) {
        		   System.out.println(i+1);
        	   }
           }
        }
     }
