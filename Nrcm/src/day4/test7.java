package day4;

public class test7 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test7 t1=new test7();
        t1.sub();
	}

}
