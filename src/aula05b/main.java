package aula05b;

public class main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Nissan", "ASD-1234");

        c1.ligar_carro();
        c1.desligar_farol();
        c1.desligar_carro();
        c1.abastecer(50);
        c1.ligar_carro();
        c1.status();
    
    }
}
