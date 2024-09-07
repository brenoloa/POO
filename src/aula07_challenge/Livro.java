package aula07_challenge;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int total_page;
    private int atual_page;
    private boolean aberto;
    private Pessoa leitor;


    



    public String detalhes() {
        return "Livro = " + titulo + ",\n autor= " + autor + ",\n total_page= " + total_page + ",\n atual_page="
                + atual_page + ",\n aberto= " + aberto + ",\n leitor= " + leitor.getNome() + ",\n idade do leitor= " + leitor.getIdade() +" \n \n";
    }

    //construtor
    public Livro(String titulo, String autor, int total_page, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.total_page = total_page;
        this.leitor = leitor;
        this.atual_page = 0;
        this.aberto = false;
    }

    //getters|setters
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getTotal_page() {
        return total_page;
    }


    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }


    public int getAtual_page() {
        return atual_page;
    }


    public void setAtual_page(int atual_page) {
        this.atual_page = atual_page;
    }


    public boolean getAberto() {
        return aberto;
    }


    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    public Pessoa getLeitor() {
        return leitor;
    }


    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    
    }

    @Override
    public void fechar() {
        this.aberto = false;
    
    }

    @Override
    public void folhear(int page) {
        if (page > this.total_page){
            this.atual_page = 0;
        }
        else {
            this.atual_page = page;
        }
    
    }

    @Override
    public void avancar_page() {
        this.atual_page++;
    
    }

    @Override
    public void voltar_page() {
        this.atual_page--;
    
    }

   
    
}
