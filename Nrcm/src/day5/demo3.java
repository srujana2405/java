package day5;
class Movies{
	void  genre() {
		System.out.println("crime and thriller");
	}
}
class Hit extends Movies{
	void action() {
		System.out.println("Investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
