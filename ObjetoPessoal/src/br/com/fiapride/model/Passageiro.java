package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private int idade;
    private int qntBagagem;
    private int CPF;

    public Passageiro(String nome, int idade, int qntBagagem, int CPF){
        this.setNome(nome);
        this.setIdade(idade);
        this.setQntBagagem(qntBagagem);
        this.CPF = CPF;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQntBagagem() {
        return qntBagagem;
    }

    public void setQntBagagem(int qntBagagem) {
        this.qntBagagem = qntBagagem;
    }

    public int getCPF(){
        return CPF;
    }
}
