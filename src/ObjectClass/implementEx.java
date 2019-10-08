package ObjectClass;

    interface Bday 
    {
	public void month();//method
	public void day();
	public void year();
	public void age();
}

class veer implements Bday{


	public void month() {
		System.out.println("April");
		
	}
	
	public void day() {
		System.out.println("12");		
	}
	
	public void year() {
		System.out.println("1995");
	}
	
	public void age() {
		System.out.println("20");
	}
}

	public class implementEx
	{
	public static void main(String args[]){
		Bday v1=new veer();
		v1.month();
		v1.day();
		v1.year();
		v1.age();
		
	}
}

