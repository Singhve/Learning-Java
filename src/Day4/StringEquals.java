package Day4;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String e1="What?";
		String e2="What??";
		String e3="What?";
		String e4="wHAT?";
		boolean ok;

	      ok = e1.equals( e2 );
	      System.out.println("Returned Value = " + ok );

	      ok = e1.equals( e3 );
	      System.out.println("Returned Value = " + ok );

	      ok = e1.equalsIgnoreCase( e4 ); //Ignoes UpperCase/LowerCase
	      System.out.println("Returned Value = " + ok );


	}

}

//String compare by equals() method