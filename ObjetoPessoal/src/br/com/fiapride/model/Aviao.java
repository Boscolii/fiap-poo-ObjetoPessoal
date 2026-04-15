package br.com.fiapride.model;




public class Aviao extends Aeronave {
    private String companhiaAerea;

    public Aviao(String modelo, String companhiaAerea, int capacidadePassageiros) {
        this.setModelo(modelo);
        this.setCompanhiaAerea(companhiaAerea);
        this.setCapacidadePassageiros(capacidadePassageiros);
        this.passageirosAtuais = 0;
    }


    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }




}