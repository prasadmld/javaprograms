package com.Assignments;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class ChararrayWriterclass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		  CharArrayWriter out=new CharArrayWriter();    
          out.write("helllo");    
          FileWriter f1=new FileWriter("h2.txt");    
          FileWriter f2=new FileWriter("ravi.txt");    
          out.writeTo(f1);    
          out.writeTo(f2);     
          f1.close();    
          f2.close();       
          System.out.println("Success...");  
	}

}
