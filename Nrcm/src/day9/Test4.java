package day9;

class Test4 extends Thread{
	public void run() {
		System.out.println("good morning");
	}
}
class Test1{
	public static void main(String[] args) {
		System.out.println("good morning");
	}

}
class Test1{
	public static void main(String[] args) {
		Test2 t1=new Test2();
		Test3 t2=new Test3();
		//System.out.println("hell0");
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();
	}
}
