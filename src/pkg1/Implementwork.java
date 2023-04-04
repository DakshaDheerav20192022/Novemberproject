package pkg1;

interface Tvremote
{
	void remote();
	
}

interface Smarttvremote extends Tvremote
{
	void nonremote();
	
}
class Tv1 implements Smarttvremote
{

	@Override
	public void remote() {
		// TODO Auto-generated method stub
		
		System.out.println("remote");
	}

	@Override
	public void nonremote() 
	{
		System.out.println("nonremote");
		
	}
	
}

public class Implementwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tv1 ob=new Tv1();
ob.remote();
ob.nonremote();
	}

}
