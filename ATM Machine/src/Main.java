import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterFace op = new AtmOperationImplement();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !");
        System.out.print("Enter ATM number: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter ATM pin number ");
        int atmPin = sc.nextInt();

        if((atmnumber == atmNumber) && (atmpin == atmPin)) {
            while (true) {
                System.out.println("1.View Availble Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View States\n5.Exit");
                System.out.print("Enter Choice :");
                int choice = sc.nextInt();
                if (choice ==1) {
                    op.viewBalance();

                } else if(choice == 2) {
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if(choice == 3) {
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);

                }else if(choice == 4) {
                    op.viewMiniStatement();

                }else if(choice == 5) {
                    System.out.println("Collect ATM Card\n Thank you for using ATM Machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter the correct choice");
                }
            }
        } else {
            System.out.println("Incorrection ATM Number or Pin");
            System.exit(0);
        }
    }
}