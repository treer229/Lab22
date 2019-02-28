import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transaction;
	
	

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transaction="
				+ transaction + "]";
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		transaction = new ArrayList<Transaction>();
	}

	public void deposit(long amount) {// 입금한다.
		this.balance += amount;
		transaction.add(new Transaction(amount, "입금", balance));
	}

	public void withdraw(long amount) {
		if (balance > 0) {
			this.balance -= amount;
			transaction.add(new Transaction(amount, "출금", balance));

		}
	}

	public long getBalance() {
		return this.balance;
	}

	public ArrayList<Transaction> getTransactions() {
		return this.transaction;
	}
}
