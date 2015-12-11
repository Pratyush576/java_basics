package pratyush;
/*
 * Given an array , 
 * each element is one more or one less than its preceding element .
 * find an element in it.(better than O(n) approach)
 */
public class ElementSearch {
	static int count=0;
	public static int Search(int[] A,int left,int right,int num){
		int mid=(left+right)/2;
		System.out.println("left: "+left+" right: "+right+" mid: "+mid);
		if(A[mid]==num){
			System.out.println("=========left: "+left+" right: "+right+" mid: "+mid+"========");
			return mid;
		}
		count++;
		if(left==right||left>right)
			return -1;
		
		else if(A[mid]==num+1||A[mid]==num-1){
			if(A[mid-1]==num)
				return mid-1;
			else if(A[mid+1]==num)
				return mid+1;
			else{
				int x=Search(A,left,mid-1,num);
				int y=Search(A, mid+1, right, num);
				if(x!=-1)
					return x;
				else if(y!=-1)
					return y;
				else{
					return -1;
				}
			}
		}
		else{
			int x=Search(A,left,mid-1,num);
			int y=Search(A, mid+1, right, num);
			if(x!=-1)
				return x;
			else if(y!=-1)
				return y;
			else{
				return -1;
			}
		}
	}
	public static void  main(String args[]){
		int A[]={1,2,3,2,3,4,5,6,7,8,7,6,7};
		System.out.println(Search(A, 0, A.length-1, 7));
		System.out.println(A.length+" "+count);
	}
}
