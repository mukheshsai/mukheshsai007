class NewThread implements Runnable {
 Thread t;
 NewThread() {
 t = new Thread(this, "Demo Thread");
 System.out.println("Child thread: + t");
 t.start();
 }
public void run() {
 try {
    for(int i=5;i>0;i--) {
	System.out.println("Child Thread: " + i);
	Thread.sleep(500);
  }
 } catch (InterruptedException e) { System.out.println("Child Interrupted."); }
   System.out.println("Exiting Child thread");
 }
}
class ThreadDemo {
  public static void main(String arg[]) {
   new NewThread();
	try {
	  for(int i=5;i>0;i--) {
	  System.out.println("Main Thread: " + i);
	  Thread.sleep(1000);
	 }
	} catch (InterruptedException e) { System.out.println("Main thread interrupted."); }
	System.out.println("Main thread exting.");
   }
}