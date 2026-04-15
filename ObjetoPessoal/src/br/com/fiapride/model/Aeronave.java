package br.com.fiapride.model;

public class Aeronave {
    private String modelo;
    private int passageirosAtuais;
    private int capacidadePassageiros;
    private String modeloPainelControle;
    private boolean caixaPreta;
    private String tipoOperacao;
    private double capacidadePeso;

    public Aeronave (String modelo, String tipoOperacao, int capacidadePassageiros, double capacidadePeso){
        this.modelo = modelo;
        this.setTipoOperacao(tipoOperacao);
        this.setCapacidadePassageiros(capacidadePassageiros);
        this.capacidadePeso = capacidadePeso;
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

    public int getPassageirosAtuais() {
        return passageirosAtuais;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public String getModeloPainelControle() {
        return modeloPainelControle;
    }

    public boolean isCaixaPreta() {
        return caixaPreta;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setModeloPainelControle(String modeloPainelControle) {
        this.modeloPainelControle = modeloPainelControle;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros <= 0) {
            System.out.println("A capacidade deve ser maior que zero.");
            return;
        }
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public void setCaixaPreta(boolean caixaPreta) {
        this.caixaPreta = caixaPreta;
    }


}
