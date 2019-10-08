package Day2;

public class Loops_pro {
	public static void main(String args[]){
	int a,b,c;
	
	for(a=0; a<=5; a++){
	for(b=6; b<=10; b++){
		for(c=12; c<=17; ++c){
			System.out.println(c);//will print out "c" everytime till "c" reaches 17, then prints out a "b", and starts over with "c" till 17 n another "b" prints
		}
		System.out.println("b");
		}
	System.out.println("a");
		}
		
		
	
	}

}
