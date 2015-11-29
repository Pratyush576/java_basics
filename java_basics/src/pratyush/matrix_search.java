package pratyush;
/*
 * Given a 2d matrix in which rows are sorted in ascending order and columns are also sorted in ascending order.
 * I need to find an element in optimal time complexity
 */
public class matrix_search {
	public static void main(String[] args){
		int A[][]={
				{1,3,4},
				{2,6,9},
				{5,7,11}
		};


		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
