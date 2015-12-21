package pratyush;

public class Sortingnobasedonfrequency {
	static void sorting(int[] A,int k){
		int[] Count=new int[k];
		for(int i=0;i<k;i++){
			Count[i]=0;
		}
		for(int i=0;i<A.length;i++){
			Count[A[i]]++;
		}
		int p=0;
		
		for(int i=0;i<k;){
			if(Count[i]>0){
				A[p]=i;
				p++;
				Count[i]--;
			}else{
				i++;
			}
		}
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	
	public static void main(String args[]){
		int[] A={1,3,2,4,2,1,5,4,6,5,7,3,6,1,1,2};
		int max=10;
		System.out.print("\nUnSorted Array:\t");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.print("\nSorted Array:\t");
		sorting(A, 9);
		
	}
}
