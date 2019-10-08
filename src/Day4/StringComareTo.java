package Day4;

public class StringComareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String e1="Simple";
		//String e2="Simple"; //e1=e2
		//String e2="SImpler"; //e1 is greater than e2
		String e2="less"; //e1 is less then e2
		int ok = e1.compareTo(e2);
		
		if(ok < 0){
			System.out.println("e1 is less then e2");
	}
		else if (ok==0) {
			System.out.println("e1 = e2");
	}
		else {
			System.out.print("e1 is greater then e2");
		}
	}
}


//String compare by compareTo() method