package com.Assignments;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferedwriterclass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		  FileWriter writer = new FileWriter("h2.txt");  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write("Welcome to my world.");  
		    buffer.close();  
		    System.out.println("Success");  
		    }  
		}  
