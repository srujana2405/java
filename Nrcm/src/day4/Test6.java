package day4;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class withdrawal{
	abstract void withdraw(int amount);
}
public class Test6 extends withdrawal {
	FixedAmount f1=new FixedAmount();
	
	void withdraw(int amount) {
	    f1.fixedamount-=amount;
	    System.out.println("Withdrawn:"+amount);
	    System.out.println("Available Balance:"+f1.fixedamount);
	}
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		Test6 d=new Test6();
				d.withdraw(amount);

	}
}
