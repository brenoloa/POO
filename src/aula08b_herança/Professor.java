package aula08b_herança;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;


    public void receber_aumento(){
        this.salario = (this.salario * 1.09);
    }


    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
