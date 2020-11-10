package com.Assignments;
import java.util.sid;
import java.io.ObjectStreamClass;

public class Objectstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // create a new object stream class for Integers  
        ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);  
  
        // get the value field from ObjectStreamClass for integers  
        System.out.println("" + osc.getField("price"));  
  
        // create a new object stream class for Calendar  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(sid.class);  
  
        // get the Class instance for osc2  
        System.out.println("" + osc2.getField("hi"));  
  
    

	}

}
