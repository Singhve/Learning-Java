package super_;//super in method

public class SuperDemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A(2);//prints "In const A"
		B obj=new B(5);//prints out both
	}

}
class A extends Object{		//super class
	public A(){ //super
		//super();//has super by default, will call parent constrctor
		System.out.println("In const A");
	}
	public A(int i){
		super();
		System.out.println("in Const A para");
	}
}

class B extends A{		//sub class
	public B(){
		super();//calls constrctor
		System.out.println("in cout B");
	}
	public B(int i){
		System.out.println("in Const B para");
	}
}

//When you create constructor of sub class u call paretn first