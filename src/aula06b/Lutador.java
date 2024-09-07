package aula06b;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int Idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    //CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.Idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    // SETTERS | GETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        if (this.getPeso() < 52.2){
            this.setCategoria("Invalido");
        }
        else if (this.getPeso() <= 70.3){
            this.setCategoria("Leve");
        }
        else if (this.getPeso() <= 83.9){
            this.setCategoria("Medio");
        }
        else if (this.getPeso() <= 120.2){
            this.setCategoria("Pesado");
        }
        else {
            this.setCategoria("Invalido");
        }
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //metodos
    public void apresentar(){
        System.out.println("===============");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "_anos");
        System.out.println(this.getAltura() + "_m de altura");
        System.out.println("Pesando: " + this.getPeso() + "_kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void status(){
        System.out.println("======");
        System.out.println(this.getNome());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());
    }
    public void ganhar_luta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perder_luta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatar_luta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public String toString() {
        return this.getNome();
    }
}
