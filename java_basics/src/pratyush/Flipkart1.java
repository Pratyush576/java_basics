package pratyush;

public class Flipkart1 {
	public static void main(String args[]){
		float hr=13;  //time hour
		float min=15;  //time minute 
		if (hr>=12){
			hr-=12;
		}
		float ang=360/60;         //Unit Angle 
		float mv=(float)5/60;     //Hour hand movement per minute
		float hr1=hr*5+mv*min;    //Hour hand position
		System.out.println("hr1: "+hr1);
		if(hr1>min){
			float temp=hr1-min;
			System.out.println("Angle="+temp*ang);
		}
		else{
			float temp=min-hr1;
			System.out.println("Angle="+temp*ang);
		}
	}
}
