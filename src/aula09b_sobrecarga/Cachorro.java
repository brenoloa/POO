package aula09b_sobrecarga;

public class Cachorro {
    






    //polimorfismo de sobrecarga.
    // SOBRECARREGANDO UM METODO 
    public void reagir(String frase){
        if (frase == "comida"){
            System.out.println("ABANAR RABO E LATIR :)");
        }
        else {
            System.out.println("ROSNAR ~~ ~~~~ ~~~~ ");
        }
    }
    public void reagir(int hora){
        if (hora < 12 ){
            System.out.println("ABANAR");
        }
        else if (hora >= 18){
            System.out.println("Ignorar.");
        }
        else {
            System.out.println("abanar rabo e latir :S55");
        }
    }
    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("abanar rabo");
        }
        else {
            System.out.println("Rosnar e latir.");
        }
        
    }
    public void reagir(int idade, double peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("abanar");

            }
            else {
                System.out.println("latir");
            }
        }
        else if (idade > 5){
            if (peso < 10){
                System.out.println("rosnar");

            }
            else {
                System.out.println("ignorar");
            }
        }    
    }
}
