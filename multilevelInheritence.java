class Electronics
{
public void Mobile()
{
System.out.println("1.keypad 2.Touch Screen");
}
public void Oneplus()
{
System.out.println("Oneplus 8");
}
}

class Mobile extends Electronics
{
public void  ordinaryMobile()
{
System.out.println("keypad phones");
}
public void extrordinaryMobile()
{
System.out.println("Touch Scree phones");
}
}
class Oneplus extends Mobile
{
public void Ram()
{
System.out.println("Fastest Ram of oneplus is 8GB");
}
public void Camera()
{
System.out.println("Best Mega pixels of oneplus is 40.pixels");
}
}
class multilevelInheritence
{
public static void main(String[] args)
{
Oneplus op=new Oneplus();
op.Mobile();
op.Oneplus();
op.extrordinaryMobile();
op.Camera();
}
}
