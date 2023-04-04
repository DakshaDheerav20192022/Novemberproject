package pkg1;

   class rbi
   {
	   public rbi()
	   {
		   System.out.println("rbi constructor");
	   }
	   int fd=2000;
	   public void interestrate()
	   {
		 System.out.println("interest rate is 6%");  
	   }
	   public void annualrate()
	   {
		   System.out.println("annual rate is 12%");
	   }
   }
   
   class sbi extends rbi
   {
public  sbi()
{
	super();
}
	@Override
	public void annualrate() {
		// TODO Auto-generated method stub
		System.out.println("annual rate is 15%");
		super.annualrate();
	}

	@Override
	public void interestrate() {
		// TODO Auto-generated method stub
		System.out.println("interest rate is 7%");
		super.interestrate();
		System.out.println(super.fd);
		
		
	}
	   
   }
public class polyoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sbi ob=new sbi();
ob.interestrate();
ob.annualrate();

	}

}
