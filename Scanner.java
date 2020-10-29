import java.util.Scanner;
class Employee
{
int id;
String first_name;
String last_name;
String Designation;
int salary;
String Address;
String pincode;
String Contact_number;
}
class scanner
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("==========enter employee details=========");
Employee sid=new Employee();
System.out.println("Enter emp id");
sid.id=sc.nextInt();
System.out.println("Enter emp firstname");
sid.first_name=sc.next();
System.out.println("enter emp lastname");
sid.last_name=sc.next();
System.out.println("enter emp designation");
sid.Designation=sc.next();
System.out.println("enter emp salary");
sid.salary=sc.nextInt();
System.out.println("enter emp pincode");
sid.pincode=sc.next();
System.out.println("enter emp mbl number");
sid.Contact_number=sc.next();
System.out.println("emp_id is:="+sid.id);
System.out.println("First Name is:="+sid.first_name);
System.out.println("Last Name is:="+sid.last_name);
System.out.println("Designation is:="+sid.Designation);
System.out.println("Salary is:="+sid.salary);
System.out.println("Pincode is:="+sid.pincode);
System.out.println("Contact_number is:="+sid.Contact_number);

}
}
 


