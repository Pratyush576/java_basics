package pratyush;

public class WaterContent {
	/*
	 * O(n^2) Solution
	 */
	static int watercontent(int[] h){
		int sum=0,l=0,r=0;
		while(true){
			l=0;r=0;
			while(l<(h.length)){
				if(h[l]<=h[l+1]){
					l++;
				}else{
					break;
				}
			}
			if(l>=h.length)
				break;
			r=l+1;
			while(r<(h.length) ){
				if(r==h.length-1){
					r++;
					break;
				}
				if(h[r+1]<=h[r]){
					r++;

				}
				else{
					break;
				}
			}
			if(r>=h.length){
				break;
			}
			r=r+1;
			int ht=0;
			if(r<h.length){
				if(h[l]>h[r]){
					ht=h[r];
				}else{
					ht=h[l];
				}
				for(int i=l+1;i<r;i++){
					if(h[i]<ht){
						sum=sum+(ht-h[i]);
						h[i]=ht;
					}
				}
			}
		}
		return sum;
	}

	/*
	 * O(n) Solution
	 */
	static void WaterContent_1(int A[]){
		int l=0,r=0,k=0;
		int sum=0;
		
		for(int i=0;i<A.length;i++){
			k=l;
			while(k<=i){
				if(A[l]<A[k]){
					l=k;
				}
				k++;
			}

			k=r;
			if(r<=i){
				//System.out.println();
				
				
				r=i;
				k=r;
				while(k<A.length){
					if(A[k]>A[r]){
						r=k;
					}
					k++;
				}
			}
			
			int min=0;
			if(A[r]>A[l]){
				min=A[l];
			}else{
				min=A[r];
			}
			if(min>A[i])
				sum=sum+(min-A[i]);

			//System.out.println("Total Water COntent: "+sum+" "+A[i]+" "+A[l]+" "+A[r]);
		}
		System.out.println("Total Water COntent: "+sum);

	}


	public static void main(String[] args){
		int H[]={2,3,4,8,3,6,2,1,7,9,10,5,4,3,1,5,21,1,8};
		WaterContent_1(H);
		System.out.println("Water Content: "+watercontent(H)+" Unit");
		
	}
}
