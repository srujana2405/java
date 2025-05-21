package day4;
class Sample2{
	protected void add() {
		System.out.println("hello");
	}
}
public class default1 extends Sample2 {

	public static void main(String[] args) {
		default1 s1=new default1();
		s1.add();
	}

}
