package super_;

class Super {
	
	void display() {
		
		System.out.println("Parent");
	}
}

public class Super_Ex2 extends Super {
	
void display() {
	super.display();
	System.out.println("Child");
}
	public static void main(String args[]){
		Super_Ex2 a1=new Super_Ex2();
		a1.display();
	}
}
