package cdc;

public class method {
    static int a=2,b=3;
    int c=3,d=4;
    void circle() {
    	System.out.println(3.14*a*a);
    }
    static void rectangle() {
    	System.out.println(a*b);
    }
    void square() {
    	System.out.println(a*a);
    }
    static void triangle() {
    	int p=1,q=2;
    	System.out.println((p*q)/2);
    }
	public static void main(String[] args) {
    method m2=new method();
    m2.circle();
    rectangle();
    m2.square();
    triangle();
	}

}
