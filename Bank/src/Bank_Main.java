import java.util.Iterator;

public class Bank_Main {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addAccount("307124", "ÀÌÈûÂù");
		bank.addAccount("111111", "È«±æµ¿");
		bank.addAccount("222222", "±èÀ¯½Å");
		System.out.println(bank.getAccount("111111").toString());
		System.out.println(bank.findAccounts("ÀÌÈûÂù").toString());
		
		Account ac = bank.getAccount("111111");
		
		System.out.println(ac.toString());
		
		bank.getAccount("111111").deposit(10000);
		
		System.out.println(bank.getAccount("111111").toString());
		
		bank.getAccount("111111").withdraw(5000);
		
		System.out.println(bank.getAccount("111111").toString());

		bank.getAccount("111111").withdraw(15000);
		
		
		
	}
}
