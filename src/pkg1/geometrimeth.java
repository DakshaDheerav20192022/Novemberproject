package pkg1;

public class geometrimeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	geometrimeth ob=new geometrimeth();	
	ob.circle();
	System.out.println("triangle area="+ob.triangle());
	ob.square(2);
	System.out.println("rectangle area="+ob.rectangle(6, 7));
	}
public void circle()
{
	double r=2;
double area=3.14*(r*r);
System.out.println("area of circle="+area);
	
}
public double triangle()
{
double  b=4,h=1;
	double tri=0.5*(b*h);
	return tri;
}
public void square(int a)
{
	int squ=a*a;
	System.out.println("squ="+squ);
}
public double rectangle(int l,int b)
{
	int rect=l*b;
	return rect;
}

}
