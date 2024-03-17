package lr2;

public class Example7 {
    public interface Bankaccount {
        void depo(double amount);
        void withdraw(double amount);
        double getbalance();
    }
    public class Account implements Bankaccount {
        private double balance;
        public Account(double initialbalance) {
            this.balance = initialbalance;
        }
        @Override
        public void depo(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Success depo: " + amount);
            }
            else {
                System.out.println("Depo 0");
            }
        }
        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Success withdraw: " + amount);
            }
            else {
                System.out.println("No enough balance");
            }
        }
        @Override
        public double getbalance() {
            return balance;
        }
    }
}
