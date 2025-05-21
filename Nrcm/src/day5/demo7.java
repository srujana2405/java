package day5;//inteface support multiple inheritance
interface I1{
    void add();
}
interface I2{
	void sub();
}
public class demo7 implements I1{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public static void main(String[]args) {
		demo7 d1=new demo7();
		d1.add();
		d1.sub();
	}
}
	
