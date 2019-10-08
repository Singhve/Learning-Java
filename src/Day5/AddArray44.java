package Day5;

public class AddArray44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3,5},{4,5,6,9},{4,5,6,1},{8,7,4,3}};
		int b[][]= {{1,2,3,4},{4,5,6,1},{4,5,6,9},{7,4,2,7}};
		
		int c[][] = new int [4][4];
		
		for(int i=0; i<4;i++){
			for(int j=0; j<4; j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
			
		}
	}

}
