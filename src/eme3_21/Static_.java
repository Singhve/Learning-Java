package eme3_21;

public class Static_ {
	
	int a;
	void show(){
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_ aa = new Static_();
		Static_ bb = new Static_();
		aa.a = 1;
		aa.show();
		bb.show();
		bb.a=1111;
		aa.show();
		bb.show();
		
	}

}
