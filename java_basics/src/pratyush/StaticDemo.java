package pratyush;


public class StaticDemo {
	public static int temp;
	public void changetemp(){
		temp+=20;
		System.out.println(temp);
		
	}
	public void Main(){
		main(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd=new StaticDemo();
		sd.changetemp();
		sd.changetemp();
		StaticDemo sd1= new StaticDemo();
		System.out.println("sd1 Object");
		sd1.changetemp();
		//sd1.Main();
		System.out.println(temp);

		A a=new A();
		System.out.println(a.i+ " "+a.GetJ());
		System.out.println("Static final Variable : "+A.data);
	}

}
class A{
	public int i=10;
	private int j=20;
	static final int data;
	
	static{data=10; }
	int GetJ(){
		return j;
	}
	
}