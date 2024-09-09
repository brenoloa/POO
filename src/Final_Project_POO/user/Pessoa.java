package Final_Project_POO.user;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public void ganharExp(){

    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa {\n");
        sb.append("nome = ").append(nome);
        sb.append("\n idade = ").append(idade);
        sb.append("\n sexo = " ).append(sexo);
        sb.append("\n experiencia = ").append(experiencia);
        sb.append("\n}");
        return sb.toString();
    }

    
}
