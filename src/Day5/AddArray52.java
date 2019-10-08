package Day5;

public class AddArray52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2},{4,5},{4,5},{6,7},{8,9}};
		int b[][]= {{1,2},{4,5},{4,5},{6,7},{8,9}};
		
		int d[][] = new int [5][2];
		
		for(int i=0; i<5;i++){
			for(int j=0; j<2; j++){
				d[i][j]=a[i][j]+b[i][j];
				System.out.print(d[i][j]+ " ");
			
			}
			System.out.println();
		}
	}

}
