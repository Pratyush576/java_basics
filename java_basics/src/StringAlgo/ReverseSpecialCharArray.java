package StringAlgo;

import java.util.Stack;

public class ReverseSpecialCharArray {
	/*
	 * Using Stack
	 */
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
	
	/*
	 * Without Useing Stack 
	 */
	static void Reverse1(char[] ch){
		if(ch.length==0||ch.length==1){
			return;
		}
		int l=0;
		int r=ch.length-1;
		while(l<r){
			//System.out.println(l+" "+r);
			while(true){
				if((ch[l]>='a'&&ch[l]<='z')||(ch[l]>='A'&&ch[l]<='Z')){
					break;
				}
				l++;
				//System.out.println("l: "+l);
			}
			while(true){
				//System.out.println(l+" "+r);
				if((ch[r]>='a'&&ch[r]<='z')||(ch[r]>='A'&&ch[r]<='Z')){
					break;
				}
				r--;
				//System.out.println("r: "+r);
			}
			//System.out.println("l: "+l+" "+ch[l]+" r: "+r+" "+ch[r]);
			char ch1=ch[l];
			ch[l]=ch[r];
			ch[r]=ch1;
			l++;
			r--;
			
		}
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
	}
	
	public static void main(String[] args){
		char[] Ch={'A','*','b','+','s','&','d','#','e','f','g','$','h'};
		for(int i=0;i<Ch.length;i++){
			System.out.print(Ch[i]+" ");
		}
		System.out.println();
		Reverse(Ch);
		System.out.println();
		Reverse1(Ch);
	}
}
