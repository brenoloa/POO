package aula04b;

import java.util.Scanner;

public class Funcionarios {
    Scanner scan = new Scanner(System.in);
    private String nome;
    private int idade;
    private float salario;
    private String cargo;
    public Funcionarios(String nome, int idade, float salario, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void adcionar(){
        System.out.println("== CADASTRANDO NOVO FUNCIONARIO ==");      
        System.out.print("Nome: ");
        this.nome = scan.nextLine();
        System.out.print("Cargo: ");
        this.cargo = scan.nextLine();
        System.out.print("Idade: ");
        this.idade = scan.nextInt();
        System.out.print("Salario: ");
        this.salario = scan.nextFloat();
        scan.nextLine();
      
    }

    public void exibir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salario: " + getSalario());
    }
}
