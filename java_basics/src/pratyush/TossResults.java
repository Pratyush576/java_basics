package pratyush;
/*
 * All possible Toss Result 
 */
public class TossResults {
	static int count=0;
	static void Result(int coin,String str1,int cnt){
		if(coin==cnt){
			System.out.println(str1);
			count++;
			return;
		}
		cnt+=1;
		Result(coin, str1+"0",cnt);
		Result(coin, str1+"1",cnt);
	}
	public static void main(String args[]){
		Result(5,"",0);
		System.out.println(count);
	}
}
