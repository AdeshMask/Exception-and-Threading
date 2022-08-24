package Threading;

/*
 * MultiThreading is a Java feature that allows concurrent execution of two or more 
 * parts of a program for maximum utilization of CPU. 
 * Each part of such program is called a thread. So, threads are light-weight processes 
 * within a process.
 * 
 * Runnable Interface is implemented whose instances are intended to be executed by 
 * a thread. It has only one method run().
 * run() ==> This is used to perform an action for a thread.
 */
public class MultiThreading implements Runnable{

	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to MultiThreading Program:");
		/*
		 * Creating object of the class and passing object as parameter to thread.
		 */
		MultiThreading th = new MultiThreading();
		Thread thread = new Thread(th);
		thread.start();     //Starting thread.
		/*
		 * Thread.sleep(500) ==> This blocks the currently running thread for the specified amount of time.
		 * setName() ==> This method changes the name of the thread.
		 * getName() ==> This method returns the name of current running thread. 
		 */
		thread.setName("Thread1");
		System.out.println(thread.getName());
		/*
		 * yield() => This method pauses the execution of the current thread to execute other 
		 * threads temporarily.
		 * 
		 * isDaemon() ==> This thread method will check if the thread is a daemon thread or not. 
		 * If it is a daemon thread, then it will return true else, it will return false.
		 * A daemon thread is a thread that will not stop the Java Virtual Machine (JVM) 
		 * from exiting when the program is ended, but the thread is still running.
		 * 
		 * 
		 */
		System.out.println("Current Active Threads: "+thread.activeCount());
	}
}
