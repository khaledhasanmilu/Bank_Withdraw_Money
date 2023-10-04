public class BankAccount {
    public String name;
    public String id;
    public double balance;
    public void details(String name,String id){

        System.out.println(name+id);
    }
    public void deposit(double amount){
        balance = balance+amount;
    }

    public void withdraw(double amount) {
        if(amount<balance)
            balance -=amount;
    }
}
