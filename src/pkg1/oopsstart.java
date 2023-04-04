package pkg1;

public class oopsstart {
	int empid;
	String empname;
	String des;
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("des="+des);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
oopsstart ob=new oopsstart();
oopsstart ob1=new oopsstart();
ob.empid=101;
ob.empname="arya";
ob.des="tester";
ob.display();
ob1.empid=102;
ob1.empname="sarayu";
ob1.des="Microbiologist";
ob1.display();


	}

}
