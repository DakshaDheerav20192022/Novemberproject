package pkg1;

public class operatorsra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60;
		int b=30;
		int c;
		//arithmetic
System.out.println("the add of a and b is"+(a+b));
System.out.println("the subtraction of a and b is"+(a-b));
System.out.println("the multiply of a and b is"+(a*b));
System.out.println("the  quitent of a and b is"+(a/b));
System.out.println("the modulos of a and b is"+(a%b));
//relational
System.out.println("the greater than of a and b is"+(a>b));
System.out.println("the lessthan of a and b is"+(a<b));
System.out.println(a==b);
System.out.println(a!=b);
System.out.println("the greater thanor equal to of a and b is"+(a>=b));
System.out.println("the lessthan or equal to of a and b is"+(a<=b));
//logical &&,||,!
//assignment =
System.out.println("a"+(a+=b));
System.out.println("a"+(a-=b));
System.out.println("a"+(a*=b));
System.out.println("a"+(a/=b));

//unary
System.out.println("a"+(a++));
System.out.println("b"+(b++));
System.out.println("a"+(++a));
System.out.println("b"+(++b));
System.out.println("a"+(a--));
System.out.println("b"+(b--));
System.out.println("a"+(--a));
System.out.println("a"+(--b));
//ternary ?:
c=a>b?a:b;
System.out.println("greater is"+c);
//logical
String username="dfjjfjf";
String password="346hhh";
System.out.println(username=="dfjjfjf"&& password=="346hhh");
System.out.println(username=="dggdgd"|| password=="346hhh");





	}

}
