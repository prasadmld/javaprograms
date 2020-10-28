class Candidate
{
static int id;
String name;
String Branch;
String Address;
String phone_no;
String country;
static double ssc_per;
static double inter_per;
static double degree_per;
static double pg_per;
}
class candidateInfo
{
public static void main(String[] args)
{
Candidate.id=1;
Candidate c1=new Candidate();
c1.name="siddu";
c1.Branch="CSE";
c1.phone_no="9908330560";
c1.Address="Bhimavaram";
c1.country="India";
Candidate.ssc_per=73.5;
Candidate.inter_per=78.5;
Candidate.degree_per=79.2;
Candidate.pg_per=79.3;
System.out.println("===============Candidate Details===========");
System.out.println("Candidate Id="+Candidate.id);
System.out.println("Name="+c1.name);
System.out.println("Branch="+c1.Branch);
System.out.println("Mobile Number="+c1.phone_no);
System.out.println("Address="+c1.Address);
System.out.println("Country="+c1.country);
System.out.println("10th percentage="+Candidate.ssc_per);
System.out.println("Inter percentage="+Candidate.inter_per);
System.out.println("Degree percentage="+Candidate.degree_per);
System.out.println("PG percentage="+Candidate.pg_per);
}
}



