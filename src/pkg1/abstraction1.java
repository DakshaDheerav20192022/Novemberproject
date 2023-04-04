package pkg1;
abstract class tv
{
	abstract void nonremotes();
	abstract void remote();
	public void keys()
	{
		System.out.println("touchkeys");
	}
}
class smarttv extends tv
{

	@Override
	void remote() {
		// TODO Auto-generated method stub
		System.out.println("smarttv remote");
	}

	

	@Override
	void nonremotes() {
		// TODO Auto-generated method stub
	System.out.println("smarttv nonremotes");	
	}

	
	}
	

class nonsmarttv extends tv
{

	@Override
	void nonremotes() {
	System.out.println("nonremote nonsmart");	// TODO Auto-generated method stub
		
	}

	@Override
	void remote() {
		
		// TODO Auto-generated method stub
		System.out.println("remote nonsmart ");
	}
	
}
public class abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
smarttv ob=new smarttv();
nonsmarttv ob1=new nonsmarttv();
ob.nonremotes();
ob.remote();
ob1.remote();
ob1.nonremotes();
ob.keys();
	}

}
