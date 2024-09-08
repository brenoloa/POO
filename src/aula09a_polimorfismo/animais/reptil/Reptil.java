package aula09a_polimorfismo.animais.reptil;

import aula09a_polimorfismo.animais.Animal;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("REPTIL COMENDO");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE REPTIL");
    }

    @Override
    public void locomover() {
        System.out.println("REPTIL RASTEJANDO");
    }

    
}
