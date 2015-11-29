package ds;

public class KnapsackProb {
	public static void MaximizeWT(float[] val,float[] wt,float KS_max,float wt_max){
		float maxUnitwt=0,unitwt;
		int index=0;
		for(int i=0;i<val.length;i++){
			unitwt=wt[i]/val[i];
			if(unitwt>maxUnitwt){
				maxUnitwt=unitwt;
				index=i;
			}
			//System.out.println(unitwt);
		}

		//System.out.println(maxUnitwt+" "+index);
		if(val[index]<KS_max){
			KS_max-=val[index];
			wt_max+=wt[index];
			System.out.println("Item "+index+": "+ val[index] +"\twt_max: "+wt_max);
			wt[index]=0;
			val[index]=0;
			
			MaximizeWT(val, wt, KS_max,wt_max);
		}else{
			wt_max+=KS_max*maxUnitwt;
			System.out.println("Item "+index+": "+ KS_max+"\twt_max: "+wt_max);
		}

	}
	public static void main(String args[]){
		float val[]={20,10,28,15};
		float wt[]={10,23,14,26};
		float KS_max=47;
		float wt_max=0;
		MaximizeWT(val, wt, KS_max,wt_max);

	}
}
