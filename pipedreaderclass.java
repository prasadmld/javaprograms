package com.Assignments;

import java.io.PipedReader;
import java.io.PipedWriter;

public class pipedreaderclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		        try {  
		  
		            final PipedReader read = new PipedReader();  
		            final PipedWriter write = new PipedWriter(read);  
		  
		            Thread readerThread = new Thread(new Runnable() {  
		                public void run() {  
		                    try {  
		                        int data = read.read();  
		                        while (data != -1) {  
		                            System.out.print((char) data);  
		                            data = read.read();  
		                        }  
		                    } catch (Exception ex) {  
		                    }  
		                }  
		            });  
		  
		            Thread writerThread = new Thread(new Runnable() {  
		                public void run() {  
		                    try {  
		                        write.write("siddu".toCharArray());  
		                    } catch (Exception ex) {  
		                    }  
		                }  
		            });  
		  
		            readerThread.start();  
		            writerThread.start();  
		  
		        } catch (Exception ex) {  
		            System.out.println(ex.getMessage());  
		        }  
	}

}
