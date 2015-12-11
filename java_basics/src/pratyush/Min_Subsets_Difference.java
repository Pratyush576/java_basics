package pratyush;

/*
 * Partition a set into two subsets such that the difference of subset sums is minimum
 */
public class Min_Subsets_Difference {
	static int MinDiff(int[] A,int l,int s1	, int s2){
		if(l==0){
			//System.out.println("");
			int num = s2-s1-s1;
			if(num<0)
				return -num;
			else
				return num;
			
		}
		else{
			int flag1=MinDiff(A, l-1, s1+A[l-1], s2);
			int flag2=MinDiff(A, l-1, s1, s2);
			//System.out.println(flag1+" "+flag2);
			if(flag1<flag2){
				System.out.println(flag1);
				return flag1;
				
			}else{
				System.out.println(flag2);
				return flag2;
			}
		}
		
	}
	public static void main(String args[]){
		int A[]={10,15,80,110,300};
		int sum=0;
		for(int i=0;i<A.length;i++){
			sum+=A[i];
		}
		System.out.println("sum: "+ sum);
		System.out.println(MinDiff(A, A.length-1, 0, sum));
	}
}
