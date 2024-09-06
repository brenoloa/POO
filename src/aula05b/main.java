package aula05b;

public class main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "URG-5034");
        c1.status();
        c1.ligar_carro();
        
        c1.abastecer(60);
        c1.status();
    }
}
