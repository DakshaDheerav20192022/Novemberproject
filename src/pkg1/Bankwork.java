package pkg1;

import java.util.Scanner;

interface bank

{
	void accountdetails(String name);
	void deposit();
	void withdraw();
	
}
class boi implements bank
{
	int accbalance=10000;
	
	Scanner sc=new Scanner(System.in);



	@Override
	public void accountdetails(String name)
	{
		System.out.println("enter accountno");
		int accno=sc.nextInt();
		System.out.println("accountdetails="+accno);	
		System.out.println("name"+name);
		System.out.println("accountbalance"+accbalance);
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	
	public void deposit() 
	{
		
		System.out.println("enter amount to deposit");
		int depositamount=sc.nextInt();
		System.out.println("depositamount"+depositamount);
		// TODO Auto-generated method stub
		accbalance=depositamount+accbalance;
		System.out.println("current balance="+accbalance);
	}

	@Override
	public void withdraw() {
		
		System.out.println("enter amount to withdraw");
		int withdrawamount=sc.nextInt();
		System.out.println("withdrawamount"+withdrawamount);
		// TODO Auto-generated method stub
		accbalance=accbalance-withdrawamount;
		System.out.println("current balance="+accbalance);
	}
	
}
public class Bankwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
boi ob=new boi();
ob.accountdetails("rithu");
ob.deposit();
ob.withdraw();
	}

}
