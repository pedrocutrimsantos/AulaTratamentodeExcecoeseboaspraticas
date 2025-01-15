public class ExceptionHandlingExample {

    // Classe personalizada de exceção
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    // Classe representando uma conta bancária
    static class BankAccount {
        private String accountHolder;
        private double balance;

        public BankAccount(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        public void withdraw(double amount) throws CustomException {
            if (amount > balance) {
                throw new CustomException("Saldo insuficiente para a retirada de: " + amount);
            }
            balance -= amount;
            System.out.println("Retirada de R$" + amount + " realizada com sucesso. Saldo restante: R$" + balance);
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("O valor do depósito deve ser maior que zero.");
            } else {
                balance += amount;
                System.out.println("Depósito de R$" + amount + " realizado com sucesso. Saldo atual: R$" + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("João Silva", 500.0);

        System.out.println("Bem-vindo, " + account.accountHolder + "!");

        // Tentativa de operações com captura de exceções
        try {
            account.deposit(300.0);
            account.withdraw(200.0);
            account.withdraw(700.0); // Deve lançar uma exceção
        } catch (CustomException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Operações finalizadas.");
    }
}
