package pratyush;

public class MoveZero {
	public static void main(String args[]){
		int[] num={1,2,3,0,0,0,4,5};
		for(int i=0;i<num.length;i++){
			if(num[i]==0){
				int k=num[i];
				for(int j=0; j<=i ; j++){
					num[j]+=k;
					k=num[j]-k;
					num[j]-=k;					
				}
			}
		}
		for(int i = 0;i<num.length;i++)
			System.out.print(num[i]+"\t");
	}
}
