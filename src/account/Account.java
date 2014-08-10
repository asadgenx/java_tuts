package account;
import static java.lang.System.out;

public class Account {
	String Name;
	long AccountNumber;
	double Balance;
	
	public void display(){
//		out.println(Name);
//		out.println(AccountNumber);
		out.printf("$ %.1f\n",Balance);
		out.printf("$%8.2f\n",Balance);
		out.printf("$%1.2f\n",Balance);

	}
	
	public double getInterest(double Interest){
		
		Balance = Balance + Balance*(Interest/100);
		return Balance;
	}

}
