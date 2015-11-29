package ds;
/*
 * Longest Even Length Substring such that Sum of First and Second Half is same
 */
public class LongestEvenLenStr {
	static int Longest_EvenSubstring(int[] num){
		//System.out.println(num.length);
		if(num.length==0){
			return 0;
		}
		int ll=0,rr=0;
		for(int i=2;i<num.length;i=i+2){
			//System.out.println(i);
			for(int j=0;j<num.length-i;j++){
				//System.out.println(i+" "+j);
				int k;
				int sum1=0,sum2=0;
				for(k=j;k<=j+i/2-1;k++){
					sum1+=num[k];
				}
				for(k=j+i/2;k<=j+i-1;k++){
					sum2+=num[k];
				}
				//System.out.println("sum: "+sum1+" "+sum2);
				if(sum1==sum2){
					System.out.println("sum: "+sum1+" "+sum2+" "+j+" "+(j+i-1));
					ll=j;
					rr=j+i-1;
				}
			}
		}
		
		for(int i=ll;i<=rr;i++){
			System.out.print(num[i]+" ");
		}
		
		return num.length;
		
		
	}
	public static void main(String args[]){
		int[] num ={1,2,1,3,4,3,4,5,6,7,4,1,2,3,7,3,4,2,1,5,4,3,2,5,6,10};
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
		Longest_EvenSubstring(num);
	}
}
