package super_;//super of object class

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.show();
		obj.abc();
	}
	

}
 class C
 {
	int i=5; 
	public void abc()
	{
		System.out.println("A abc");
	}
 }
 
 class D extends C
 {
	 int i=4;//will not fetch class c "i";
	 public void show()//method
	 {
		 System.out.println(i); //inheritance
		 System.out.println(super.i);
	 }
	 public void abc()
	 {
		 super.abc();//if not it won't print A abc
		 System.out.println("B abc");
	 }
 }