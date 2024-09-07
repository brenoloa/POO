package aula06c;

import java.util.Random;

public class Riosp {
    //atributos
    private Time casa;
    private Time fora;



    public void confronto(Time c1, Time c2) {
        this.casa = c1;
        this.fora = c2;


    }
    public void jogar() {
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(100); //0-99

        System.out.println("=================");
        if (resultado < 20) { // 20% chance de empate
            System.out.println("========= EMPATOU =========");
            casa.empate();
            fora.empate();
        } else if (resultado < 70) { // 50% chance de vitória da casa
            System.out.println("========= CASA VENCE =========");
            casa.vitoria();
            fora.derrota();
        } else { // 30% chance de vitória do fora
            System.out.println("========= FORA VENCE =========");
            casa.derrota();
            fora.vitoria();
        }
        System.out.println("=================");
    }
    }


