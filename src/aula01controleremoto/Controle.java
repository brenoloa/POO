package aula01controleremoto;

public class Controle implements Usuario {
    private boolean ligado;
    private int volume;
    private int canal;
    //atributos

    public Controle() {
        this.ligado = false;
        this.volume = 0;
        this.canal = 0;
    }
    
    
    
    public boolean getLigado() {
        return ligado;
    }



    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



    public int getVolume() {
        return volume;
    }



    private void setVolume(int volume) {
        this.volume = volume;
    }



    public int getCanal() {
        return canal;
    }



    private void setCanal(int canal) {
        this.canal = canal;
    }



    public void status(){
        System.out.println("ligado: " + this.ligado);
        System.out.println("Volume : "+ this.volume);
        System.out.println("canal : " + this.canal);
    }



    @Override
    public void ligar() {
        this.setLigado(true);
        this.setCanal(20);
        this.setVolume(50);
    }



    @Override
    public void desligar() {
        this.setLigado(false);
        this.setCanal(0);
        this.setVolume(0);
    }



    @Override
    public void aumentar_volume() {
        this.setVolume(this.getVolume() + 5);
    
    }



    @Override
    public void diminuir_volume() {
        this.setCanal(this.getVolume() - 5);
    
    }



    @Override
    public void aumentar_canal() {
        this.setCanal(this.getCanal() + 1);
    
    }



    @Override
    public void diminuir_canal() {
        this.setCanal(this.getCanal() - 1);
    
    
    }



}

