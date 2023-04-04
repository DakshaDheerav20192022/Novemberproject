package pkg1;

class flower
{
	public void category()
	{
		String category="flowers";
		System.out.println("category="+category);
		}
	
}
class smelly extends flower
{
	public void category1()
	{
		String flower="rose";
		System.out.println("flower="+flower);
	}
}
class nonsmelly extends flower
{
	public void category2()
	{
		String flower="blossom";
		System.out.println("flower="+flower);
	}
}
public class hirarchyinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonsmelly s1=new nonsmelly();
		smelly s2=new smelly();
		s1.category2();
		s1.category();
		s2.category1();
		s2.category();

	}

}
