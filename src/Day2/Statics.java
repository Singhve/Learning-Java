package Day2;

public class Statics {
	static int i;
	static {
			i=++i+i++-++i*i--;
	} 
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(i);

	}

}
