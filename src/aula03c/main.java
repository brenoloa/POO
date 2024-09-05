package aula03c;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pessoas x1 = new Pessoas("Luis_Carlos", 25, 75.6f, 1.74f);
        Pessoas x2 = new Pessoas("Carlos_Alberto", 30, 65.5f, 1.85f);
        Pessoas x3 = new Pessoas("Breno_Andrade", 23, 55.5f, 1.73f);
        String x;
        int z;
        x1.exibir();
        x2.exibir();
        x3.exibir();
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome >>: ");
        x = scan.nextLine();

        System.out.println("Idade >>: ");
        z = scan.nextInt();
        Pessoas x4 = new Pessoas(x, z, 0, 0);
        x4.exibir();

        System.out.println("Peso de breno: " + x3.getPeso());
    }   
}
