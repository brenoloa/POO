package aula08a_herança;

public class App {
    public static void main(String[] args) {
        System.out.println("hello.");
        Pessoa p1 = new Pessoa();

        Aluno p2 = new Aluno();

        Professor p3 = new Professor();

        Funcionario p4 = new Funcionario();

        p1.setNome("pedro");
        p2.setNome("Jose");
        p3.setNome("Amarildo");
        p4.setNome("wow!!!");

        System.out.println(p2.getNome());
    }
}
