package Des_06;

import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	int acc_no; 
	String name; 
	float amount;
	long cont_no;
	String account_type;
	private static Scanner sc2;
	
	//Insert the customer detail's
	void insert(int no, String ss, float amt, long c_no, String ac_type) {
		acc_no = no;
		name = ss;
		amount = amt;
		cont_no = c_no;
		account_type = ac_type;
	}

	//display detail's
	void display() {
		System.out.println("\t\t::Customer Account Details:: "+"\n"+"Account Type :: \t"+account_type+"\n"+"Account Number:: \t"+acc_no+"\n"+"Account Holder Name:: "+name+"\n"+"Contact No:: \t"+cont_no+"\n"+"Account Balance:: \t"+amount);
	}
	
	//calculate deposite amount
	void deposite() {
		System.out.println("Enter The Deposite Amount:: ");
		float deposite_amount = sc.nextFloat();
		//Check deposite amount is less than or equal to zero
		if (deposite_amount <= 0) {
			System.out.println("*************Deposite amount is less than or equal to 0 ! Please enter valid deposite Amount.**********");
		}else {
			amount = amount + deposite_amount;
			display();
		}
	}
	
	//calculate withdraw amount
	void withdraw() {
		System.out.println("Enter The Withdraw Amount:: ");
		float withdraw_amount = sc.nextFloat();
		//check withdraw amount
		if (withdraw_amount > amount || withdraw_amount == 0 ) {
			System.out.println("*************Insuffient Balance or zero! Please enter valid Withdraw Amount.**********");
		}else {
			amount = amount - withdraw_amount;
			display();
		}
	}
	
	//check Account detail's
	void checkbalance() {
		display();
		System.out.println("\t\t********** Thank You! Visit Again. **********");
	}
	
	public static void main(String[] args) {
		sc2 = new Scanner(System.in);
		Bank b = new Bank();
		
			int n;
			/*Enter the choice*/
			do{
			System.out.println("\n******************** Welcome To Bank System ********************");
			System.out.println("Enter the choice:: ");
			System.out.println("1. Insert the account detail's ");
			System.out.println("2. Display the account detail's");
			System.out.println("3. Deposite amount ");
			System.out.println("4. withdraw amount ");
			System.out.println("5. Check Account ");
			System.out.println("\n");
			n = sc2.nextInt();
			switch(n){
			
			//New Record Entry
			case 1:
				System.out.println("!!Enter the deatail's of customer!!");
				/*Enter the name of Customer*/
				System.out.println("Enter the Name:: ");
				sc2.nextLine();
				String names = sc2.nextLine();
				
				/*Enter the account type by using switch case*/
				String s = null;
				int no;	
				System.out.println("Enter the type of account:: ");
				System.out.println("1. Saving ");
				System.out.println("2. Current");
				no = sc2.nextInt();
				switch(no) {
					case 1 :
						 s = "Saving";
						 break;
					case 2 :
						s= "Current";
						break;
				}
			
				/*Enter the account no of customer*/
				System.out.println("Enter the account no:: ");
				int ac_no = sc2.nextInt();
				
				/*Enter the Contact number of customer*/
				System.out.println("Enter the Contact number:: ");
				long cont_nos =sc2.nextLong();
				
				/*Enter the Amount*/
				System.out.println("Enter the Amount:: ");
				float amt  =sc2.nextFloat();
				
				b.insert(ac_no, names, amt, cont_nos, s);
				break;
			
			//Display Account detail's
			case 2:
				b.display();
				break;
			
			//Call deposite method
			case 3:
				b.deposite();
				break;
			
			//Call withdraw method
			case 4:
				b.withdraw();
				break;
				
			//Call check balance method
			case 5:
				b.checkbalance();
				break;
			
			default:
				System.out.println("You enter the wrong choice!");
			}
		}while(n != 5);
	}
}
