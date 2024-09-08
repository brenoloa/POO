package aula09c_sobrepor;

public class App {
    public static void main(String[] args) {
        Mamifero x = new Mamifero();
        Lobo y = new Lobo();
        Cachorro c = new Cachorro();

        c.reagir("ola");
        c.reagir("vai apanhar");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
        //y.emitirSom();
        //c.emitirSom();
        //x.emitirSom();

        
    }
}
