package pratyush;

import java.util.ArrayList;
import java.util.List;

import org.openqa.jetty.html.Break;
import org.testng.reporters.ExitCodeListener;

public class StringProcessing {
	public static void main(String args[]){
		String str="{()}()){}mjnmks}";
		List stack= new ArrayList();
		int top=-1;
		for (int i=0;i<str.length();i++){

			System.out.println(i+" : "+stack.size()+" : "+str.charAt(i) + " : "+top);
			switch(str.charAt(i)){
			case '[' : stack.add(str.charAt(i));top++;break;
			case '{' : stack.add(str.charAt(i));top++;break;
			case '(' : stack.add(str.charAt(i));top++;break;
			case ']' : 
				if(top==-1){
					System.exit(1);
				}
				if(stack.get(top).toString().equals("[")){
					stack.remove(top);
					top--;
				}else{
					//System.out.println("Invalid");
					System.exit(1);
				}
				break;
			case '}' :
				if(top==-1){
					System.out.println("here");
					System.exit(1);
				}
				if(stack.get(top).toString().equals("{")){
					stack.remove(top);
					top--;
				}else{
					//System.out.println("Invalid");
					System.exit(1);
				}
				break;
			case ')' :
				if(top==-1){
					System.exit(1);
				}
				//System.out.println(")"+stack.get(top).equals("("));
				if(stack.get(top).toString().equals("(")){
					stack.remove(top);
					top--;
				}else{
					//System.out.println("Invalid");
					System.exit(1);
				}
				break;
			default:
			}
		}
		
		System.out.println(stack.size());
		if(stack.size()==0){
			System.out.println("Valid String");
		}
		else{
			System.out.println("Invalid");
		}
		
	}
}
