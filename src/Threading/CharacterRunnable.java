package Threading;

/*
 * Thread creation using runnable Interface
 */
public class CharacterRunnable implements Runnable{

//	Main main = new Main();
	boolean isFinish;

	Main main = new Main();
	@Override
	public void run() {	
//		System.out.println("Printing Characters from A to Z");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
			if(i == 'z') {
				isFinish = true;
			}	
		}
//		}System.out.println("IsFinish: "+main.isFinish);
//		System.out.println("Bye from Character thread.");
	}
}
