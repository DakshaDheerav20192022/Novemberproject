package pkg1;
class v
{
	public void age()
	{
		int age=80;
		System.out.println("age="+age);
	}
}
class v1 extends v
{
	public void age1()
	{
		int age=55;
		System.out.println("age="+age);	
	}
}
class v2 extends v1
{
	public void age2()
	{
		int age=30;
		System.out.println("age="+age);
	}
}
class v3 extends v2
{
	public void age3()
	{
		int age=15;
		System.out.println("age="+age);
	}
}
public class multilevelinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
v3 ob=new v3();
ob.age3();
ob.age();
ob.age1();
ob.age2();
	}

}
