package threadTest;

public class SingleThreadEx1 extends Thread{

	private int[] temp;
	
	public SingleThreadEx1(String threadname) {
		super(threadname);
		temp = new int[10];
		
		for(int start=0; start<temp.length; start++) {
			temp[start]=start;
		}
	}
	
	public void run() {
		for(int start:temp) {
			try {
				Thread.sleep(1000);
			} catch(Exception ie) {
				ie.printStackTrace();
			}
			System.out.println("스레드이름:" + currentThread().getName());
			System.out.println("temp value : " + start);
		}
	}
	public static void main(String[] args) {
		SingleThreadEx1 st = new SingleThreadEx1("첫번째");
		st.start();
	}

}
