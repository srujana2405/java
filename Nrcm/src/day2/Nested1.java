package day2;

public class Nested1 {

	public static void main(String[] args) {
		int a=9;
		if(a%2==0) {
			System.out.println("divisible by 4");
		}
		else {
			if(a%3==0) {
				System.out.println("divisible by 6");
			}
			else {
				System.out.println("not divisible by both 4 n 6");
			}
		}

	}

}
