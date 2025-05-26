# 💰 Simulação Básica de Conta Bancária

Este projeto é uma simulação simples de uma conta bancária desenvolvida em Java, com foco em conceitos de Programação Orientada a Objetos (POO), como **classes abstratas** e **interfaces**.

## ✨ Funcionalidades

A classe abstrata `ContaBancaria` implementa os métodos definidos na interface `Conta` e simula três operações bancárias básicas:

- **Depósito (`Deposit`)**  
  Permite ao usuário realizar depósitos com uma taxa de 1% aplicada ao valor inserido. O método possui tratamento de erros para impedir a entrada de valores não numéricos.

- **Saque (`Withdraw`)**  
  Permite ao usuário sacar valores desde que haja saldo suficiente. Também inclui validação para entrada de dados incorreta.

- **Consulta de Saldo (`TotalBalance`)**  
  Exibe o saldo atual da conta de forma simples e direta.

Cada operação é interativa e utiliza o `Scanner` para entrada de dados via terminal.

## ✅ Melhorias Recentes

- Tratamento de exceções com `try-catch` usando `InputMismatchException`.
- Limpeza do buffer do `Scanner` para evitar falhas em leituras subsequentes.
- Comentários explicativos no código para fins educacionais.

## 🔧 Tecnologias

- Java (JDK 8 ou superior)
- Terminal / Console

## 🧪 Objetivo Educacional

Este projeto tem como finalidade a prática dos seguintes conceitos:

- Estruturação de projetos em Java
- Uso de classes abstratas e interfaces
- Tratamento de exceções e validação de entradas
- Manipulação de entrada de dados com `Scanner`
- Lógica de controle de fluxo e validações básicas

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Pontinn/conta-bancaria.git
