package aula09a_polimorfismo;
import aula09a_polimorfismo.animais.ave.Ave;
import aula09a_polimorfismo.animais.mamifero.Cachorro;
import aula09a_polimorfismo.animais.mamifero.Canguru;
import aula09a_polimorfismo.animais.mamifero.Mamifero;
import aula09a_polimorfismo.animais.peixe.Peixe;
import aula09a_polimorfismo.animais.reptil.Reptil;
public class App {
    public static void main(String[] args) {
        
        Peixe p1 = new Peixe();
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Ave a1 = new Ave();
        Canguru can1 = new Canguru();
        Cachorro c1 = new Cachorro();
        m1.setIdade(21);
       
        m1.alimentar();
        r1.alimentar();
        p1.alimentar();
        a1.alimentar();
        System.out.println();
        c1.locomover();
        m1.locomover();
        can1.locomover();
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

