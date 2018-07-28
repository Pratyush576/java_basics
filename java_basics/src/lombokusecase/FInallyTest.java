package lombokusecase;

public class FInallyTest {
	static void  test1(){
		try{
			
			Thread.sleep(5000);
			
			int a=0,b=0;
			int c =a/b;
			Thread.sleep(5000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("FInally Block");
		}
	}
	public static void main(String[] args){
		System.out.println("MAIN Start");
		test1();
		System.out.println("MAIN End");
	}
}
