import java.util.Date;

public class Receipt extends Bank {
    private Client client;
    private Date timeOf;
    private int amount = 0;
    private boolean wantReceipt;
    private boolean isDeposit;
    private String toAccount;
    private String ownerOfAccount;
    private String bankName;
    public Receipt(String accountNumber, String bankName, int revenue, boolean wantReceipt, String toAccount) {
        super(bankName, revenue);
        client = getClient(accountNumber);
        ownerOfAccount = client.getName();
        this.bankName = bankName;
        this.toAccount = toAccount;
        this.wantReceipt = wantReceipt;
        if (amount >= 0) {
            isDeposit = true;
        } else {
            isDeposit = false;
        }
        timeOf = new Date();

    }
    public void print() {
        if (wantReceipt) {
            System.out.println("Bank: " + bankName);
            System.out.println("Owner of account: " + ownerOfAccount);
            System.out.println("Date of transaction:" + timeOf);
            if (isDeposit) {
                System.out.println("Deposited $" + amount + " to " + toAccount);
            } else {
                System.out.println("Withdrawn $" + amount + " from " + toAccount);
            }
        }
    }
}
