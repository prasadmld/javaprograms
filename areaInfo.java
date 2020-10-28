class Triangle
{
static double base;
static double height;
double area;
}
class Square
{ 
static double side;
double area;
}
class Circle
{
static int radius;
double area;
double circumference;
}
class areaInfo
{
public static void main(String[] args)
{
System.out.println("************Triangle Area*************");
Triangle t1=new Triangle();
Triangle.base=10.0;
Triangle.height=6.0;
t1.area=30.00;
System.out.println("Area of the Triangle is: "+t1.area);
System.out.println("############Square Area###############");
Square s1=new Square();
Square.side=5.0;
s1.area=25.00;
System.out.println("Area of the Square is: "+s1.area);
System.out.println("============Circle area and Circumference========");
Circle c1=new Circle();
Circle.radius=4;
c1.area=40.0;
c1.circumference=10.0;
System.out.println("The Area of the Circle is: "+c1.area);
System.out.println("The Circumference of the Circle is: "+c1.circumference);
}
}