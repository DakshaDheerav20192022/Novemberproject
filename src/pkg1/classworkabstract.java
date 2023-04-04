package pkg1;
interface BasicAnimal
{
	void cat();
void sleep();

	
}
class monkey
{
	public void jump()
	{
		System.out.println("monkey can speak");
	}
	public void bite()
	{
		System.out.println("monkey can bite");	
	}
}


class human extends monkey implements BasicAnimal
{
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		super.jump();
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		super.bite();
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("cat cannot speak");	
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("human and cat can sleep");
	}

	public void speak()
	{
		System.out.println("human can speak");
	}
	
}
public class classworkabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
human ob=new human();
ob.cat();
ob.sleep();
ob.speak();
ob.jump();
ob.bite();
	}

}
