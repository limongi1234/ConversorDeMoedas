# 💱 Conversor de Moedas em Java

Este projeto é um **Conversor de Moedas com Java**, que utiliza uma API externa para obter **taxas de câmbio em tempo real**, possui **interface gráfica com JavaFX**, **histórico de conversões** e testes automatizados com **JUnit 5 e Mockito**.

---

## 🚀 Funcionalidades

- Interface gráfica simples (JavaFX)
- Conversão em tempo real usando a [API ExchangeRate.host](https://exchangerate.host/)
- Suporte a múltiplas moedas (USD, EUR, BRL, GBP, JPY, CAD)
- Histórico de conversões
- Testes unitários com JUnit 5
- Testes com simulação de API usando Mockito

---

## 🖼️ Interface Gráfica

O app possui interface com:

- Seleção da moeda de origem e destino
- Campo para digitar o valor
- Resultado formatado
- Área de histórico com todas as conversões realizadas

---

## 🏗️ Estrutura do Projeto

# 💱 Conversor de Moedas em Java

Este projeto é um **Conversor de Moedas com Java**, que utiliza uma API externa para obter **taxas de câmbio em tempo real**, possui **interface gráfica com JavaFX**, **histórico de conversões** e testes automatizados com **JUnit 5 e Mockito**.

---

## 🚀 Funcionalidades

- Interface gráfica simples (JavaFX)
- Conversão em tempo real usando a [API ExchangeRate.host](https://exchangerate.host/)
- Suporte a múltiplas moedas (USD, EUR, BRL, GBP, JPY, CAD)
- Histórico de conversões
- Testes unitários com JUnit 5
- Testes com simulação de API usando Mockito

---

## 🖼️ Interface Gráfica

O app possui interface com:

- Seleção da moeda de origem e destino
- Campo para digitar o valor
- Resultado formatado
- Área de histórico com todas as conversões realizadas

---

## 🏗️ Estrutura do Projeto

├── src
│ ├── main
│ │ └── service
│ │ ├── ConversorFX.java # Interface gráfica
│ │ ├── ConversorService.java # Lógica de conversão
│ │ ├── ConversaoClient.java # Interface para obter taxa
│ │ └── ConversaoClientHttp.java # Implementação real (API)
│ └── test
│ └── service
│ └── ConversorServiceTest.java # Testes com Mockito



