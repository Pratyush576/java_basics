package StringAlgo;

import java.util.Stack;

public class ReverseSpecialCharArray {
	static void Reverse(char[] ch){
		Stack<Character> S=new Stack<Character>();
		for(int i=0;i<ch.length;i++){
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
				S.push(ch[i]);
			}
		}	
		for(int i=0;i<ch.length;i++){
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
				//System.out.println(S.peek());
				ch[i]=S.pop();

			}
		}
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}

	}
	public static void main(String[] args){
		char[] Ch={'A','*','b','+','s','&','d','#','e','f','g','$','h'};
		for(int i=0;i<Ch.length;i++){
			System.out.print(Ch[i]+" ");
		}
		System.out.println();
		Reverse(Ch);
	}
}
