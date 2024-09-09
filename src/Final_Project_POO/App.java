package Final_Project_POO;

import Final_Project_POO.user.User;
import Final_Project_POO.video.Video;

public class App {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Leoes Mapogos");
        v[1] = new Video("Girafas africanas");
        v[2] = new Video("Elefantes Africanos");

        User u[] = new User[2];
        u[0] = new User("BRENO", 20, "M", "brenoloa");
        u[1] = new User("JULIA", 19, "F", "juju123");
        Visualizacao x[] = new Visualizacao[3];
        
        
        x[0] = new Visualizacao(u[0], v[2]);
        x[0].avaliar();
        System.out.println(x[0].toString());
        x[1] = new Visualizacao(u[0], v[1]);
        x[1].avaliar(9);
        System.out.println(x[1].toString());
        
        //System.out.println(v[0].toString());
        //System.out.println(u[0].toString());
        
    }
}
