package aes;

public class DemonicThread extends Thread {
				
	
	
	
	
	
	
	@Override
	public void run() {
try {
	if (Thread.currentThread().isDaemon())	{
		System.out.println("Something deamonic is already running");
	}
	else {
		System.out.println("This thread is user thread");
	}
	
}
	catch (Exception e) {
		System.out.println(e);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		DemonicThread thread=new DemonicThread();
		DemonicThread thread1=new DemonicThread();
		DemonicThread thread2=new DemonicThread();
		
		thread.setDaemon(true);
		thread.start();
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(thread1.isAlive());
		System.out.println(thread.isAlive());
		
	}

}
