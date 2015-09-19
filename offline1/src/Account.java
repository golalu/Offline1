/**
 * Created by ASUS on 9/19/2015.
 */
public class Account {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;
    public Account(Customer customer, int accountNumber, double balance){
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(Customer cust, int no, String br){
        customer = cust;
        accountNumber = no;
        branch = br;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public Customer getCustomer(){
        return customer;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public String getBranch() {
        return branch;
    }
    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println( "Amount withdrawn exceeds the current balance!");
        }
    }
    public void print(){
        System.out.println( "Customer: " + getCustomerName()+ " Branch: " + branch + " A/C no: " + accountNumber + " Balance: " + balance);
    }
}