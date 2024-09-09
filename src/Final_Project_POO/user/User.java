package Final_Project_POO.user;

public class User extends Pessoa{
    private String login;
    private int TotAssistido;

    public void viuMaisUm(){
        this.TotAssistido++;
    }

   

    public User(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.TotAssistido = 0;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return TotAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        TotAssistido = totAssistido;
    }



    @Override
    public String toString() {
        return "User [\nnome = " + nome + "\n login = " + login + "\n TotAssistido = " + TotAssistido + "\n idade = " + idade
                + "\n sexo = " + sexo + "\n experiencia = " + experiencia + "\n]";
    }
    
}
