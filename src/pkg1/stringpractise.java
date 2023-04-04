package pkg1;

public class stringpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="java";
String s2="language";
String s3="java is platform independent";
String s4="java is platform independent language";
System.out.println(s1.concat(s2));
System.out.println(s3.contains("platform independent"));
if(s1.contains("platform independent"))
{
	System.out.println("contains it");
}
else
{
	System.out.println("not contains");
}
String arr[]=s4.split(" ");
for(String v:arr)
{
	System.out.println(v);
	if(v.equals("independent"))
	{
		break;
	}
}
	}

}
