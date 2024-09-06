package aula01d;

public class Carro implements Motorista{
    private String marca;
    private String placa;
    private boolean motor_ligado;
    private boolean farol_ligado;

    ///////////////////////////

    public Carro(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
        this.motor_ligado = false;
        this.farol_ligado = true;
    }
    


    public void status(){
        System.out.println("MARCA : " + this.getMarca());
        System.out.println("PLACA : " + this.getPlaca());
        System.out.println("MOTOR : " + this.getMotor_ligado());
        System.out.println("FAROL : " + this.getFarol_ligado());
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

    public boolean getMotor_ligado() {
        return motor_ligado;
    }

    public void setMotor_ligado(boolean motor_ligado) {
        this.motor_ligado = motor_ligado;
    }

    public boolean getFarol_ligado() {
        return farol_ligado;
    }

    public void setFarol_ligado(boolean farol_ligado) {
        this.farol_ligado = farol_ligado;
    }



    @Override
    public void desligar_carro() {
        // TODO Auto-generated method stub
        this.setMotor_ligado(false);
        
    }



    @Override
    public void desligar_farol() {
        // TODO Auto-generated method stub
        this.setFarol_ligado(false);
    }



    @Override
    public void ligar_carro() {
        // TODO Auto-generated method stub
        this.setMotor_ligado(true);
    }



    @Override
    public void ligar_farol() {
        // TODO Auto-generated method stub
        this.setFarol_ligado(true);
    }



    @Override
    public void fodase() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fodase'");
    }

   
}
