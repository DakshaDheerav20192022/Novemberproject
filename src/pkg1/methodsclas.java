package pkg1;

public class methodsclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method without returntype and no parameters
methodsclas ad1=new methodsclas();
	ad1.add();
	System.out.println(ad1.sub(20,3));	
	System.out.println(ad1.mul());
	ad1.div(4,2);
	}


	//method without returntype and no parameters
public void add()
{
int a=20,b=10;
int add=a+b;
System.out.println("add="+add);
}
//method with returntype and  parameters
public int sub(int c,int d)
{
	int sub=c-d;
	return sub;
	
}
////method with returntype and no parameters
public double mul()
{
	double a=10,b=40;
	double mul=a*b;
	return mul;
	
}
////method without returntype and parameters
public void div(int a,int b)
{
	int div=a/b;
	System.out.println("div"+div);
}
}

