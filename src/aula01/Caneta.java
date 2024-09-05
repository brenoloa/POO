package aula01;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    //atributos


    //metodos/funcao
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor:  " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada:  " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("A caneta está tampada. ERRO!");
        }
        else {
            System.out.println("RABISCANDO.");
        }
    }

    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
