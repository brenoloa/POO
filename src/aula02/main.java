package aula02;

public class main {
    public static void main(String[] args) {
        Caneta bic = new Caneta();
        bic.modelo = "Faber_Castell";
        bic.cor = "AZUL";
        //bic.ponta = 0.7;
        bic.carga = 80;
        bic.tampar();
        //bic.destampar();
        bic.status();
        bic.rabiscar();
    }
}
