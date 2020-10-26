public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank", 3000000);
        bank.newClient("Darius", "1209-3029-3421-2532");
        // New Client
        bank.showClients();

        // Deposit money
        bank.deposit(3000, bank.getClient("1209-3029-3421-2532"), "Checking-Account");

        // See deposited money
        bank.showClients();

        // Withdraw money
        bank.withdraw(1500, bank.getClient("1209-3029-3421-2532"), "1209-3029-3421-2532", "Checking-Account");

        // See withdrawn result
        bank.showClients();
    }
}
