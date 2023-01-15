package BankManagement;

public class Main {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("Michal", 1);

        //System.out.println(c1.getBalance());

        c1.deposit(5);
        //c1.withdraw(6);
        c1.deposit(1);
        c1.withdraw(6);

        System.out.println(c1.getBalance());
    }
}
