package br.com.alura.comex;

public class Livro extends Produto implements identificavel {

    //TAREFA:

    //Criar as classes de produto Eletrônico e Livro. Ambas as classes são filhas da classe Produto, porém cada uma com algumas características únicas.

    //Livro possui tudo que Produto tem mais:

    //Isbn (Texto)

    //Total de Paginas (numero)

    private String isbn;
    private int paginas;

    public Livro(String nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String getIdentificacao() {
        return "O objeto Livro identificável tem o nome: " + this.getNome() +" e ISBN "+ this.getIsbn();
    }

    



}
