package pkg1;
class member

{
	public void display() {
		String name="taniya";
		int age=20;
		long phoneno=9878452345l;
		String address="melorastreet";
		int salary=200000;
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("phoneno="+phoneno);
System.out.println("address="+address);
System.out.println("salary="+salary);
		
		
		
	}
}
class employee extends member
{
	String specilization="teamlead";
}
class manager extends member
{
	
String  dept="QA";
}


public class inheritancework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1=new employee();
e1.display();
System.out.println(e1.specilization);
manager m1=new manager();
m1.display();
System.out.println(m1.dept);

	}

}
