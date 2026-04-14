package br.com.fiapride.model;

public class Aviao {

    private String modelo;
    private String companhiaAerea;
    private int passageirosAtuais;
    private int capacidadePassageiros;
    private int quantidadeMotores;

    public Aviao(String modelo, String companhiaAerea, int capacidadePassageiros) {
        this.setModelo(modelo);
        this.setCompanhiaAerea(companhiaAerea);
        this.setCapacidadePassageiros(capacidadePassageiros);
        this.passageirosAtuais = 0;
    }

    public void embarcarPassageiro(int quantidade) {
        if (passageirosAtuais + quantidade > capacidadePassageiros) {
            System.out.println("Não há assentos suficientes. Passageiros atuais: " + passageirosAtuais);
            return;
        }

        passageirosAtuais += quantidade;
        System.out.println("Passageiros embarcaram! Total atual: " + passageirosAtuais);
    }

    public void desembarcarPassageiro(int quantidade) {
        if (quantidade > passageirosAtuais) {
            System.out.println("Não há passageiros suficientes para desembarcar.");
            return;
        }

        passageirosAtuais -= quantidade;
        System.out.println("Passageiros desembarcaram! Total atual: " + passageirosAtuais);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public int getPassageirosAtuais() {
        return passageirosAtuais;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros <= 0) {
            System.out.println("A capacidade deve ser maior que zero.");
            return;
        }
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        if (quantidadeMotores < 1 || quantidadeMotores > 4) {
            System.out.println("A quantidade de motores deve estar entre 1 e 4.");
            return;
        }
        this.quantidadeMotores = quantidadeMotores;
    }
}