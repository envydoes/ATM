import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        Login login = new Login();

        // Login attempt
        boolean loggedIn = false;
        while (!loggedIn) {
            loggedIn = login.authenticate();
        }

        // declare and initialize balance, withdraw, deposit, and transfer amount
        int balance = 5000, withdraw, deposit, transfer;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("**Automated Teller Machine**");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer");
            System.out.println("5. Change PIN");
            System.out.println("6. Exit");
            System.out.println("Choose the operation you want to perform: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose withdrawal amount:");
                    System.out.println("1. ₱1,000");
                    System.out.println("2. ₱2,000");
                    System.out.println("3. ₱3,000");
                    System.out.println("4. ₱4,000");
                    System.out.println("5. ₱5,000");
                    System.out.println("6. ₱6,000");
                    System.out.println("7. ₱7,000");
                    System.out.println("8. ₱,000");
                    System.out.println("9. ₱9,000");
                    System.out.println("10. ₱10,000");
                    System.out.println(". Other amount");
                    int withdrawChoice = sc.nextInt();

                    switch (withdrawChoice) {
                        case 1:
                            withdraw = 1000;
                            break;
                        case 2:
                            withdraw = 5000;
                            break;
                        case 3:
                            withdraw = 10000;
                            break;
                        case 4:
                            System.out.println("Enter the amount to be withdrawn: ");
                            withdraw = sc.nextInt();
                            break;
                        default:
                            System.out.println("Invalid choice for withdrawal amount.");
                            continue;
                    }

                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Enter the amount to transfer: ");
                    transfer = sc.nextInt();
                    if (balance >= transfer) {
                        System.out.println("Enter recipient account number: ");
                        sc.next();  // Simulate entering an account number
                        balance -= transfer;
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Insufficient Balance for transfer");
                    }
                    System.out.println("");
                    break;

                case 5:
                    login.changePin();
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
