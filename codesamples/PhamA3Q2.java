import java.util.Date;
 

class Account {

	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;

Account() {
id = 0;
balance = 0.0;
annualInterestRate = 0.0;
}

Account(int newId, double newBalance) {
id = newId;
balance = newBalance;
}
	
	
Account(int newId, double newBalance, double newAnnualInterestRate) {
id = newId;
balance = newBalance;
annualInterestRate = newAnnualInterestRate;
	}





public int getId() {
return id;
}
public double getBalance() {
return balance;
}

public double getAnnualInterestRate() {
return annualInterestRate;
}




public void setId(int newId) {
id = newId;
}
public void setBalance(double newBalance) {
balance = newBalance;
}
public void setAnnualInterestRate(double newAnnualInterestRate) {
annualInterestRate = newAnnualInterestRate;
}

public void setDateCreated(Date newDateCreated) {
dateCreated = newDateCreated;
}





double getMonthlyInterestRate() {
return annualInterestRate/12;
}

double withdraw(double amount) {
return (balance-amount);
}	

double deposit(double amount) {
return (balance+amount);
}
}




public class PhamA3Q2 {
public static void main(String[] args) {

Account myAccount = new Account(1122, 20000.00, 0.045);
myAccount.withdraw(2500.00);
myAccount.deposit(3000.00);

System.out.println("Balance is: " + myAccount.balance);
System.out.println("Monthly Interest: " + myAccount.getMonthlyInterestRate());
	
java.util.Date dateCreated = new java.util.Date();
System.out.println("Date of account creation: " + dateCreated.toString());
}
        
}
 
