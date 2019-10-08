package ObjectClass;
interface animal
{
public void makesound();
public void eat();
public void sleep();
}


class dog implements animal
{
public void makesound()
{
System.out.println("baawww");
}
public void eat()
{
System.out.println("meat");
}
public void sleep()
{
System.out.println("at night");
} 
}
class cat implements animal
{

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("baawww");

		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("baawww");

		
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("baawww");

		
	}
	
}
public class animal1
{
public static void main(String[] args)
{
animal a1=new dog();
a1.makesound();
a1.eat();
a1.sleep();
animal c1=new cat();
c1.makesound();
c1.eat();
c1.sleep();
}
}