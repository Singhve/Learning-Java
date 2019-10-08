package static_keyword;

public class Static_Counter {

	static int count=0;
	Static_Counter(){
	count++;
	System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_Counter c1=new Static_Counter();
		Static_Counter c2=new Static_Counter();
		Static_Counter c3=new Static_Counter();
	}

}
