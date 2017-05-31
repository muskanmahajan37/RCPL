/* Simple execution of thread */
// @Auhtor Vinit Shahdeo
class SimpleThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
	public static void main(String ... args)
	{
		System.out.println("Main starts here!");
		SimpleThread t=new SimpleThread();
		t.start();
		SimpleThread t1=new SimpleThread();
		t1.start();
		System.out.println("Main finishes here!");
	}
}