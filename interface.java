interface Vehicle
{
void cost();
void milage();
}
class Bike implements Vehicle
{
public void cost()
{
System.out.println("Cost of Bike is 130000");
}
public void milage()
{
System.out.println("Milage of Bike is 40kmph");
}
}
class Interface
{
public static void main(String[] args)
{
Bike b=new Bike();
b.cost();
b.milage();
}
}
