package br.com.alura.comex;

public class Cliente {

    // Crie a classe Cliente com seus respectivos atributos:

    // Nome (Texto)
    // CPF (Texto)
    // E-mail (Texto)
    // Profissão (Texto).
    // Telefone (Texto)
    // Endereço (Endereco)

    // Resultado esperado

    // Crie uma classe de teste para efetuar a criação desse objetos e criar a
    // associação entre eles.

    private String nome;
    private String CPF;
    private String email;
    private String profissao;
    private String telefone;
    private Endereco endereco;
    
    
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", CPF=" + CPF + ", email=" + email + ", profissao=" + profissao
                + ", telefone=" + telefone + ", endereco=" + endereco + "]";
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    


}
