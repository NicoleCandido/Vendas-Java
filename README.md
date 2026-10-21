<h1 align="center">Vendas em Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8a2be2?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Swing-ff69b4?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/POO-8a2be2?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Concluído-ff69b4?style=for-the-badge" />
</p>

<p align="center">
  Sistema de vendas com interface gráfica que calcula o valor final de acordo com o parcelamento<br>
  e acompanha a maior venda e o total vendido. Criado para praticar Programação Orientada a Objetos.
</p>

---

## Regras de parcelamento

| Forma de pagamento    | Ajuste no valor        |
| :-------------------- | :--------------------- |
| À vista (1x)          | **10% de desconto**    |
| De 2x a 3x            | **5% de acréscimo**    |
| Acima de 3x           | **10% de acréscimo**   |

**Exemplo:** uma venda de R$ 200,00 em 6x fica R$ 220,00, ou seja, 6x de R$ 36,67.

## Funcionalidades

- Calcula o valor final e o valor de cada parcela
- Mostra a **maior venda** registrada
- Mostra a **soma de todas as vendas**
- Aceita valores com vírgula ou ponto (ex.: `150,90`)
- Exibe os valores formatados em Real (`R$ 1.234,56`)
- Avisa quando o valor ou as parcelas são inválidos

## Conceitos de POO aplicados

- **Encapsulamento:** atributos privados com getters e setters
- **Validação nos setters:** valor e parcelas inválidos são recusados
- **Constantes** (`static final`) para as taxas, facilitando mudanças nas regras
- **Separação de responsabilidades:** a classe `Venda` faz os cálculos e a tela só exibe os resultados
