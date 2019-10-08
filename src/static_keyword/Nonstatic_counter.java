package static_keyword;

public class Nonstatic_counter {

int count =0;//gets meomry when instance is created

	Nonstatic_counter(){
	count++;
	System.out.println(count);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nonstatic_counter c1=new Nonstatic_counter();
		Nonstatic_counter c2=new Nonstatic_counter();
		Nonstatic_counter c3=new Nonstatic_counter();


	}

}
