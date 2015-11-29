package pratyush;
/*
 * A magic number is one that can be represented as a sum of powers of 5. 
 * For example 30 = 5^2 + 5^1. Given n, return the nth magic number.
 */
public class Magic_num {
	public static double Magicnum(int n,int m,int p,int q){
		double magicnum = 0;
		if(n<=0){
			return 0;
		}
		System.out.println(p+":"+q);
		if(m==n){
			return Math.pow(5, p)+Math.pow(5, q);
		}
		
		if(p>q){
			magicnum=Magicnum(n, m+1, p, q+1);
		}else if (p==q) {
			magicnum=Magicnum(n, m+1, p+1, 0);
		}else{
			System.out.println("Else Block");
		}
			
		return magicnum;
	}
	
	
	public static void main(String[] args){
		//10th magic no.
		System.out.println(Magicnum(10,1,0,0));
	}
}
