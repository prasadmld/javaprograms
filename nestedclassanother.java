package classprograms;
class University
{
	void Announcement()
	{
		System.out.println("Exams starts from Dec 1");
	}
	class Department
	{
		void examPapers()
		{
			System.out.println("Exam papers are being prepared");
		}
	}
}
public class nestedclassanother {
	public static void main(String[] args) {
		University jntu=new University();
		jntu.Announcement();
		University.Department cse=new University().new Department();
		cse.examPapers();

	}

}
