package day3;

abstract class Test2{
	abstract void add();
	abstract void sum();
}
 class Demo6 extends Test2{
     public void add() {
    	 System.out.println("hi");
     }
     public void sum() {
    	 System.out.println("hello");
     }
	public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.add();
		d1.sum();
	}

}
