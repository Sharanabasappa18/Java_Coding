// package thred_programs;
class Nameprinting extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("sharanu");
		}
	}
}
class Numberprinting implements Runnable{
	public void run() {
		for (int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}

public class Sample{

	public static void main(String[] args) throws InterruptedException {
		Nameprinting np=new Nameprinting();
		Numberprinting num=new Numberprinting();
		
		Thread t1=new Thread(np);
		Thread t2=new Thread(num);
		t2.start();
		Thread.sleep(5000);
		t1.start();
		
	}

}
