package aula01d;

public class App {
    public static void main(String[] args) {
        Carro c1 = new Carro("NISSAN", "BDS-3456");
        Carro c2 = new Carro("BMW", "SDF-34DF");
        Carro c3 = new Carro("NISSAN", "SHD-EDFF");
        
        
        
        
        c1.status();
        System.out.println("=====");
        c2.status();
        System.out.println("=====");
        c3.status();
        
       
    }
}
