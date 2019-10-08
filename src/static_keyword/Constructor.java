package static_keyword;
class Machine {
	private String name;
	private int code;
	public Machine() {
		System.out.println("Constructor running");
		name = "Veer";
	}
	public Machine(String name) {
		System.out.println("Second Constructor");
		this.name=name;
	}
	public Machine(String name, int code) {
		
		System.out.println("Third Constructor");
		this.name = name;
		this.code = code;
	}
}
public class Constructor {

	public static void main(String[] args) {
		Machine m = new Machine();
		
		Machine m1 = new Machine("Black");
		Machine m2 = new Machine("Green", 7);

	}

}
