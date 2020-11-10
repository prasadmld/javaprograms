package com.Assignments;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "waiting........";

		try {

			Writer w = new FileWriter("sns.txt");
			w.write(data);
			w.close();
			System.out.println("success");
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
