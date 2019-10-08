package Day5;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{4,5,6}};
		int b[][]= {{1,2,3},{4,5,6},{4,5,6}};		
		int c[][]= {{1,2,3},{4,5,6},{4,5,6}};
		
		int d[][]=new int [3][3];
		
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				d[i][j]=a[i][j]+b[i][j]+c[i][j];
				System.out.print(d[i][j]+ " ");
			}
			System.out.println();
		}
		
	
		
	}

}
