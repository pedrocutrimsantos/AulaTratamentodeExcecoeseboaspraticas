package com.exemplo.tratamentoexcecoes;

import java.util.Scanner;

public class ManipuladorEntrada {

    public void processarEntrada() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Você digitou o número: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Erro: Por favor, digite um número inteiro válido.");
        } finally {
            System.out.println("Processamento da entrada finalizado.");
        }
    }

    public void realizarDivisao() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o denominador: ");
            int denominador = Integer.parseInt(scanner.nextLine());

            int resultado = numerador / denominador;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por zero não é permitida.");
        } catch (NumberFormatException e) {
            System.err.println("Erro: Por favor, digite apenas números inteiros.");
        } finally {
            System.out.println("Finalizando o cálculo de divisão.");
        }
    }
}
