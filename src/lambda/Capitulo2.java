package lambda;

import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.*;

public class Capitulo2 {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuariosList = Arrays.asList(user1, user2,user3);

        for(Usuario u : usuariosList) {
            System.out.println("Nome = " + u.getNome());
        }

    }

}
