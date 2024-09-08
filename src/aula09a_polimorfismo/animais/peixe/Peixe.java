package aula09a_polimorfismo.animais.peixe;

import aula09a_polimorfismo.animais.Animal;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("peixe comendo__");
    }

    @Override
    public void emitirSom() {
        System.out.println("PEIXE SOM..........");
    }

    @Override
    public void locomover() {
        System.out.println("PEIXE NADANDOOOO.");
    }


}
