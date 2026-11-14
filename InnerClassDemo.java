
interface Notifier {
    void sendMessage();
}

class BankAccount {

    private double balance = 1000;

    // Inner class
    class AccountDetails {
        void updateBalance() {
            System.out.println("Old Balance = " + balance);
            balance = balance + 500;
            System.out.println("New Balance = " + balance);
        }
    }

    // Static nested class
    static class Receipt {
        void printReceipt() {
            System.out.println("Receipt generated successfully.");
        }
    }

    void sendNotification(Notifier n) {
        n.sendMessage();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        BankAccount.AccountDetails details =
            account.new AccountDetails();

        details.updateBalance();

        BankAccount.Receipt receipt =
            new BankAccount.Receipt();

        receipt.printReceipt();

        Notifier notifier = new Notifier() {
            public void sendMessage() {
                System.out.println("Bank notification sent.");
            }
        };

        account.sendNotification(notifier);
    }
}
