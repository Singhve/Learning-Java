package super_;

class Vehicle__{  
	int speed;
	//instance initializer block
	{
		speed = 1000;
		System.out.println(speed);
	}
	  Vehicle__(){
		  int speed = 100;
		  System.out.println(speed);
	  }
	  
	}  


public class Super__ extends Vehicle_ {
	{
		System.out.println("subclass");
	}
	Super__(){
		//super();
    	System.out.println(speed);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_ aa = new Super_();
		//Super_ ab = new Super_(100);

	}

}
/*
1000
100
subclass
1000
*/