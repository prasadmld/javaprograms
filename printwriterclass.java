package com.Assignments;

import java.io.File;
import java.io.PrintWriter;

public class printwriterclass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter(System.out);    
		writer.write("my name is prasadmld");        
		writer.flush();  
		writer.close();     
		PrintWriter writer1 =null;      
		writer1 = new PrintWriter(new File("h2.txt"));  
		writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
		writer1.flush();  
		writer1.close();  
	}

}
