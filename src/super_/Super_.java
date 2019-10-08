package super_;

class Vehicle_{  
	int speed;
	//instance initializer block
	{
		speed = 1000;
		System.out.println(speed);
	}
	void show(){
		
	}
	  Vehicle_(){
		  int speed = 100;
		  System.out.println("Parent"+speed);
	  }
	  Vehicle_(int speed){
		  this.speed=speed;
		  System.out.println(speed);
	  }
	}  


public class Super_ extends Vehicle_ {
	{
		System.out.println("subclass");//constructor runs first then the initializer block, hence prints 1000,100 then subclass
	}
	Super_(){
		super();
    	System.out.println(speed);
		
	}
	Super_(int speed){
		super(speed);
    	System.out.println(speed);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_ aa = new Super_();
		Super_ ab = new Super_(100);

	}

}
/*
 * The java compiler copies the instance initializer block in the constructor after 
the first statement super(). So firstly, constructor is invoked. 
*/
/*
1000
Parent100
subclass
1000
1000
100
subclass
100
*/
