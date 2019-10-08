package this_;
class parent{
	
	parent p(){
		return (this);
	}
	void a(){
		System.out.println("parent");
	}
	
}
public class Argument_pass extends parent{
	Argument_pass p(){
		return (this);
	}
	void a(){
		System.out.println("child");
	}
public static void main(String args[]){
	new parent().p().a();
	new Argument_pass().p().a();
}
}
