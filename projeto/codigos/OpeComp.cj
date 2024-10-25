-> vazio principal() inicio
    # Nome do código: Operações e Comparações em Caju
    numero numeroReal . # Variável número real
    numero subtracao .
    numero multiplicacao .
    numero divisao .
    numero i .
    numeroReal := 10,5.

    # Laço de repetição para
    para (i := 0; i < 5; i := i+1) inicio
        exibir("Iteração " | i).

        # Operações com operadores
        subtracao := numeroReal - i.
        multiplicacao := numeroReal * i.
        divisao := numeroReal / (i + 1). # Evitar divisão por zero

        exibir("Subtração: " | subtracao).
        exibir("Multiplicação: " | multiplicacao).
        exibir("Divisão: " | divisao).

        # Comparações
        se (subtracao > 0) inicio
            exibir("subtração é maior que 0").
        fim

        se (multiplicacao >= 0) inicio
            exibir("multiplicação é maior ou igual a 0").
        fim

        se (divisao < numeroReal) inicio
            exibir("divisão é menor que" | numeroReal).
        fim

        se (nao(divisao >= numeroReal)) inicio # Negação
            exibir("divisão não é maior ou igual a " | numeroReal).
        fim
    fim

    retorne .
fim