class Nameprinting extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("sharanu");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Numberprinting implements Runnable{
	public void run() {
		for (int i=1;i<=100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		Nameprinting np=new Nameprinting();
		Numberprinting num=new Numberprinting();
		
		Thread t1=new Thread(np);
		Thread t2=new Thread(num);
		t2.start();
		
		t1.start();
		
	}

}
