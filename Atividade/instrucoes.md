# Exercício de Simulação de Saque de Banco - POO

## Descrição

Este repositório contém um exercício de simulação de saque bancário utilizando **Programação Orientada a Objetos (POO)** em **Java**. O código original contém **más práticas** de programação que precisam ser corrigidas, aplicando **boas práticas** como validações antes da execução das operações e a **separação de responsabilidades** entre as classes.

### Objetivo do Exercício

O objetivo deste exercício é:

- Refatorar o código fornecido para melhorar a eficiência e clareza.
- Aplicar boas práticas de **Programação Orientada a Objetos**.
- Substituir o uso excessivo de exceções para controle de fluxo por verificações de condição.
- Melhorar a separação de responsabilidades entre as classes.

## Estrutura do Exercício

O código está estruturado em três classes principais:

1. **ContaBancaria**: Responsável por gerenciar o saldo da conta bancária.
2. **Saque**: Responsável por validar e realizar a operação de saque.
3. **Main**: Responsável por instanciar a conta e realizar os testes de saque.

## Problemas no Código Original

O código fornecido contém os seguintes problemas:

1. **Uso excessivo de exceções para controle de fluxo**:
   - Exceções estão sendo usadas para verificar condições simples, como se o valor do saque é positivo ou se há saldo suficiente. Isso não é eficiente, pois exceções devem ser usadas para casos excepcionais e não para validações comuns.
  
2. **Falta de clareza nas validações**:
   - A lógica de negócios e o tratamento de erros estão misturados, o que dificulta a manutenção e a compreensão do código.

3. **Responsabilidade das classes não bem definida**:
   - A classe `Saque` está fazendo validações e tratando exceções, o que deveria ser responsabilidade da classe `ContaBancaria`.

## Tarefas a Serem Realizadas

1. **Evitar o uso excessivo de exceções para controle de fluxo**:
   - Substituir as exceções por verificações de condição (usando `if`).
  
2. **Melhorar a clareza nas mensagens de erro**:
   - As mensagens de erro devem ser claras e indicar de forma precisa o que causou o problema.

3. **Separar as responsabilidades de validação e execução**:
   - A classe `ContaBancaria` deve ser responsável pela validação de saldo e condições de saque.
   - A classe `Saque` deve ser responsável apenas por realizar o saque, depois que as validações forem feitas.

## Como Rodar o Código

1. Clone este repositório em seu ambiente local:
    ```bash
    git clone https://github.com/seu-usuario/exercicio-saque-banco.git
    ```

2. Navegue até a pasta do projeto:
    ```bash
    cd exercicio-saque-banco
    ```

3. Compile o código Java:
    ```bash
    javac ContaBancaria.java Saque.java Main.java
    ```

4. Execute o programa:
    ```bash
    java Main
    ```

5. Verifique a saída para garantir que o código está funcionando corretamente, conforme os testes descritos.

## Exemplo de Saída Esperada

Caso o código seja corrigido corretamente, a execução dos testes de saque gerará a seguinte saída:

```bash
Saque de R$500.0 realizado com sucesso.
Erro: Saldo insuficiente para o saque.
Erro: O valor do saque deve ser positivo.
