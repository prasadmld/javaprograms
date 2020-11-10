package com.Assignments;

import java.io.StringReader;

public class Stringreaderclass {

	public static void main(String[] args) throws Exception {  
		String s ="prasad Mld";  
		StringReader reader = new StringReader(s);  
		int k=0;  
		while((k=reader.read())!=-1){  
			System.out.print((char)k);  
		}  
	}  


}


