package this_;

class Constructor_this{  
    int id;  
    String name;  
    int a[] = new int[5];
    Constructor_this(){
    	for(int i=0;i<5;i++){
    		a[i]=i;
    	}
    	System.out.println("default constructor is invoked");
    	}

    Constructor_this(int id, String name){
    	this();
    	{
    		for(int i=0;i<5;i++){
        		System.out.println(a[i]);
        	}
    	}
    	
	this.id=id;
	this.name=name;
}

void display(){System.out.println(id+" "+name);}


public static void main(String args[]){
	
	//Constructor_this s = new Constructor_this();
	Constructor_this a1=new Constructor_this(123, "Veer");
	Constructor_this a2=new Constructor_this(456, "Veerpartap");
	//a1.display();
	//a2.display();
}

}