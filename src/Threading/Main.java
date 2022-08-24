package Threading;

public class Main {
	
	
	public static void main(String[] args) {
		/*
		 * In case of implementing the RunnableInterface in that case 
		 * we have to pass the object as parameter to the Thread class, 
		 * then we can call the start method on the thread.
		 */
		CharacterRunnable charRunnable = new CharacterRunnable();
		Thread characterThread = new Thread(charRunnable);
		characterThread.start();
		/*
		 * Calling start thread.
		 * In case of extending the thread we have to directly call the run() method.
		 */
		NumberThread nThread = new NumberThread(charRunnable);
		nThread.start(); 
		
//		System.out.println("In main :"+main.isFinish);
	}

	public boolean isFinish;
}
