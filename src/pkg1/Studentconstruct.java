package pkg1;

public class Studentconstruct {
	int studid;
	String studname;
	String course;
	public Studentconstruct(int studid,String studname,String course)
	{
		this.studid=studid;
		this.studname=studname;
		this.course=course;
	}
	public void display()
	{
		System.out.println("studid="+studid);
		System.out.println("studname="+studname);
		System.out.println("course="+course);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentconstruct ob=new Studentconstruct(101,"dhyan","Meanstack");
Studentconstruct ob1=new Studentconstruct(102,"dheerav","DataScientist");
ob.display();
ob1.display();
	}

}
