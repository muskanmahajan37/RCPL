/* Resource sharing by threads using synchronized method
@Author Vinit Shahdeo */
class Demo{
	synchronized void printTable(int n)
	{   

		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	class SyncThread extends Thread
	{
		Demo d;
		int v;
		SyncThread(Demo d, int v)
		{
			this.d=d;
			this.v=v;
		}
		public void run()
		{
			d.printTable(v);
		}
		public static void main(String ... args)
		{
			Demo d=new Demo();
			SyncThread t1=new SyncThread(d,4);
			SyncThread t2=new SyncThread(d,5);
			SyncThread t3=new SyncThread(d,6);
			SyncThread t4=new SyncThread(d,7);
			SyncThread t5=new SyncThread(d,8);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		}
	}