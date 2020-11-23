package com.classprograms;


public class Mysql {
	public static void main(String[] args) throws Exception  {
		System.out.println("static method");
			Class.forName("com.classprograms.oracle");
		
	}
	}
	class oracle
	{
		static {
			System.out.println("Oracle static block");
		
	}
	}

