package aula01controleremoto;

public class App {
    public static void main(String[] args) {
        Controle c1 = new Controle();
        Controle c2 = new Controle();
        Controle c3 = new Controle();

        
        c1.ligar();
        c1.status();
        System.out.println("========");        
        c2.ligar();
        c2.desligar();
        c2.status();
        System.out.println( "========");
        c3.status();
    }
}
