class Method
{
public static int add(int a,int b){
System.out.println("Addition of two numbers is");
return a+b;
}  
public static double add(double a,double b){
System.out.println("Addition of two numbers is");
return a+b;
}
public static double add(int a,double b){
System.out.println("Addition of two numbers is");
return a+b;
}
public static double add(double a,int b){
System.out.println("Addition of two numbers is");
return a+b;
}
public static int add(int a,int b,int c)
{
System.out.println("Addition of three numbers is");
return a+b+c;
}  
public void info(char c)
{
System.out.println(c);
}
public void info(char c, int a)  
{
System.out.println(c + " "+a);
}

}
class methodOverloading{  
public static void main(String[] args){  
System.out.println(Method.add(10,10));
System.out.println(Method.add(5.6,2.6)); 
System.out.println(Method.add(4,5.5));
System.out.println(Method.add(11.10,2));
System.out.println(Method.add(5,10,5)); 
Method m=new Method();
m.info('S');
m.info('P',1);

}
} 