import java.util.ArrayList;

//import java.util.Random;
public class Client {
//    Random rand = new Random();
    private ArrayList<Account> accounts;
    {
        accounts = new ArrayList<Account>();
    }
    private int balance = 0;
    private boolean validAccount;
    private String accountNumber;
    private String name;
    public Client(String name, String accountNumber) {
        this.name = name;
        this.validAccount = true;
        this.accountNumber = accountNumber;
    }
    public boolean isClient(String accountNumber) {
        if (this.accountNumber == accountNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValid() {
        return validAccount;
    }
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        balance = 0;
        for (Account account: accounts) {
            balance += account.getBalance();
        }
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void newAccount(String accountType) {
        accounts.add(new Account(accountType));
    }
    public void invalidateAccount() {
        validAccount = false;
    }

}
