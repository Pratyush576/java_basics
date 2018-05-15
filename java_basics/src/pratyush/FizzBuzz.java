package pratyush;

public class FizzBuzz {
	
	
	class C{
		A a= new  A();
		B b = new B();
		//Class obj
		//obj=b;
	}
	
	public class A{
		int i;
		double j;
	}
	
	public class B extends A{
		int k;
	}
	
	public String test(){
		try{
			System.out.println("One");
			return "";
		}
		finally {
			System.out.println("Two");
		}
	}
	
	
	static int cal(){
		return (7/2);
	}
	
	public static void main(String args[]) {
		
		
		new FizzBuzz().test();
		int i= cal();
		System.out.println(i);
		
		Thread t =Thread.currentThread();
		System.out.println(t.isAlive());
	  // A a =new  FizzBuzz.A();
		
		/*int x=0,y=0;
		for(int z=0;z<5;z++){
			if((++x > 2)&&( ++y > 2)){
				x++;
			}
		}
		System.out.println(x+" "+y);*/
	}
}


