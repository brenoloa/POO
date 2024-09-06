package aula01c;

public class Carro implements Motorista{
    private String marca;
    protected String placa;
    private boolean ligado;
    
    
    
    
    public Carro(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
        this.ligado = false;
    
    }
    public String getMarca() {
        return marca;
    }
    public String getPlaca() {
        return placa;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void status(){
        System.out.println(this.getMarca());
        System.out.println(this.getPlaca());
        System.out.println(this.getLigado());
    }
    @Override
    public void ligar() {
       setLigado(true);
    }
    @Override
    public void desligar() {
        setLigado(false);
    }
    
}
