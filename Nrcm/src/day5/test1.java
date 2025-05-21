package day5;
interface I1{
	void add();
	
}
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}
public class test1 implements I3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
