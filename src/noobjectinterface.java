interface icecream
{
	public void rate();
}
class vanilla implements icecream
{

	@Override
	public void rate() {
		// TODO Auto-generated method stub
		System.out.println("rate is 30rs");
	}
	
	
}
class chocolate implements icecream
{

	@Override
	public void rate() {
		// TODO Auto-generated method stub
		System.out.println("rate is 50rs");
	}
	
}
public class noobjectinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
icecream ob=new vanilla();
ob.rate();
ob=new chocolate();
ob.rate();
	}

}
