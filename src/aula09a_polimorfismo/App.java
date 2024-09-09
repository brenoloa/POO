package aula09a_polimorfismo;
import aula09a_polimorfismo.animais.ave.Ave;
import aula09a_polimorfismo.animais.mamifero.Cachorro;
import aula09a_polimorfismo.animais.mamifero.Canguru;
import aula09a_polimorfismo.animais.mamifero.Mamifero;
import aula09a_polimorfismo.animais.peixe.Goldfish;
import aula09a_polimorfismo.animais.peixe.Peixe;
import aula09a_polimorfismo.animais.reptil.Reptil;
public class App {
    public static void main(String[] args) {
        

        Goldfish g1 = new Goldfish(5.56, 3, 0, "Azul Claro");
        //Goldfish g1 = new Goldfish();
        Peixe p1 = new Peixe(4.56, 2, 0, "Amarelado");
        
        
        p1.emitirSom();
        g1.emitirSom();
        p1.alimentar();
        g1.alimentar();
        /* 
       System.out.println(m1.getIdade());
       m1.emitirSom();
       m1.locomover();
       System.out.println();
       r1.emitirSom();
       r1.locomover();
       System.out.println();
       p1.emitirSom();
       p1.locomover();
       System.out.println();
       a1.emitirSom();
       a1.locomover();
        * 
       */
        


        







    }

    
}

