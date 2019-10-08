package Day5;

public class AddArray25 {

	public static void main(String args[]) {
		
		int a[][]= {{1,2,3,9,5},{4,5,6,7,8}};
		int b[][]= {{1,2,3,9,8},{4,5,6,7,3}};	
		
		int d[][]= new int[2][5];
		
		for(int i=0; i<2;i++){
			for(int j=0; j<5; j++){
				d[i][j]=a[i][j]+b[i][j];
				System.out.print(d[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
