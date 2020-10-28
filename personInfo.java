class Person
{
static int person_id;
String person_name;
static int Salary;
String person_contactNumber;
String Address;
String Country;
}
class Department
{
static int dept_Id;
String deptName;
String Location;
}

class personInfo
{
public static void main(String[] args)
{
Person.person_id=100;
Person p1=new Person();
p1.person_name="siddu";
Person.Salary=10000;
p1.person_contactNumber="9908330560";
p1.Address="Bhimavaram";
p1.Country="India";
System.out.println("=============Person Details===========");
System.out.println("Person Id ="+Person.person_id);
System.out.println("person_Name="+p1.person_name);
System.out.println("Person Salary="+Person.Salary);
System.out.println("person_mbl="+p1.person_contactNumber);
System.out.println("Address="+p1.Address);
System.out.println("Country="+p1.Country);
System.out.println("=============Department Details=======");
Department.dept_Id=10;
Department d1=new Department();
d1.deptName="CSE";
d1.Location="Bhimavaram";
System.out.println("Department Id="+Department.dept_Id);
System.out.println("Department Name="+d1.deptName);
System.out.println("Loaction="+d1.Location);
}
}