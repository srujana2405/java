package day6;

public class test2 {
	void show() {
		System.out.println("hi");
	}
    class Sample2{
    	void print() {
    		System.out.println("hello");
    	}
    }
	public static void main(String[] args) {
		test2 t1=new test2();
		t1.show();
		test2.Sample2 s1=new test2() .new Sample2();
		s1.print();
		
	}

}
