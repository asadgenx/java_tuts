package account;
import account.Account;
public class UseAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account Myaccount = new Account();
		Myaccount.Name = "Asad genx";
		Myaccount.AccountNumber = 1004001542567L;
		Myaccount.Balance = 34345.34355;		
		Myaccount.display();
		Myaccount.getInterest(5);
		Myaccount.display();
		
	}

}
