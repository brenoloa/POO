package aula09a_polimorfismo.animais.mamifero;

public class Cachorro extends Mamifero {

    public void enterrarOsso(){
        System.out.println("Cachorro enterrou o osso. . . .");

        
    }

    @Override
    public void locomover() {
        System.out.println("cachorro correndo ~~");
    }
    
}
