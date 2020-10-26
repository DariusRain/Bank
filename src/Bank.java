import java.util.HashSet;

public class Bank {
    private String bankName;
    private int revenue;
    private HashSet<Client> clients = new HashSet<Client>();
    public Bank(String bankName, int revenue)  {
        this.bankName = bankName;
        this.revenue = revenue;
    }
    public void withdraw(int amount, Client client, String accountNumber, String accountType) {
        if (amount <= client.getBalance() && client.isValid() && client.isClient(accountNumber)){
            for (Account account: client.getAccounts()) {
                if(account.getType() == accountType) {
                    account.decrease(amount);
                }
            }
        }
    }
    public void deposit(int amount, Client client, String accountType) {
        if (client.isValid()){
            for (Account account: client.getAccounts()) {
                if(account.getType() == accountType) {
                    account.increase(amount);
                }
            }
        }
    }
    public void newClient(String name, String accountNumber) {
        Client client = new Client(name, accountNumber);
        clients.add(client);
    }

    public void updateClient(Client client) {
        for (Client c: clients) {
            if(c.getAccountNumber() == client.getAccountNumber()) {
                clients.add(client);
            }
        }
    }
    public void showClients() {
        for (Client client : clients) {
            client.getInfo();
        }
    }

    public Client getClient(String accountNumber) {
        for (Client client: clients) {
            if(client.getAccountNumber() == accountNumber) {
                return client;
            }
        }
        return null;
    }

}
