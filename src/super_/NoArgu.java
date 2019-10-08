package super_;


class Vehicle{  
	int speed;
	  Vehicle(){
		  int speed = 100;
	  }
	  Vehicle(int speed){
		  this.speed=speed;
	  }
	}  


public class NoArgu extends Vehicle{
    NoArgu(){
    	super();
    	System.out.println(speed);
    }
    NoArgu(int speed){
    	super(speed);
    	System.out.println(speed);
    }

public static void main(String args[]){
	NoArgu n = new NoArgu();
	NoArgu m = new NoArgu(11);
	
}
}