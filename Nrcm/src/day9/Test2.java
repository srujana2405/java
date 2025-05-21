package day9;

public class Test2 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Test2 t1=new Test2();
		Thread t2=new Thread(t1);
		System.out.println("hello");
		t2.start();
		
	}

}
