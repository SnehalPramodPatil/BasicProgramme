
package Multithreading;

public class MyThread extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread is started....."+Thread.currentThread().getId());
		}
	}
	
	public static void main(String args[]) {
		MyThread mt1=new MyThread();
		mt1.start();
		
		MyThread mt2=new MyThread();
		mt2.start();
	}
}
