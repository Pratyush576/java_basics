package pratyush;

public class Selection_sort {
	void selection_sort(int num[]){
		int min;
		for(int i=0;i<num.length-1;i++){
			min=i;
			for(int j=i+1;j<num.length;j++){
				if(num[j]<num[min]){
					min=j;
				}
			}
			//System.out.println(min);
			int flag=num[min];
			num[min]=num[i];
			num[i]=flag;		
		}
		//new Selection_sort().printlist(num);
	}

	void printlist(int num[]){
		System.out.print("Array: ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
		}
		System.out.println();
	}


	public static void main(String []args){
		int num[]={10,5,28,34,2,45,54,14,31,89,23};
		Selection_sort ss=new Selection_sort();
		ss.printlist(num);
		ss.selection_sort(num);
		ss.printlist(num);
		


	}
}
