package day6;

public class Sample2 {
	void show() {
		System.out.println("Hi");
		class Test2{
			void print() {
				System.out.println("Hello");
			}
		}
		Test2 t1=new Test2();
		t1.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s1=new Sample2();
		s1.show();

	}

}
