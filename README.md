# 📚 Exceções em Programação Orientada a Objetos (POO)

Este repositório reúne conceitos, exemplos e boas práticas sobre **exceções (exceptions)**, abordando desde a **definição** até a **implementação em Java**, passando por diferentes tipos e hierarquias. O objetivo é oferecer uma visão completa de como tratar erros de forma estruturada, tornando o código mais robusto e confiável.

---

## ✨ Sumário

1. [Introdução](#introdução)  
2. [O que são Exceções?](#o-que-são-exceções)  
3. [Tipos de Exceções em Java](#tipos-de-exceções-em-java)  
   - [Exceções Verificadas (Checked)](#exceções-verificadas-checked)  
   - [Exceções Não Verificadas (Unchecked)](#exceções-não-verificadas-unchecked)  
   - [Erros (Errors)](#erros-errors)  
4. [Exceções Personalizadas](#exceções-personalizadas)  
5. [Hierarquia das Exceções em Java](#hierarquia-das-exceções-em-java)  
6. [Lista de Exceções Java](#lista-de-exceções-java)  
7. [Exemplos de Código](#exemplos-de-código)  
   - [Exemplo Simples de Exceção Verificada](#exemplo-simples-de-exceção-verificada)  
   - [Exemplo de Exceção Não Verificada](#exemplo-de-exceção-não-verificada)  
   - [Exemplo de Exceção Personalizada](#exemplo-de-exceção-personalizada)  
8. [Boas Práticas no Uso de Exceções](#boas-práticas-no-uso-de-exceções)  
9. [Como Executar este Projeto](#como-executar-este-projeto)  
10. [Referências](#referências)  
11. [Licença](#licença)  
12. [Autor](#autor)  

---

## Introdução

Em programação, erros e situações inesperadas podem ocorrer a qualquer momento. Para lidar com esses casos, usamos **exceções**, que são mecanismos que interrompem o fluxo normal do código quando ocorre um problema. Na **Programação Orientada a Objetos (POO)**, as exceções são, em sua maioria, objetos que herdam de classes específicas, permitindo que sejam criadas, lançadas (throw) e tratadas (catch) de maneira organizada.

---

## O que são Exceções?

Uma **exceção** é um **evento anormal** que ocorre durante a execução de um programa, interrompendo o fluxo normal das instruções. Ela sinaliza que algo deu errado (por exemplo, falta de arquivo, falha em conexão com banco de dados, índice fora dos limites, etc.), e permite que o programador trate esses erros de forma adequada.

---

## Tipos de Exceções em Java

Em Java, as exceções são divididas em **verificadas** (checked), **não verificadas** (unchecked) e também há a categoria de **erros** (errors), que não são tecnicamente exceções, mas eventos críticos geralmente relacionados à JVM (Java Virtual Machine).

### Exceções Verificadas (Checked)

- **Verificadas pelo compilador**: o compilador força o tratamento (try-catch) ou declaração (throws).  
- Representam erros previsíveis, como falhas de I/O ou de banco de dados.

Exemplos comuns:
- `Exception` (classe base para checked exceptions)  
- `IOException`  
- `FileNotFoundException`  
- `SQLException`  
- `ParseException`  
- `ClassNotFoundException`  
- `InterruptedException`  

### Exceções Não Verificadas (Unchecked)

- **Não** são verificadas em tempo de compilação.  
- Geralmente derivam de `RuntimeException`.  
- Indicam erros de lógica, como `NullPointerException` ou `ArithmeticException`.

Exemplos comuns:
- `RuntimeException` (classe base para unchecked exceptions)  
- `NullPointerException`  
- `ArithmeticException`  
- `ArrayIndexOutOfBoundsException`  
- `ClassCastException`  
- `IllegalArgumentException`  
- `NumberFormatException`  

### Erros (Errors)

- Herdam de `Error`, não de `Exception`.  
- Geralmente indicam problemas críticos no ambiente de execução, não devem ser tratados diretamente.

Exemplos:
- `OutOfMemoryError`  
- `StackOverflowError`  
- `VirtualMachineError`  

---

## Exceções Personalizadas

Além das exceções fornecidas pela linguagem, é possível criar **exceções personalizadas** que refletem erros específicos do **domínio** da aplicação. Isso torna o código mais expressivo e facilita o tratamento:

```java
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
