package ObjectClass;

public class construcEx2 {

	private int hour;
	private int minute;
	private int second;
	
	public construcEx2(){//constructors 0 arguments
		this (0,0,0);
	}
	
	public construcEx2(int h){
		this (h,0,0); }
	
	public construcEx2(int h, int m){
		this (h,m,0);
	}
	public construcEx2(int h, int m, int s){
		setTi(h,m,s);
	}
	public void setTi(int h, int m, int s){
		setHour(h);//methods
		setMinute(m);//methods
		setSecond(s);//methods
	}
	public void setHour(int h){//set methods
		hour = ((h>=0&&h<24) ?h : 0);//conditional hour is between 0 and less then 24 if not use 0
	}
	public void setMinute(int m){
		minute = ((m>=0&&m<60) ?m : 0);//conditional hour is between 0 and less then 60 if not use 0
	}
	public void setSecond(int s){
		second = ((s>=0&&s<60) ?s : 0);//conditional hour is between 0 and less then 60 if not use 0
	}
	public int getHour(){//get methods
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public String toMil(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());//%02d hms will have 2 deciaml places
	}
	

public static void main(String[] args){
	construcEx2 cobj = new construcEx2();//0 parameters
	construcEx2 cobj1 = new construcEx2(4);
	construcEx2 cobj2 = new construcEx2(5,12);
	construcEx2 cobj3 = new construcEx2(6,21,54);
	
	System.out.printf("%s\n", cobj.toMil());
	System.out.printf("%s\n", cobj1.toMil());
	System.out.printf("%s\n", cobj2.toMil());
	System.out.printf("%s\n", cobj3.toMil());
	
	}
}
