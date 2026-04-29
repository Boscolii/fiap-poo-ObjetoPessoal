package br.com.fiapride.main;

import br.com.fiapride.model.Aviao;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Aviao aviao1 = new Aviao("Airbus A320", "LATAM", 180);
        aviao1.embarcarPassageiro(50);

        Aviao aviao2 = new Aviao("Boeing 737", "GOL", 170);
        aviao2.embarcarPassageiro(100);
        aviao2.desembarcarPassageiro(20);

        Passageiro passageiro1 = new Passageiro("Pedro", 19, 3, 548644858);

        System.out.println("Avião 1 - Modelo: " + aviao1.getModelo() +
                " | Companhia: " + aviao1.getCompanhiaAerea() +
                " | Passageiros atuais: " + aviao1.getPassageirosAtuais());
        System.out.println("Avião 2 - Modelo: " + aviao2.getModelo() +
                " | Companhia: " + aviao2.getCompanhiaAerea() +
                " | Passageiros atuais: " + aviao2.getPassageirosAtuais();


        Viagem viagem = new Viagem("Canada", aviao1, passageiro1, "Alfredo");

        viagem.ExibirViagem();




    }
}