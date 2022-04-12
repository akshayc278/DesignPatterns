package CompositeDesignPattern;
import java.util.LinkedList;
import java.util.List;

//mixing of two individual components
//Component + leaf eg: account class is composite , saving + current account is leaf 
//leaf can act independently but account balance need to combine both leaf class
abstract class Account{
	public abstract float getBalance();
}

class SavingAccount extends Account{
	private int accountId;
	private float balance;
	
	public SavingAccount(int accountId,float balance) {
		this.accountId=accountId;
		this.balance=balance;
	}

	@Override
	public float getBalance() {
		return balance;
	}
	
}
class CurrentAccount extends Account{
	private int accountId;
	private float balance;
	
	public CurrentAccount(int accountId,float balance) {
		this.accountId=accountId;
		this.balance=balance;
	}

	@Override
	public float getBalance() {
		return balance;
	}
	
}

class CompositeAccount{
	private float totalBalance;
	
	
	private List<Account> aList;
	
	public float getTotalBalace() {
		totalBalance=0;
		for(Account acc:aList) {
			totalBalance+=acc.getBalance();
		}
		return totalBalance;
	}
	public CompositeAccount() {
		aList=new LinkedList<Account>();
	}
	
	public void addInList(Account acc) {
		aList.add(acc);
	}
	public void removeFromList(Account acc) {
		aList.remove(acc);
	}
}
public class CompositeDesignPattern {
	public static void main(String[] args) {
		CompositeAccount ca=new CompositeAccount();
		ca.addInList(new SavingAccount(12,1000));
		ca.addInList(new CurrentAccount(22,2000));
		System.out.println(ca.getTotalBalace());
		
		
	}
	
}
