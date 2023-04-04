package pkg1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class exceptionpgm {

	public static void main(String[] args)  
	{
		try {
			FileInputStream f=new FileInputStream("E://shristibugreport.xlsx");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
try
{
	// TODO Auto-generated method stub

int c=30/0;
}
catch(Exception a)
{
System.out.println("arithmetic");
System.out.println(a.getMessage());
}
System.out.println("hi");
try
{
	String s=null;
	System.out.println(s.length());
}
catch(Exception e)
{
System.out.println("nullpointerexception");	
}
	}

}
