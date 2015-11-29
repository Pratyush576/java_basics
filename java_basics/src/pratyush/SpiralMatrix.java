package pratyush;

public class SpiralMatrix {
	public static void spiral_print(int MAT[][],int m,int n,int k){
		if (m <= 1) {
			for (int j = 0; j < n; j++)
				System.out.print(MAT[k][k+j]+" ");
			return;
		}
		if (n <= 1) {
			for (int i = 0; i < m; i++)
				System.out.print(MAT[k+i][k]+" ");
			return;
		}

		//left to right
		for(int i=0;i<n;i++){
			System.out.print(MAT[k][i]+" ");
		}
		//top to down
		for(int j=k+1;j<m;j++){
			System.out.print(MAT[j][n-1]+" ");
		}
		//right to left
		for (int j = 0; j < n - 1; j++){
			System.out.print(MAT[k+m-1][k+n-2-j]+" ");
		}
		//down to up
		for (int i = 0; i < m-2 ; i++){
			System.out.print(MAT[k+m-2-i][k]+" ");
		}
		spiral_print(MAT, m-2, n-2, k+1);
	}
	
	
	public static void spiralPrint(int mat[][],int m,int n ,int k){
		//System.out.println("=====================");
		//System.out.println(m+" "+n+" "+k);
		if(m==k){
			System.out.println("\n"+m+" "+n+" "+k);
			
			return;
		}
		if(n==k){
			System.out.println("\n"+m+" "+n+" "+k);
			return;
		}
		
		for(int i=k;i<n;i++){
			System.out.print(mat[k][i]+" ");
		}
		//System.out.println();
		for(int i=k+1;i<m;i++){
			System.out.print(mat[i][n-1]+" ");
		}
		//System.out.println();
		for(int i=n-2;i>=k;i--){
			System.out.print(mat[m-1][i]+" ");
		}
		//System.out.println();
		for(int i=m-2;i>k;i--){
			System.out.print(mat[i][k]+" ");
		}
		//System.out.println();
		spiralPrint(mat, m-1, n-1, k+1);
	}
	
	public static void main(String[] args){
		int A[][]={{1,2,3,5,3},{4,5,6,2,1},{7,8,9,7,6},{1,2,3,5,2},{3,6,9,0,7},{1,2,3,5,8}};
		//output should be: 1,2,3,6,9,8,7,4,5
		System.out.println("2-D Array\n");
		for(int i=0;i<6;i++){
			for(int j=0;j<5;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		//spiral_print(A,4,4,0);
		spiralPrint(A, 6, 5, 0);
		



	}
}
