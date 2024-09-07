package aula06b;


import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;





    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            this.desafiante = null;
            this.desafiado = null;
            this.setAprovada(false);
            System.out.println("A luta não pode acontecer.");    

        }
    }
    public void lutar(){
        if (this.getAprovada() == true){
            this.desafiado.apresentar();
            System.out.println("===");
            this.desafiante.apresentar();
            // vencedor aleatorio(0-2)
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(12);

            switch (vencedor) {
                case 0:{
                    System.out.println("empatou!!!!!!!!!!!!!!!!!!!");
                    this.desafiado.empatar_luta();
                    this.desafiante.empatar_luta();
                    break;
                }
                case 1:{
                    System.out.println("VITORIA DE: " + this.desafiado);
                    this.desafiado.ganhar_luta();
                    this.desafiante.perder_luta();
                    break;
                }
                case 2:{
                    System.out.println("VITORIA DE: " + this.desafiante);
                    this.desafiado.perder_luta();
                    this.desafiante.ganhar_luta();
                    break;
                }
                case 3:{
                    System.out.println("empatou!!!!!!!!!!!!!!!!!!!");
                    this.desafiado.empatar_luta();
                    this.desafiante.empatar_luta();
                    break;
                }
                case 4:{
                    System.out.println("VITORIA DE: " + this.desafiado);
                    this.desafiado.ganhar_luta();
                    this.desafiante.perder_luta();
                    break;
                }
                case 5:{
                    System.out.println("VITORIA DE: " + this.desafiante);
                    this.desafiado.perder_luta();
                    this.desafiante.ganhar_luta();
                    break;
                }
                case 6:{
                    System.out.println("empatou!!!!!!!!!!!!!!!!!!!");
                    this.desafiado.empatar_luta();
                    this.desafiante.empatar_luta();
                    break;
                }
                case 7:{
                    System.out.println("VITORIA DE: " + this.desafiado);
                    this.desafiado.ganhar_luta();
                    this.desafiante.perder_luta();
                    break;
                }
                case 8:{
                    System.out.println("VITORIA DE: " + this.desafiante);
                    this.desafiado.perder_luta();
                    this.desafiante.ganhar_luta();
                    break;
                }
                case 9:{
                    System.out.println("empatou!!!!!!!!!!!!!!!!!!!");
                    this.desafiado.empatar_luta();
                    this.desafiante.empatar_luta();
                    break;
                }
                case 10:{
                    System.out.println("VITORIA DE: " + this.desafiado);
                    this.desafiado.ganhar_luta();
                    this.desafiante.perder_luta();
                    break;
                }
                case 11:{
                    System.out.println("VITORIA DE: " + this.desafiante);
                    this.desafiado.perder_luta();
                    this.desafiante.ganhar_luta();
                    break;
                }
              
                
            }
        }
    }


    // getters|setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
