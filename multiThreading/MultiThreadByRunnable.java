package multiThreading;

public class MultiThreadByRunnable implements Runnable{
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread " +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MultiThreadByRunnable());
		Thread t2 = new Thread(new MultiThreadByRunnable());
		Thread t3 = new Thread(new MultiThreadByRunnable());
		
		t1.start();
		t1.setName("Thread t1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.setName("Thread t2");
		t2.start();
		
		t3.start();
		t3.setName("Thread t3");
		t2.setPriority(1);

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());

	}

	

}
