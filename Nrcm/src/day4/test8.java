package day4;

public class test8 {
	int a=30;
	int b=78;
	public test8(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test8 s1= new test8(78,34);
        s1.add();
	}

}
