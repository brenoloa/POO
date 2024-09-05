package aula03b;

public class main {
    public static void main(String[] args) {
        Teclado razer = new Teclado();

        razer.cor_rbg = "vermelho";
        
        razer.status();
        
        razer.teclar();
        razer.ligar();
    }
}
