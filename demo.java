import java.util.Scanner;
public class demo {
    
    public static void main(String[] args) {

        //declare variables
            double balance = 0.00; // initial balance
            Scanner scanner = new Scanner(System.in);
            boolean isRunning = true;
            int choice;

        //execute the program
            while (isRunning) {
                //display menue 
                System.out.println("********************");
                System.out.println("Welcome to the ATM");
                System.out.println("********************");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("********************");

            //get and process user input
                System.out.print("Please enter your choice (1 to 4): ");
                choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Your balance is:" );
                            System.out.println("********************"); showBalance(balance);
                           
                            break;
                            
                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            balance = balance + deposit(scanner, balance);
                            System.out.println("********************");
                            break;
                            
                        case 3:
                            System.out.print("Enter amount to withdraw: ");
                            balance = balance - withdraw(balance);
                            System.out.println("********************");
                            break;

                        case 4:
                            isRunning = false;
                            System.out.println("Thank you for using the ATM. Goodbye!");
                            System.out.println("********************");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                            System.out.println("********************");
                    }
                }
                

        scanner.close();
    }

    // show current balance
        static void showBalance(double balance) {
            System.out.printf("R%.2f%n", balance);
        }

    //show deposited amount
        static double deposit(Scanner scanner , double balance){
            double amount;

            System.out.println("Enter amount to deposit: ");
            amount = scanner.nextDouble();

            if (amount < 0) {
                System.out.println("Invalid deposit amount. Please enter a positive value.");
                return 0;
                
            } else {
                return amount;
            }
            
        }

    //show withdrawn amount 
        static double withdraw(double balance){
            double amount;

            System.out.println("Enter amount to withdraw:");
            amount = new Scanner(System.in).nextDouble();

            if (amount > balance) {
                System.out.println("Insufficient funds. Please enter a smaller amount.");
                return 0;

            } else if (amount < 0) {
                System.out.println("Invalid withdrawal amount. Please enter a positive value.");
                return 0;


            } else {
                return amount;

            }
        }
}