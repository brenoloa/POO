package aula08b_herança;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovar_bolsa(){

    
    }
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public void pagar_mensalidade(){
        System.out.println("Bolsa de 100% Mensalidade de: " + this.getNome() + " GRATUITO!");
    }

}
