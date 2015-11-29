package pratyush;

public class caterp {
	public static void main(String args[]){
		
		int nc=3, j[]={2,4,5},max=10;
		int nl[]=new int[max] ;
		for(int i=0;i<max;i++){
			nl[i]=0;
		}

		for(int i=0;i<max;i=i+2){
			nl[i]=1;
		}

		for(int i=0;i<max;i=i+4){
			nl[i]=1;
		}

		for(int i=0;i<max;i=i+5){
			nl[i]=1;
		}

		int count=0;
		for(int i=0;i<max;i++){
			if(nl[i]==0)
				count++;
		}
		System.out.println(count);
	}

}
