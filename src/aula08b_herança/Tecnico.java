package aula08b_herança;

public class Tecnico extends Aluno{
    private int registro_profissional;


    public void praticar(){
        System.out.println(this.getNome() + " praticando.......");
    }


    public int getRegistro_profissional() {
        return registro_profissional;
    }


    public void setRegistro_profissional(int registro_profissional) {
        this.registro_profissional = registro_profissional;
    }

    
}
