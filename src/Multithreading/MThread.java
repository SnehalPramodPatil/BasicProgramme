package Multithreading;

public class MThread extends Thread{
	public void run() {
		System.out.println("Thread is starting");
	}

	public static void main(String[] args) {
		MThread t=new MThread();
		MThread t1=new MThread();
		t.start();
		t1.start();
		
	}
}
