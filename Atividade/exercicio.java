public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void alterarSaldo(double valor) {
        this.saldo += valor;
    }
}

public class Saque {
    private ContaBancaria conta;

    public Saque(ContaBancaria conta) {
        this.conta = conta;
    }

    public void realizarSaque(double valor) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("O valor do saque deve ser positivo.");
            }
            if (valor > conta.getSaldo()) {
                throw new IllegalArgumentException("Saldo insuficiente para o saque.");
            }

            conta.alterarSaldo(-valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        Saque saque = new Saque(conta);

        // Testes de saque
        saque.realizarSaque(500);  // Saque válido
        saque.realizarSaque(1500); // Saque inválido (saldo insuficiente)
        saque.realizarSaque(-200); // Saque inválido (valor negativo)
    }
}
