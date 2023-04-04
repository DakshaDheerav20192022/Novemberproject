package pkg1;

public class sfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hello";
String s2="   luminartech";
String s3=new String("World");
String s4="Hello";

String s5="hello";
//stringcomparison

System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s4));
	//concat
	System.out.println(s1.concat(s2));
	//length
	System.out.println(s1.length());
	//startsandnendswith
	System.out.println(s1.startsWith("o"));
	System.out.println(s1.endsWith("o"));
	//upperandlower
	System.out.println(s2.toUpperCase());
	System.out.println(s3.toLowerCase());
	//charAT
	System.out.println(s2.charAt(3));
	//contains
	System.out.println(s2.contains("tech"));
	//trim
	System.out.println(s2.trim());
	//substring
	System.out.println(s1.substring(1,3));
	//split
	String a="hello welcome to my world";
	String arr[]=a.split("");
	for(String v:arr)
	{
		System.out.println(v);
	}
	}
	
	
	
	}


