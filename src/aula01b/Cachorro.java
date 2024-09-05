package aula01b;

public class Cachorro {
    //atributos
    String nome;
    int idade;
    String raça;
    

    void status() {
        System.out.println("==== FICHA ====");
        System.out.println("=== nome: " + this.nome);
        System.out.println("=== Idace: " + this.idade);
        System.out.println("=== Raça: " + this.raça);
    }

    void chamar() {
        System.out.println("Você chamou o cachorro " + this.nome);
    }

}
