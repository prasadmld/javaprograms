class Square
{
int a;
public Square(int a)
{
this.a=a;
System.out.println("Square is:="+a*a);
}
}
class Sum extends Square
{
int b;
public Sum(int a,int b)
{
super(a);
this.b=b;
System.out.println(a+b);
}
} 
class singlelevelInheritence
{
public static void main(String[] args)
{
Square s1=new Square(5);
Sum s2=new Sum(5,10);
System.out.println(s1.a);
System.out.println(s2.a);
System.out.println(s2.b);
}
}