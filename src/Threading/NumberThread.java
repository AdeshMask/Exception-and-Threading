package Threading;

public class NumberThread extends Thread{
	CharacterRunnable charRunnable;
	public NumberThread(CharacterRunnable charThread) {
		charRunnable = charThread;
	}
	@Override
	public void run() {
//		System.out.println("Printing numbers from 1 to 100");
		for(int i = 0; i < 100; i++) {
			if(!charRunnable.isFinish) {
				System.out.println(i+1);
			}
			else
				break;
				
		}
		System.out.println("Bye from Number thread.");
	}
}
