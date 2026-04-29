package br.com.fiapride.model;

public class Helicoptero extends Aeronave{

    private int qntHelices;



    public Helicoptero(String modelo, String tipoOperacao, double capacidadePeso, int qntHelices) {
        super(modelo, tipoOperacao, capacidadePeso);
        this.setQntHelices(qntHelices);
    }

    public int getQntHelices() {
        return qntHelices;
    }

    private void setQntHelices(int qntHelices) {
        this.qntHelices = qntHelices;
    }
}
