class Car
{
public void Cost()
{
System.out.println("No milage");
}
public void Milage()
{
System.out.println("No milage");
}
}
class Audi extends Car
{
public void Cost()
{
System.out.println("Audi cost is 50lakhs");
}
public void Milage()
{
System.out.println("Audi Milage is 10kmph");
}
}
class BMW extends Car
{
public void Cost()
{
System.out.println("BMW cost is 80lakhs");
}
public void Milage()
{
System.out.println("BMW Milage is 15kmph");
}
}
class methodOveridding
{
public static void main(String[] args)
{
Car x=new Car();
x.Cost();
x.Milage();
x=new Audi();
x.Cost();
x.Milage();
x=new BMW();
x.Cost();
x.Milage();
}
}

