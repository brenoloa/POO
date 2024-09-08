package aula09a_polimorfismo.animais.ave;

import aula09a_polimorfismo.animais.Animal;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        System.out.println("AVE COMENDO");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE AVE..");
    }

    @Override
    public void locomover() {
        System.out.println("AVE VOANDO...");
    }

    

    
}
