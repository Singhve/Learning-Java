package Day5;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		//sb.append("Veer");
		sb.replace(0, 3, "Veer");
		System.out.println(sb);
	}

}
