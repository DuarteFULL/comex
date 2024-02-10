package br.com.alura.comex;

public class Eletronico extends Produto {


    //Criar as classes de produto Eletrônico e Livro. Ambas as classes são filhas da classe Produto, porém cada uma com algumas características únicas.

    //Eletrônico possui tudo que Produto tem mais:

    //Voltagem (numero)

    //Potencia (numero)

    private int voltagem;
    private int potencia;


    
    public Eletronico(String nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }



    public int getVoltagem() {
        return voltagem;
    }



    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }



    public int getPotencia() {
        return potencia;
    }



    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    

}
