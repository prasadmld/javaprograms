package com.Assignments;

import java.io.CharArrayReader;

public class Chararrayreaderclass {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		  char[] ary = { 'p', 'r', 'a', 's', 'a', 'd', 'm', 'l', 'd'};  
		    CharArrayReader reader = new CharArrayReader(ary);  
		    int k = 0;  
		    while ((k = reader.read()) != -1) {  
		      char ch = (char) k;  
		      System.out.print(ch + " : ");  
		      System.out.println(k);  
		    }  
		  }  

}
