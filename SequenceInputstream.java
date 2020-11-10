package com.Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class SequenceInputstream {

	public static void main(String[] args) throws Exception {
		 FileInputStream fis1=new FileInputStream("G://h1.txt");    
		   FileInputStream fis2=new FileInputStream("G://h2.txt");    
		   SequenceInputStream sns=new SequenceInputStream(fis1, fis2);    
		   int j=0;    
		   while((j=sns.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   sns.close();    
		   fis1.close();    
		   fis2.close();    
		  }    
	
	}


