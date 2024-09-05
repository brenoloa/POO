package aula02;

public class Caneta {
    public String cor;
    public String modelo;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor:  " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada:  " + this.tampada);
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

    public void rabiscar() {
        if (this.tampada == false){
            System.out.println("RABISCANDO.............................");
        }
        else {
            System.out.println("ERRO. TAMPADA.");
        }
    }
}
