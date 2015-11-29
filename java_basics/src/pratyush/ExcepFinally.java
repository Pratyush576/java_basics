package pratyush;

public class ExcepFinally {
	public static void main(String args[]){
		try{
			//int i=10/10;
			int j=10/0;
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block");
		}
	}

}
