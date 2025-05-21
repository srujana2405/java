package day4;

public class constructor {
	int a=90;
	public constructor(int b) {
		b=a;
		System.out.println("good morning"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c1=new constructor(45); 
		constructor c2=new constructor(56);
		constructor c3=new constructor(34 );

	}

}
