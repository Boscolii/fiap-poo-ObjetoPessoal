package br.com.fiapride.model;

public class Aeronave {
    private String modelo;
    private String modeloPainelControle;
    private boolean caixaPreta;
    private String tipoOperacao;
    private double capacidadePeso;

    public Aeronave (String modelo, String tipoOperacao,double capacidadePeso){
        this.setModelo(modelo);
        this.setTipoOperacao(tipoOperacao);
        this.capacidadePeso = capacidadePeso;
    }


    public String getModelo() {
        return modelo;
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

    public double getCapacidadePeso() {
        return capacidadePeso;
    }

    public void setModeloPainelControle(String modeloPainelControle) {
        this.modeloPainelControle = modeloPainelControle;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public void setCaixaPreta(boolean caixaPreta) {
        this.caixaPreta = caixaPreta;
    }

    private void setModelo(String modelo){this.modelo = modelo;
    }

    public void setCapacidadePeso(double capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }
}
