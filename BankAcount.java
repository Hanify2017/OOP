package OOP;

public class BankAcount {

	private int accountNumber;
	private double balance;
	private String name;
	private String Email;
	private String phon;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {//می توانیم از if else استفاده کنیم
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhon() {
		return phon;
	}
	public void setPhon(String phon) {
		this.phon = phon;
	}
	
	
public void deposit(double b){
this.balance=balance+b;
System.out.println("your balance is = "+balance);
	
}
public void withdraw(double B){
	if(balance>0 && balance>B){
		double num=balance-B;
		
		System.out.println("Your balance now is = "+num);
		
	}
	else{
		System.out.println("Your balance is not enuf sorry");
		
	}
}

	
}
