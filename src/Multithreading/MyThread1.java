package Multithreading;

public class MyThread1 implements Runnable {
      public void run() {
    	  
    	  for(int i=1;i<=10;i++) {
    		  try {
    			  Thread.sleep(1000);
    		  }catch(InterruptedException e) {
                  System.out.println(e);
    		  }
    		  System.out.println("Thread is started......."+Thread.currentThread().getId());
    	  }
      }
      public static void main(String args[])
      {
    	  MyThread mt1=new MyThread();
    	  Thread t1=new Thread(mt1);
    	  t1.start();
    	 
    	  
    	  MyThread mt2=new MyThread();
    	  Thread t2=new Thread(mt2);
    	  t2.start();
    	  
    	  System.out.println("Program ends here.....");
      }
}
