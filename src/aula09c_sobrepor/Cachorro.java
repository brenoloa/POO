package aula09c_sobrepor;

public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("RUF RUF RUF RUF ");
    }
    
    public void reagir(String frase) {
        if ("toma comida".equals(frase) || "ola".equals(frase)){
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
        else{
            System.out.println("Rosnar!");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12){
            System.out.println("Abanar");
        }
        else if (hora >= 18) {
            System.out.println("ignorar");
        }
        else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("abanar");
        }
        else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }

    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar.");
            } 
            else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } 
        else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } 
            else {
                System.out.println("Ignorar");
            }
        }
    }
    
}
