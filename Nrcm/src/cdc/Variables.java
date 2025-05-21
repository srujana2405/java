package cdc;
public class Variables {
	int a=2,b=3;
	static int c=4,d=1;
	void and() {
		System.out.println(a>b&&a<b);
	}
    void or() {
    	System.out.println(c>d||c<d);
    
    }
    void div() {
    	int e=7,f=7;
    	System.out.println(e/f);
    }
	public static void main(String[] args) {
         Variables v1=new Variables();
         v1.and();
         v1.or();
         v1.div();
	}

}
