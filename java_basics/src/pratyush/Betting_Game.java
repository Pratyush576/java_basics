package pratyush;

/*
 *  You are involved in a betting game whose rules are as follows :
a) if you win a round, the bet amount will be added to your sum and next bet amount will be $1;
b) if you lose a round, the bet amount will be reduced from your total sum and next bet will be twice the previous.
c) game ends when all the rounds are complete or you dont have sufficient sum.
Initially, you are given with a string of the form “WLWWL” where W indicates a win and L indicates a loss and initial sum. Initial bet amount will be $1.
You need to find the amount at the end of the game.
 */
public class Betting_Game {

	public static void main(String args[]){
		int sum=100,d=10;
		String seq="WLWWL";
		String stat="L";
		for(int i=0;i<seq.length();i++){
			if(seq.charAt(i)=='W'){
				sum+=d;
			}else{
				if(sum<d){
					System.out.println("Total Sum is Less then the betting amount");
					break;
				}else{
					sum-=d;
					d*=2;
				}
			}
		}
		System.out.println("Sum: "+sum+"\td: "+d);
	}
}
