package pkg1;
class p
{
 public int b=20;
}
public class accessmodify1 {
public int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//protected int a=10;
 p ob=new p();
System.out.println(ob.b);
	}
 protected void add()
{
	System.out.println("add");
}
}
