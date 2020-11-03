package classprograms;
abstract class Car
{
	abstract void Cost();
	abstract void Milage();
}
public class nestedClass {
	public static void main(String[] args) {
		Car x=new Car() {
			void Cost()
			{
				System.out.println("cost of the car is 50 lakhs");
			}
			void Milage()
			{
				System.out.println("milage of the car is 15kmph");
			}
		};
		x.Cost();
		x.Milage();

	}

}
