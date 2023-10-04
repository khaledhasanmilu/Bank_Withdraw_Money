public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount amount1 = new BankAccount();
        amount1.name="Rashid";
        amount1.id="102345654";
        System.out.print(amount1.name +"\n"+"Customer Id:"+amount1.id+"\n");
        amount1.balance=1000;
        System.out.println("Balance before deposit:"+amount1.balance);
        amount1.deposit(2000);
        System.out.println("Balance after deposit:"+amount1.balance);
        amount1.withdraw(1000);
        System.out.println("Balance after withdraw:"+amount1.balance);

        BankAccount amount2 = new BankAccount();
        amount2.name = "Rahim";
        amount2.id = "12345676";
        System.out.print(amount2.name+"\n"+"Customer id:"+amount2.id+"\n");
        amount2.balance = 2000;
        System.out.println("Balance before deposit:"+amount2.balance);
        amount2.deposit(1000);
        System.out.println("Balance after deposit:"+" "+amount2.balance);


    }
}
