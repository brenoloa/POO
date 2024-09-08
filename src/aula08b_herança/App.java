package aula08b_herança;

public class App {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();

        v1.setNome("Carlos");
        v1.setIdade(22);
        v1.setSexo("M");
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();

        a1.setNome("Breno");
        a1.setIdade(21);
        a1.setCurso("ADS");
        a1.setMatricula(01460017);
        a1.setSexo("M");
        a1.pagar_mensalidade();
        //System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("JORGE");
        b1.setIdade(18);
        b1.setCurso("ADS");
        b1.setMatricula(01560334);
        b1.setSexo("M");
        b1.pagar_mensalidade();
        //System.out.println(b1.toString());
    
        Professor p1 = new Professor();
        p1.setNome("José Alfredo!");
        p1.setSalario(2000);
        p1.setEspecialidade("Orientador de TCC");
        p1.receber_aumento();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Gabriel");
        t1.setCurso("ADS");
        t1.setMatricula(3453421);
        t1.setIdade(23);
        
        
        System.out.println("salario prof aumento " + p1.getSalario());
    }
}
