package Final_Project_POO;

import Final_Project_POO.user.User;
import Final_Project_POO.video.Video;

public class Visualizacao {
    private User espectador;
    private Video filme;
    public Visualizacao(User espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(double porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }
        else if (porc <= 50){
            tot = 5;
        }
        else if (porc <= 90){
            tot = 8;
        }
        else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    public User getEspectador() {
        return espectador;
    }
    public void setEspectador(User espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visualizacao{\n");
        sb.append("espectado = ").append(espectador);
        sb.append("\n filme = ").append(filme);
        sb.append("\n}");
        return sb.toString();
    }

    
}
