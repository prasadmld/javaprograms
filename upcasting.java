interface Vehicle
{
void cost();
void milage();
}
class Bike implents Vehicle
{
void cost()
{
System.out.println("Cost of Bike is 130000");
}
void milage()
{
System.out.println("Milage of Bike is 40kmph");
}
}
class Car implements Vehicle
{
void cost()
{
System.out.println("Cost of Car is 830000");
}
void milage()
{
System.out.println("Milage of Car is 10kmph");
}
}
class interface
{
public static void main(String[] args)
{
Bike b=new Bike;
b.cost();
b.milage();
b=new Car();
b.cost();
b.milage();
}
}

b.cost();
b.milage();
}
}