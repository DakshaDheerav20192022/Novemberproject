package pkg1;
interface animals
{
	void category();
	
}
interface flowers
{
	 void category1();
}
class cat implements animals,flowers
{

	@Override
	public void category1() {
		// TODO Auto-generated method stub
		
		
			System.out.println("rose");
		}
	

	@Override
	public void category() {
		// TODO Auto-generated method stub
		
			System.out.println("cat breed");
		}
	}
	

public class interfaceabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cat ob=new cat();
ob.category();
ob.category1();
	}

}
