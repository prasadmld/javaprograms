package classprograms;
class Employee
{
	static class Department
	{
		void Announcement()
		{
			System.out.println("CSE Results are declared");
		}
		static void Result()
		{
			System.out.println("Results kept in website");
		}
	}
}
public class nestedwithstatic {
	public static void main(String[] args) {
		Employee.Department cse=new Employee.Department();
		cse.Announcement();
		Employee.Department.Result();
	}

}
