package aula06c;

public class App {
    public static void main(String[] args) {
        Time[] CLUBE = new Time[20];
        CLUBE[0] = new Time("Corinthians", "SCCP");
        CLUBE[1] = new Time("Palmeiras", "PAL");
        CLUBE[2] = new Time("São Paulo", "SPFC");
        CLUBE[3] = new Time("Santos", "SAN");
        CLUBE[4] = new Time("Flamengo", "FLA");
        CLUBE[5] = new Time("Fluminense", "FFC");
        CLUBE[6] = new Time("Botafogo", "BFR");
        CLUBE[7] = new Time("Vasco", "VAS");
        CLUBE[8] = new Time("Cruzeiro", "CRU");
        CLUBE[9] = new Time("Atlético-MG", "CAM");
        CLUBE[10] = new Time("Internacional", "INT");
        CLUBE[11] = new Time("Grêmio", "GRE");
        CLUBE[12] = new Time("Athletico-PR", "CAP");
        CLUBE[13] = new Time("Bahia", "BAH");
        CLUBE[14] = new Time("Cuiabá", "CUI");
        CLUBE[15] = new Time("Fortaleza", "FOR");
        CLUBE[16] = new Time("Goiás", "GOI");
        CLUBE[17] = new Time("Coritiba", "CFC");
        CLUBE[18] = new Time("América-MG", "AMG");
        CLUBE[19] = new Time("Red Bull Bragantino", "BRG");

        int rodadas = 0;

        Riosp MATCH = new Riosp();

        for (int i = 0; i < CLUBE.length; i++) {
            for (int j = i + 1; j < CLUBE.length; j++) {
                // Casa vs Fora
                MATCH.confronto(CLUBE[i], CLUBE[j]);
                MATCH.jogar();
                rodadas++;
                // Fora vs Casa
                MATCH.confronto(CLUBE[j], CLUBE[i]);
                MATCH.jogar();
                rodadas++;
            }
        }

        for (int i = 0; i < CLUBE.length - 1; i++) {
            for (int j = 0; j < CLUBE.length - 1 - i; j++) {
                if (CLUBE[j].getPontos() < CLUBE[j + 1].getPontos()) {
                    Time temp = CLUBE[j];
                    CLUBE[j] = CLUBE[j + 1];
                    CLUBE[j + 1] = temp;
                }
            }
        }

        for (int x = 0; x < CLUBE.length; x++) {
            CLUBE[x].status();
        }

        System.out.println("Tabela Final:");
        for (int i = 0; i < CLUBE.length; i++) {
            System.out.println((i + 1) + "º " + CLUBE[i].getNome() + " - " + CLUBE[i].getPontos() + " pontos");
        }

        System.out.println("Total de Rodadas: " + rodadas);
    }
}
