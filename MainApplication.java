package BankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Account> list= new ArrayList<>();
        String name;

        System.out.println("Select Operations");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show Balance");
        System.out.println("5. List All");
        System.out.println("0. Exit");
        int choice,amt;
        boolean found=false;

        do {
            System.out.println("Enter Choice here : ");
            choice=sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("--- Account Open ---");
				System.out.println("Enter Name: ");
				name=sc.next();
				System.out.println("Enter Opening Amount to be Deposited: ");
				amt=sc.nextInt();
				Account acc=new Account(name,amt);
				list.add(acc);
				System.out.println("--- Account Opened Successfully ---");
				break;

                case 2:
                    System.out.println("--- Amount Deposit ---");
				System.out.println("Enter the Account Number: ");
				int accno=sc.nextInt();
				for(Account ac: list) {
                    if (accno == ac.getAccno()) {
                        found = true;
                        System.out.println("Customer Name: " + ac.getName());
                        System.out.println("Account Number: ACC00" + ac.getAccno());
                        System.out.println("Account Balance: " + ac.getBal());

                        System.out.println("Enter the Amount to be Deposited: ");
                        amt = sc.nextInt();
                        ac.setBal(ac.getBal() + amt);
                        System.out.println("--- Deposit Successfully ---");
                    }
                }
                if(found==false){
                    System.out.println("... Invalid Credentials ...");
                }

                    break;

                case 3:
                    System.out.println("--- Amount Withdraw ---");
                    System.out.println("Enter the Account Number: ");
                    int accno1=sc.nextInt();
                    for(Account ac: list) {
                        if (accno1 == ac.getAccno()) {
                            found = true;
                            System.out.println("Customer Name: " + ac.getName());
                            System.out.println("Account Number: ACC00" + ac.getAccno());
                            System.out.println("Account Balance: " + ac.getBal());

                            System.out.println("Enter the Amount to be Withdraw: ");
                            amt = sc.nextInt();
                            if (amt <= ac.getBal()) {
                                ac.setBal(ac.getBal() - amt);
                                System.out.println("--- Withdrawal Successfully ---");
                            }else{
                                System.out.println("Insufficient Balance");
                            }
                        }
                    }
                    if(found==false){
                        System.out.println("... Invalid Credentials ...");
                    }

                    break;

                case 4:
                    System.out.println("--- Account Balance ---");
                    System.out.println("Enter the Account Number: ");
                    int accno2=sc.nextInt();
                    for(Account ac: list) {
                        if (accno2 == ac.getAccno()) {
                            found = true;
                            System.out.println("Customer Name: " + ac.getName());
                            System.out.println("Account Number: ACC00" + ac.getAccno());
                            System.out.println("Account Balance: " + ac.getBal());
                        }
                    }
                    if(found==false){
                        System.out.println("... Invalid Credentials ...");
                    }
                    break;

                case 5:
                    System.out.println("--- List of All Accounts ---");
                    for(Account ac1:list) {
                        System.out.println(ac1);
                    }
                    break;

                case 0:
                    System.out.println("--- Thank You for Banking with US ---");
                    break;

                default:
                    System.out.println("--- Invalid Choice ---");
                    break;

            }

        }while(choice !=0);
    }
}
