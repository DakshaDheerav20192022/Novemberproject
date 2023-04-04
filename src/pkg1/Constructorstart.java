package pkg1;

public class Constructorstart {
	int empid;
	String empname;
	String des;
	public Constructorstart(int empid,String empname,String des)
	{
		this.empid=empid;
		this.empname=empname;
		this.des=des;
	}
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("des="+des);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructorstart ob=new Constructorstart(1,"yan","developer");
ob.display();
	}

}
