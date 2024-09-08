package aula09a_polimorfismo.animais.mamifero;

public class Canguru extends Mamifero{

    public void usarBolsa(){
        System.out.println("Canguru usou bolsa.");

        
    }

    @Override
    public void locomover() {
        System.out.println("CANGURU PULANDO - - - -");
    }
    
}
