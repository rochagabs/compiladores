
-> vazio main()
inicio
    vetor numero[5] lista.
    vetor caractere[10] nome.
    caractere ordenado.
    exibir("digite seu nome: ").
    nome := ler().    

    exibir(nome).
    exibir("vamos ordenar uma lista para voce").
    lista[0] := 5.
    lista[1] := 12.
    lista[2] := 9.
    lista[3] := 3.
    lista[4] := 1.
    countsort(lista).

    ordenado := estaOrdenado(lista|contar(lista)).
    exibir(ordenado).

    para cada (numero n : lista)
    inicio
        exibir(n).
    fim
fim


caractere estaOrdenado(vetor numero[10] vet| numero tamanho)
inicio
    caractere ord.
    numero i.
    ord := 's'.
    para (i := 0; i < tamanho - 1; i := i+1)
    inicio
        se (vet[i] > vet[i+1])
        inicio
            ord := 'n'.
        fim
    fim

    retorne ord.

fim


numero contar(vetor numero[10] vet)
inicio
    numero t.
    t := 0.
    para cada (numero n : vet)
    inicio
        t := t + 1.
    fim

    retorne t.

fim

vazio countsort(vetor numero[10] vet | numero tamanho)
inicio
    {codigo
    para
    countsort}
    vetor numero[tamanho] saida.
    vetor numero[10] count.
    numero i.
    numero indice.

    para (i := 0; i < tamanho; i := i+1 )
    inicio
        saida[i] := 0.
    fim 

    para (i := 0; i < 10; i := i+1)
    inicio
        count[i] := 0.
    fim

    para (i := 0; i < tamanho; i := i+1)
    inicio
        count[vet[i]] := count[vet[i]] + 1.
    fim

    para (i := 1; i < 10; i := i+1)
    inicio
        count[i] := count[i] + count[i - 1].
    fim

    indice := tamanho - 1.
    enquanto(indice>=0)
    inicio
        saida[count[vet[indice]] - 1] := vet[indice].
        count[vet[indice]] := count[vet[indice]] - 1.
        indice := indice - 1.

    fim

    para (i := 0; i < tamanho; i := i+1)
    inicio
        vet[i] := saida[i].
    fim

retorne .

fim