package day5;
class Bike{
	void speed() {
		System.out.println("250 km per hour");
	}
}
class Bmw extends Bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class Mode extends Bmw{
	void price() {
		System.out.println("just 30 lakhs");
	}
}
public class demo2 {

	public static void main(String[] args) {
		Mode m1=new Mode();
		m1.speed();
		m1.rev();
		m1.price();
		

	}

}
