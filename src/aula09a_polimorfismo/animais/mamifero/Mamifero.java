package aula09a_polimorfismo.animais.mamifero;

import aula09a_polimorfismo.animais.Animal;

public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void alimentar() {
        System.out.println("mamifero comendo. ");
    
    }

    @Override
    public void emitirSom() {
        System.out.println("som mamifero");
    
    
    }

    @Override
    public void locomover() {
        System.out.println("mamifero andando");
    
    }

    
}
