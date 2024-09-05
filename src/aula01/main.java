package aula01;

public class main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        //c1.tampar();
        c1.ponta = 0.5;
        c1.modelo = "Faber Castell";
        c1.status();
        c1.destampar();
        c1.rabiscar();
    
    
    
        //

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "azul marinho";
        c2.status();
        c2.tampar();
        c2.rabiscar();

    }
}
