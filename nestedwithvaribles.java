package classprograms;
class Siddu {
	  int x = 10;
	  int y=15;
	  int z=50;

	  class Mld  {
		  int x=20;
	    int y = 5;
	    int z=45;
	    
	  }
	}
public class nestedwithvaribles {
	public static void main(String[] args) {
	Siddu s=new Siddu();
	Siddu.Mld m=s.new Mld();
	System.out.println(m.x + s.x);
	System.out.println(m.y+s.y);
	System.out.println(m.z+s.z);
}
}
