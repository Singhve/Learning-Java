package static_keyword;

public class Static_1 {
		   int rollno;  
		   String name;  
		   static String college ="ITS";  
		     
		   Static_1(int r,String n){  
		   rollno = r;  
		   name = n;  
		   }  
		 void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		 public static void main(String args[]){  
		 Static_1 s1 = new Static_1(111,"Karan");  
		 Static_1 s2 = new Static_1(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
		 }  
		 
}
