/* 
WAP to show the execution of thread
@Author Vinit Shahdeo
*/
class SampleThread extends Thread{
	public void run(){
		System.out.println("Hello I'm from thread");
	}
	public static void main(String ... args)
	{
		System.out.println("Hello from main");
		SampleThread t=new SampleThread();
		t.start();
		System.out.println("Hello from main");
		SampleThread t1=new SampleThread();
		System.out.println("Hello from main");
		t1.start();
		System.out.println("Hello from main");
	}
}