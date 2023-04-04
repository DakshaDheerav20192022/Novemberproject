package pkg1;
//singleinheritance
class animal {

public void eat()
{
	System.out.println("animal eat");
}
}
class dog extends animal
{
	public void bark()
	{
		System.out.println("bark");
		
	}
	
}
public class inheritsingle
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog ob=new dog();
		ob.bark();
		ob.eat();
	}

}

