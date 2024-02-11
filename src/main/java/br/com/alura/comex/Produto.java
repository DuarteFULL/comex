package br.com.alura.comex;

public class Produto {
    // Cria a classe Produto com seus respectivos atributos:

    // Nome (Texto)
    // Descrição (Texto)
    // Preço Unitário (ponto flutuante)
    // Quantidade (numero).

    // Tarefa

    // Crie um comportamento para a classe Produto com o objetivo de imprimir no
    // console conforme abaixo:

    // >> Dados do produto

    // :: Nome: Livro

    // :: Descrição: Conjunto de folhas impressas.
    // Resultado esperado

    // Ao criar a classe de teste, inicialize um produto, manipule suas propriedades
    // e convoque a ação de impressão conforme definido na especificação do Produto.

    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;


    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(RecordTitulo tituloAPI) {
        this.nome = tituloAPI.title();
        this.descricao = tituloAPI.description();
        this.precoUnitario = tituloAPI.price();
    }

    public void imprimirProduto(){
        System.out.println(">> Dados do produto:");
        System.out.println();
        System.out.println(":: Nome: "+this.getNome());
        System.out.println(":: Descrição: "+this.getDescricao());
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", descricao=" + descricao + ", precoUnitario=R$" + precoUnitario
                + ", quantidade=" + quantidade + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
