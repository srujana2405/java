package day5;
class Test35{
	void add() {
	    System.out.println("hi");	
	}
}
public class demo6 extends Test35{
	void add() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        demo6 d1=new demo6();
        d1.add();
	}

}
