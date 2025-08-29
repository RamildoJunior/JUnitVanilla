                                                Exercício de Testes com JUnit 

Este projeto foi desenvolvido como parte de um exercício prático de testes unitários com JUnit.
O objetivo é implementar e validar as regras de negócio por meio de testes automatizados, garantindo confiabilidade e manutenção do código.

Descrição do Problema

Um financiamento possui três atributos principais:

totalAmount → valor total financiado

income → renda mensal do cliente

months → número de meses do financiamento

E dois métodos de cálculo:

entry → valor da entrada (20% do valor total)

quota → valor da prestação mensal (sem juros)

🔒 Regra de Negócio

A prestação mensal não pode ser maior que metade da renda do cliente.

Se essa regra não for atendida, o financiamento é inválido e deve lançar uma IllegalArgumentException.

📝 Exemplos

Exemplo 1 (Inválido ❌)
{ totalAmount: 100000, income: 2000, months: 20 }
Entrada: 20000
Prestação: 4000
Metade da renda: 1000
➡️ Inválido, pois a prestação excede metade da renda.

Exemplo 2 (Válido ✅)
{ totalAmount: 100000, income: 2000, months: 80 }
Entrada: 20000
Prestação: 1000
Metade da renda: 1000
➡️ Válido, pois a prestação não ultrapassa metade da renda.

🧪 Testes Implementados (JUnit)

Foram desenvolvidos 10 testes unitários para validar o comportamento da classe Financing.

🔹 Construtor

✅ Deve criar o objeto com os dados corretos (válidos)

❌ Deve lançar IllegalArgumentException quando inválido

🔹 setTotalAmount

✅ Atualiza corretamente quando os dados forem válidos

❌ Lança exceção quando os dados forem inválidos

🔹 setIncome

✅ Atualiza corretamente quando os dados forem válidos

❌ Lança exceção quando os dados forem inválidos

🔹 setMonths

✅ Atualiza corretamente quando os dados forem válidos

❌ Lança exceção quando os dados forem inválidos

🔹 entry

✅ Calcula corretamente o valor da entrada (20%)

🔹 quota

✅ Calcula corretamente o valor da prestação mensal


