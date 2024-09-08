package aula08b_herança;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagar_mensalidade(){
        System.out.println("Mensalidade de " + this.getNome() +" PAGA COM SUCESSO!.");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


   
    
    
    
}
