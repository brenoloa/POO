package aula03c;

public class main {
    public static void main(String[] args) {
        Pessoas x1 = new Pessoas("Luis_Carlos", 25, 75.6f, 1.74f);
        Pessoas x2 = new Pessoas("Carlos_Alberto", 30, 65.5f, 1.85f);
        Pessoas x3 = new Pessoas("Breno_Andrade", 23, 55.5f, 1.73f);

        x1.exibir();
        x2.exibir();
        x3.exibir();
    
    
    System.out.println("Peso de breno: " + x3.getPeso());
    }   
}
