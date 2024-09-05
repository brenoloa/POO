package aula04;

public class main {
    public static void main(String[] args) {
        Conta abc = new Conta(2034, "CC", "BRENAO");
       
        abc.abrir_conta();
        
        abc.depositar(100);
        abc.sacar(130);
        
        abc.fechar_conta();
        abc.status();
    
    }
}
