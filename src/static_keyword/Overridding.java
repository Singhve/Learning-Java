package static_keyword;

/*class Cat {
	public  void meow() {
		System.out.println("meow");
	}
}

class Munchkin extends Cat {
	public  void meow() {
		System.out.println("yawn");
	}
}
public class Overridding {
	public static void main(String args[]) {
		Cat kitty = new Cat();
		Cat munch = new Munchkin();
		kitty.meow();
		munch.meow();
	}
}*/

class Cat {
	public static void meow() {
		System.out.println("meow");
	}
}

class Munchkin extends Cat {
	public static void meow() {
		System.out.println("yawn");
	}
}
public class Overridding {
	public static void main(String args[]) {
		Cat kitty = new Cat();
		Cat munch = new Munchkin();
		kitty.meow();
		munch.meow();
	}
}