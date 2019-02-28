import java.util.ArrayList;
import java.util.Iterator;



public class Bank {
	
	private ArrayList<Account> account;
	private int totalAccount;
	


	
	@Override
	public String toString() {
		return "Bank [account=" + account + ", totalAccount=" + totalAccount + ", getAccounts()=" + getAccounts()
				+ ", getTotalAccount()=" + getTotalAccount() + "]";
	}

	public Bank() {
		this.account = new ArrayList<Account>();
		this.totalAccount = 0;
	}

	public void addAccount(String accountNo, String name) {
		account.add(new Account(accountNo, name));
	}
	
	public Account getAccount(String accountNo) {
		Account s = null;
		for(int i = 0; i<account.size(); i++) {
			if(account.get(i).getAccountNo().equals(accountNo)) {
				s = account.get(i);
			} 
		}
		return s;
	}
	
	public Account findAccounts(String name) {
		Account s = null;
		for(int i = 0; i<account.size(); i++) {
			if(!(account.get(i).getName().equals(name))) {
				System.out.println("찾는 계좌가 없음");
			} else {
				s = account.get(i);
			}
		}
		return s;
		
	}
	
	public ArrayList<Account> getAccounts() {
		return this.account;
	}
	public void getAccountss() {
		Iterator<Account> s = this.account.iterator(); 
		while(s.hasNext()) {
			System.out.println(s.next().toString());
		}
	}
	
	public int getTotalAccount() {
		int totalaccount;
		totalaccount = account.size();
		return totalaccount; 
	}
}
