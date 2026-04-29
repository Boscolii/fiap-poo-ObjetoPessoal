package br.com.fiapride.model;

public class Viagem {

    private String destino;
    private String piloto;

    private Aviao aviaoUtilizado;
    private Passageiro viajante;

    public Viagem(String destino, Aviao aviaoUtilizado, Passageiro viajante, String piloto){
        this.destino = destino;
        this.aviaoUtilizado = aviaoUtilizado;
        this.viajante = viajante;
        this.piloto = piloto;

        System.out.println("Nova viagem para: " + this.destino);
    }

    public void ExibirViagem(){
        System.out.println("-------Informações da viagem -------");
        System.out.println("Destino - " + this.destino);
        System.out.println("Nome do passageiro - " + this.viajante.getNome());
        System.out.println("Modelo do aviao - " + this.aviaoUtilizado.getModelo());
        System.out.println("Companhia - " + this.aviaoUtilizado.getCompanhiaAerea());
        System.out.println("Piloto - " + this.piloto);
        System.out.println("-------------------------------------");
    }


    public String getDestino() {
        return this.destino;
    }

    public String getPiloto() {
        return this.piloto;
    }

    public Aviao getAviaoUtilizado() {
        return this.aviaoUtilizado;
    }

    public Passageiro getViajante() {
        return this.viajante;
    }
}
