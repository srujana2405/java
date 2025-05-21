package day4;

public class test9 {
	int x;
	int y;
	int z;
	public test9() {
		 System.out.println("Welcome to my profile:Srujana");
	}
	public test9(int x) {
		this.x=x;
		System.out.println("inter marks"+x);
	}
	public test9(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public test9(test9 s1) {
		this.x=s1.x;
		this.y=s1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test9 s1=new test9(99,78);
        test9 s2=new test9(s1);
	}

}
