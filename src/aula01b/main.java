package aula01b;

public class main {
    public static void main(String[] args) {
        Cachorro x = new Cachorro();
        Cachorro y = new Cachorro();
        x.nome = "Breno";
        x.idade = 8;
        x.raça = "Shit-zu";
        
        y.nome = "LARA";
        y.idade = 14;
        y.raça = "Labrador";
        
        
        x.status();
        y.status();
        //x.chamar();
    }
}
