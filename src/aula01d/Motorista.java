package aula01d;

public interface Motorista {
    
    public abstract void ligar_carro();
    public abstract void desligar_carro();
    public abstract void ligar_farol();
    public abstract void desligar_farol();

    public abstract void fodase(){
        System.out.println("hess.");
    }
}
