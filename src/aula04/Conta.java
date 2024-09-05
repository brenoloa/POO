package aula04;

public class Conta {
    public int num_conta;
    protected String tipo_conta;
    private String dono_conta;
    private float saldo_conta;
    private Boolean status_conta; //aberta fechada
    
    
    public Conta(int num_conta, String tipo_conta, String dono_conta) {
        this.num_conta = num_conta;
        this.tipo_conta = tipo_conta;
        this.dono_conta = dono_conta;
        this.status_conta = false;
        if (tipo_conta == "CC"){
            setSaldo_conta(50);
        }
        else {
            setSaldo_conta(150); 
        }
    }
    public int getNum_conta() {
        return num_conta;
    }
    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }
    public String getTipo_conta() {
        return tipo_conta;
    }
    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }
    public String getDono_conta() {
        return dono_conta;
    }
    public void setDono_conta(String dono_conta) {
        this.dono_conta = dono_conta;
    }
    public float getSaldo_conta() {
        return saldo_conta;
    }
    public void setSaldo_conta(float saldo_conta) {
        this.saldo_conta = saldo_conta;
    }
    public Boolean getStatus_conta() {
        return status_conta;
    }
    public void setStatus_conta(Boolean status_conta) {
        this.status_conta = status_conta;
    }

    public void abrir_conta(){
        setStatus_conta(true);
    }
    public void fechar_conta(){
        if (this.saldo_conta > 0){
                System.out.println("Conta tem saldo.");
        }
        else if (getSaldo_conta() == 0){
            setStatus_conta(false);
        }
        else {
            System.out.println("não é possivel fechar conta com pendencia.");
        }
    }
    public void pagar_mensalidade(){
        if (getStatus_conta() == true){
            if (getTipo_conta() == "CC"){
                this.saldo_conta -= 12;
            }
            else {
                this.saldo_conta -= 20;
            }
        }
        else {
            System.out.println("ERRO AO PAGAR MENSALIDADE.");
        }
    
    }
    public void depositar(float x){
        if (getStatus_conta() == true){
            setSaldo_conta(getSaldo_conta() + x);

        }
        else {
            System.out.println("Não é possivel depositar em conta fechada.");
        }
    }
    
    public void sacar(float x){
        if (getStatus_conta() == true){
            if (x <= getSaldo_conta()){
                setSaldo_conta(getSaldo_conta() - x);
            }
            else {
                System.out.println("SAQUE INVALIDO.");
            }
        }
        else {
            System.out.println("conta fechada.");
        }
    }



    public void status(){
        System.out.println(getDono_conta());
        System.out.println(getTipo_conta());
        System.out.println(getNum_conta());
        System.out.println("R$ " + getSaldo_conta());
        if (getStatus_conta() == true){
            System.out.println("Conta Aberta.");
        }
        else {
            System.out.println("Conta Fechada.");
        }
    }
}
