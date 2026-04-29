package br.com.fiapride.model;

public class Aviao extends Aeronave {
    private String companhiaAerea;
    private int capacidadePassageiros;
    private int passageirosAtuais;


    public Aviao(String modelo,String tipoOperacao, String companhiaAerea, int capacidadePassageiros, double capacidadePeso) {
        super(modelo,tipoOperacao,capacidadePeso);
        this.setCompanhiaAerea(companhiaAerea);
        this.setCapacidadePassageiros(capacidadePassageiros);
    }


    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros <= 0) {
            System.out.println("A capacidade deve ser maior que zero.");
            return;
        }
        this.capacidadePassageiros = capacidadePassageiros;
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
    public int getPassageirosAtuais() {
        return passageirosAtuais;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

}