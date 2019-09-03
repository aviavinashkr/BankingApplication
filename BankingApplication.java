import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ob=new BankAccount("Gon","1245ADUI");
		ob.showMenu();

	}

}

class BankAccount{
	int balance;
	int previoustranscation;
	String customername;
	String customerid;
	
BankAccount(String cname,String cid){
	customername=cname;
	customerid=cid;
}

void deposit(int amount) {
	
	if(amount!=0) {
		balance += amount;
		previoustranscation = amount;
	
	}
}

void withdraw(int amount) {
	if(amount!=0) {
		balance -= amount;
		previoustranscation=-amount;

	}
}

void getprevioustranscation() {
	if(previoustranscation>0) {
		System.out .println("Deposited:"+previoustranscation);
	}
		else if(previoustranscation<0) {
			System.out .println("Withdraw:"+Math.abs(previoustranscation));
		}
		else {
			System.out .println("No transcation occured");
	}
	
}

void showMenu() {
	
	char option='\0';
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Welcome "+customerid);
	System.out.println("Your id "+customerid);
	//System.out.println("\n");
	System.out.println("A.Check Balance");
	System.out.println("B.Deposit");
	System.out.println("C.Withdraw");
	System.out.println("D.Previous transction");
	System.out.println("E.Exit");
	
	do
	{
		System.out.println("=========================================");
		System.out.println("Enter an option");
		System.out.println("=======================================");
		option = sc.next().charAt(0);
		System.out.println("\n");
		
		switch(option) {
		
		case 'A':
			System.out.println("--------------------------------------");
			System.out.println("Balance ="+balance);
			System.out.println("---------------------------------------");
			System.out.println("\n");
			break;
		
		case 'B':
			System.out.println("---------------------------------------");
			System.out.println("Enter an amount to deposit:");
			System.out.println("----------------------------------------");
			int amount = sc.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
		
		case'C':
			System.out.println("Enter an amount to withdraw:");
			System.out.println("--------------------------------------");
			int amount2=sc.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			
			break;
		case 'D':
			System.out.println("--------------------------------------");
			getprevioustranscation();
			System.out.println("--------------------------------------");
			System.out.println("\n");
			break;
			
		case 'E':
			System.out.println("********************************************");
			
		default:
			System.out.println("Invalid option! Please try again");
	}
}while(option!='E');
	System.out.println("Thank You for using our system");
}
}