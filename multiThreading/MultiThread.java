package multiThreading;

public class MultiThread extends Thread {
	public void run() {

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getState());
		System.out.println("Thread is " + Thread.currentThread().getName() + " is running");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.out.println("Main thread: " +Thread.currentThread().getName());
		MultiThread m1 = new MultiThread();
			//MultiThread m2 = new MultiThread();
			m1.start();
			
			m1.setName("My thread");
			//m2.start();
			
		}

	}


