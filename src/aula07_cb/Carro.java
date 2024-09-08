package aula07_cb;

public class Carro implements Vendas {
    //atrb
    private String marca;
    private String modelo;
    private int Ano;
    private double quilometragem;
    private int valor;
    private boolean vendido;
    
    
    
    

    //const
    public Carro(String marca, String modelo, int ano, double quilometragem, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = ano;
        this.quilometragem = quilometragem;
        this.valor = valor;
        this.vendido = false;
    }





    public String getMarca() {
        return marca;
    }





    public void setMarca(String marca) {
        this.marca = marca;
    }





    public String getModelo() {
        return modelo;
    }





    public void setModelo(String modelo) {
        this.modelo = modelo;
    }





    public int getAno() {
        return Ano;
    }





    public void setAno(int ano) {
        Ano = ano;
    }





    public double getQuilometragem() {
        return quilometragem;
    }





    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }





    public int getValor() {
        return valor;
    }





    public void setValor(int valor) {
        this.valor = valor;
    }





    public boolean getVendido() {
        return vendido;
    }





    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }





    @Override
    public void negociar_valor(int novo_valor) {
        this.valor = novo_valor;
    }

    @Override
    public void vender() {
        this.setVendido(true);
    
    
    }

    @Override
    public void detalhes() {
        System.out.println(this.getModelo() + " -- " + this.getMarca());
        System.out.println("Ano: " + this.getAno());
        System.out.println(this.getQuilometragem() + "km");
        if (this.getVendido() == false){
            System.out.println("R$" + this.getValor() + " DISPONIVEL.");
        }
        else {
            System.out.println("Veiculo Vendido!");
        }
    }

    
}
