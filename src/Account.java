import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String type;
    private Date dateOfCreation;
    private Date dateOfLastDeposit;
    private Date dateOfLastWithdraw;
    private int amountOfLastDeposit;
    private int amountOfLastWithdraw;
    private int balance;
    private ArrayList<Receipt> history;
    {
        history = new ArrayList<Receipt>();
    }
    public Account(String type) {
        this.type = type;
        this.dateOfCreation = new Date();
    }
    public int getBalance() {
        return balance;
    }
    public void decrease(int amount) {
        balance -= amount;
    }
    public void increase(int amount) {
        balance += amount;
    }
    public void setDateOfLast(String prop) {
        if (prop == "deposit") {
            dateOfLastDeposit = new Date();
        }
        if (prop == "withdraw") {
            dateOfLastWithdraw = new Date();
        }
    }
    public void setAmountOfLast(String prop, int amount) {
        if (prop == "deposit") {
            amountOfLastDeposit = amount;
        }
        if (prop == "withdraw") {
            amountOfLastWithdraw = amount;
        }
    }
    public String getType() {
        return type;
    }


}
