package co.edureka.exceptions;

import java.io.IOException;
//User Defined Exception |Checked
class BankingException extends Exception{
	public BankingException(String msg){
		super(msg);
	}
}
//User Defined Exception |Checked
class BankingException1 extends RuntimeException{
	public BankingException1(String msg){
		super(msg);
	}
}

class Banking{
	int balance =10000;
	
	void withdraw(int amt) throws BankingException{ // Use throws keyword for throwing Checked Exception
		int dif = balance-amt;
		if (dif<5000){
			//i need to crash my program
			//System.out.println("Balance is Low");
			//throwing an unchecked exception
			//NullPointerException npe=new NullPointerException("Balance is Low");
			//throw npe;
			//throwing a checked exception
			//IOException io=new IOException("Balance is Low");
			//throw io;
			//throw a user defined excepton
			BankingException be=new BankingException("Balance is LOW");
			throw be;
		}else {
			balance = balance-amt;
			System.out.println("Amount is withdraw and balance is :\u20b9" + balance);
		}
	}
}
public class ThrowDemo {

	public static void main(String[] args) {
		Banking b=new Banking();
		System.out.println("Banking Started");
		try {
			
		
			b.withdraw(2000);
			b.withdraw(2000);
			b.withdraw(3000);
		} catch(Exception e){
			System.out.println("Excepton is "+ e);
		
		}
		System.out.println("Banking Finished");

	}

}
