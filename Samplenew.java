package com.classprograms;

class sql
{
	static {
		System.out.println("Mysql static block");
	}
	sql()
	{
		System.out.println("Mysql constructor");
	}
}
class java{
	static {
		System.out.println("java static block");
	}
	java()
	{
		System.out.println("java constructor");
	}
}
public class Samplenew {
static {
	System.out.println("static block");
}
	public static void main(String[] args) throws Exception {
		System.out.println("static method");
		
		Class c=Class.forName("com.classprograms.sql");
		Class c1=Class.forName("com.classprograms.java");
		c.newInstance();
		c1.newInstance();

	}
}

