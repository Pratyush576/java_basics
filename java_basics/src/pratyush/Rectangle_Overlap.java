package pratyush;
class Point{
	int x=0,y=0;
	public Point(int x1,int y1) {
		x=x1;
		y=y1;
	}
}

public class Rectangle_Overlap {
	public static boolean IsOverlapping(Point l1,Point r1,Point l2,Point r2){
		System.out.println(l1.x+" "+r2.x+" "+l2.x+" "+r1.x);
		// If one rectangle is on left side of other
	    if (l1.x > r2.x || l2.x > r1.x)
	        return false;
	    System.out.println(l1.y+" "+r2.y+" "+l2.y+" "+r1.y);
	    // If one rectangle is above other
	    if (((l1.y > r2.y && l1.y > l2.y) && (r1.y>r2.y && r1.y>l2.y))||((l1.y < r2.y && l1.y < l2.y)&&(r1.y<r2.y && r1.y<l2.y)))
	        return false;
	 
	    return true;
	}
	
	public static void main(String[] args){
		System.out.println(IsOverlapping(new Point(0, 0) , new Point(2, 2), new Point(3, 3), new Point(5, 5)));
	}
}	
