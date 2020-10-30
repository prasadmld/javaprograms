abstract class Car
{
abstract void Cost();
abstract void Milage();
public void start()
{
System.out.println("Start with key");
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
class abstractclass
{
public static void main(String[] args)
{
Car x=new Audi();
x.start();
x.Cost();
x.Milage();
x=new BMW();
x.Cost();
x.Milage();
}
}

