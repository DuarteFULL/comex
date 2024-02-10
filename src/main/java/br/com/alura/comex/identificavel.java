package br.com.alura.comex;

public interface identificavel {

    //TAREFA:
    //A Classe Cliente e Classe Livro devem implementar um método Identificar de forma obrigatória 
    //(cada uma classe implementa de uma forma diferente).
    //Classe Cliente deve retornar uma String com NOME e CPF;
    //Classe Livro deve Retornar um String com NOME e ISBN;
    //Para solucionar esse problema devemos usar uma Interface.


    String getIdentificacao();

}
