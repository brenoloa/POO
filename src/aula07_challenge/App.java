package aula07_challenge;

public class App {
    public static void main(String[] args) {
        Pessoa[] P = new Pessoa[2];
        Livro[] L = new Livro[3];
    
    
        P[0] = new Pessoa("Breno", 21, "M");
        P[1] = new Pessoa("Amora", 24, "F");

        L[0] = new Livro("Harry potter da shoppe", "Getulio Vargas", 356, P[0]);

        L[1] = new Livro("Cronicas do Mistério", "Jack Sparrow", 450, P[1]);

        L[2] = new Livro("Arca de Noé", "Nóe o propio", 204, P[1]);


        L[1].abrir();
        L[1].folhear(324);

        L[2].abrir();
        L[2].avancar_page();
        L[2].avancar_page();

        System.out.println(L[0].detalhes());
        System.out.println(L[1].detalhes());
        System.out.println(L[2].detalhes());
    }
}
