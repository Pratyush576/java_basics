package threading;

class thread extends Thread{
	thread(String str){
		this.setName(str);
	}
	public void run(){
		System.out.println("Running Thread: "+ this);
	}
}
public class MultiThreadingDemo {
	public static void main(String args[]){
		thread t= new thread("test");
		t.start();
	}

}
