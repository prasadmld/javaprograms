class Book
{
String Title;
String Author;
int Pages;
String Color;
double Price;
String Company;
String Address;
String Postalcode;
String Contact_number;
public Book()
{
this.Title="java";
this.Author="James Gosling";
this.Pages=200;
this.Color="White";
this.Price=500.50;
this.Company="Sun Micro Systems";
this.Address="America";
this.Postalcode="534202";
this.Contact_number="9908330560";
}
public 	Book(String Title,String Author,int Pages,String Color,double Price,String Company,String Address,String Postalcode,String Contact_number)
{
this.Title=Title;
this.Author=Author;
this.Pages=Pages;
this.Color=Color;
this.Price=Price;
this.Company=Company;
this.Address=Address;
this.Postalcode=Postalcode;
this.Contact_number=Contact_number;
}
public void bookInfo()
{
System.out.println("===================Book Details==============");
System.out.println("Book Title is:="+this.Title);
System.out.println("Author is:="+this.Author);
System.out.println("Pages are:="+this.Pages);
System.out.println("Color is:="+this.Color);
System.out.println("Price is:="+this.Price);
System.out.println("Company is:="+this.Company);
System.out.println("Address is:="+this.Address);
System.out.println("Postalcode is:="+this.Postalcode);
System.out.println("Contact_number is:="+this.Contact_number);
}
}
class bookStore
{
public static void main(String[] args)
{
Book b=new Book();
b.bookInfo();
Book b1=new Book("C","Dennis Ritche",300,"Blue",450.12,"Oracle","Washington","534201","7729947677");
b1.bookInfo();
}
}

