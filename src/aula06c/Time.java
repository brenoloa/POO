package aula06c;

public class Time {
    // ATRIBUTOS
    private String nome;
    private String sigla;
    private float patrimonio;
    private int vitoria;
    private int derrota;
    private int empate;
    private int pontos;

    
    
    //construtor
    public Time(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.vitoria = 0;
        this.derrota = 0;
        this.empate = 0;
        this.patrimonio = 0f;
        this.pontos = 0;
    }

    
    
    // getters | setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public float getPatrimonio() {
        return patrimonio;
    }

    private void setPatrimonio(float patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    //
    public void vitoria(){
        this.setVitoria(this.getVitoria() + 1);
        this.setPatrimonio(this.getPatrimonio() + 100000);
        this.setPontos(this.getPontos() + 3);
    }

    public void derrota(){
        this.setDerrota(this.getDerrota() + 1);
        this.setPatrimonio(this.getPatrimonio() + 15500);
        this.setPontos(this.getPontos() + 1);
    }

    public void empate(){
        this.setEmpate(this.getEmpate() + 1);
        this.setPatrimonio(this.getPatrimonio() + 50000);
    }

    public void status(){
        System.out.println("=====================================");
        System.out.println(this.getNome() + "["+ this.getSigla() +"]");
        System.out.println("Vitorias: " + this.getVitoria());
        System.out.println("Empates: " + this.getEmpate());
        System.out.println(("Derrotas: " + this.getDerrota()));
        System.out.println();
        System.out.println("PATRIMONIO:  $" + this.getPatrimonio());
        System.out.println("=====================================");
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}

