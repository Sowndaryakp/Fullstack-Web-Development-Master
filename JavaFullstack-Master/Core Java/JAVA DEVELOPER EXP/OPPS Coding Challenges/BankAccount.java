public class BankAccount {
    private String accountNumber;
    private double balance;
    private Customer accountHolder;

    // Constructor
    public BankAccount(String accountNumber, double balance, Customer accountHolder){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public Customer getAccountHolder(){
        return  accountHolder;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }

    public static void main(String[] args){
        Customer c1 = new Customer("Sowndu", "sona@gmail.com");
        BankAccount account= new BankAccount("ACC01", 500.00, c1);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Account Holder: " + account.getAccountHolder().getName());
        System.out.println("Email: " + account.getAccountHolder().getEmail());
    }
}


