package aula03b;

public class Teclado {
    private boolean LIGADO;
    public String cor_rbg;

    public void ligar() {
        this.LIGADO = true;
    }

    public void desligar() {
        this.LIGADO = false;
    }

    public void teclar() {
        if (this.LIGADO == true){
            System.out.println("DIGITANDO...");
        }
        else {
            System.out.println("TECLADO DESLIGADO.");
        }
    }

    public void status() {
        System.out.println(LIGADO);
        
        if (this.LIGADO == true){
            System.out.println("O teclado está ligado e a cor do rgb é " + this.cor_rbg);
        }
        else {
            System.out.println("DESLIGADO.");
        }
    }

}
