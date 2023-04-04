package pkg1;

public class polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
polymor p1=new polymor();
p1.add();
p1.add(10);
p1.add(10,20);


	}
public void add()
{
	int a=10,b=5;
	int c=a+b;
	System.out.println("withoutparameter"+c);
	
}
public void add(int a)
{
	int b=10;
	int c=a+b;
	System.out.println("with one parameter"+c);
}
public void add(int a,double b)
{
	double c=a+b;
	System.out.println("with double parameter"+c);
	
	
}
}
