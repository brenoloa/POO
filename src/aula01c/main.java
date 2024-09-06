package aula01c;

public class main {
    public static void main(String[] args) {
       Carro c1 = new Carro("NISSAN", "ASD-3456");
       Carro c2 = new Carro("TOYOTA", "ASD-3452");

       c1.setPlaca("23423-dsff");
       c1.setMarca("BMW");
       c1.status();
        
       System.out.println("========");
       c2.status();
       
       
    
    }
}
