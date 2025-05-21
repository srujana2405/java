package day6;
class Demo1{
	void show() {
		System.out.println("Hi");
	}
}

public class Sample3 {
	Demo1 d1=new Demo1() {
		void show() {
			System.out.println("Hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 s1=new Sample3();
		s1.d1.show();

	}

}
