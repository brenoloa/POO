package aula09b_sobrecarga;

public class App {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        /*
         * 
         */
        c1.reagir(false);
        c1.reagir("comida");
        c1.reagir(19);
        c1.reagir(8, 8.76);
        
    }
}
