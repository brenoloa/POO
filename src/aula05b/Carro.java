package aula05b;

public class Carro implements Motorista{
    private String marca;
    private String placa;
    private boolean ligado;
    private float gasolina;
    private boolean farol;
    public Carro(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
        this.ligado = false;
        this.gasolina = 30;
        this.farol = false;
    }
    
    
    public boolean getFarol_Ligado(){
        return farol;
    }
    public void setFarol(boolean farol){
        this.farol = farol;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public float getGasolina() {
        return gasolina;
    }
    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }
    @Override
    public void ligar_carro() {
        this.setLigado(true);
        this.setFarol(true);
    }
    @Override
    public void desligar_carro() {
        this.setLigado(false);
        this.setFarol(false);
    }
    @Override
    public void ligar_farol() {
        this.setFarol(true);
    
    }
    @Override
    public void desligar_farol() {
        this.setFarol(false);
    
    }
    @Override
    public void abastecer(float gasolina) {
        if (getLigado() == false){
            System.out.println("Abasteceu " + gasolina + " Litros com sucesso!");
            setGasolina(getGasolina() + gasolina);
        }
        else {
            System.out.println("Desligue o veiculo para abastecer.");
        }
    }

    public void status(){
        System.out.println("=========");
        System.out.println("Carro marca: " + getMarca());
        System.out.println("Placa : " + getPlaca());
        System.out.println("Motor : " + getLigado());
        System.out.println("Faróis: " + getFarol_Ligado());
        System.out.println("Gasolina: " + getGasolina() + " Litros.");
    }


    


    

    
    
    

    

}
