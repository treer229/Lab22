import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
	private String transactionData;//거래일
	private String transactionTime;//거래시간
	private String kind;//구분 입금 or 출금
	private long amount;//거래금액
	private long balance;//잔고
	
	
	@Override
	public String toString() {
		return "Transaction [transactionData=" + transactionData + ", transactionTime=" + transactionTime + ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
	}

	public String getTransactionData() {
		return transactionData;
	}

	public void setTransactionData(String transactionData) {
		this.transactionData = transactionData;
	}



	public String getTransactionTiem() {
		return transactionTime;
	}



	public void setTransactionTiem(String transactionTiem) {
		this.transactionTime = transactionTiem;
	}



	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}



	public long getAmount() {
		return amount;
	}



	public void setAmount(long amount) {
		this.amount = amount;
	}



	public long getBalance() {
		return balance;
	}



	public void setBalance(long balance) {
		this.balance = balance;
	}

	Transaction(long amount, String kind, long balance) {
		this.transactionData = LocalDate.now().toString();
		this.transactionTime = LocalTime.now().toString();
		this.amount = amount;
		this.kind = kind;
		this.balance = balance;
	}
}
