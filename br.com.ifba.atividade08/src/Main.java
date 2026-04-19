import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> permissoesAdmin = new ArrayList<>();
        permissoesAdmin.add("CRIAR_USUARIO");
        permissoesAdmin.add("EDITAR_USUARIO");
        permissoesAdmin.add("EXCLUIR_USUARIO");

        PerfilUsuario perfilAdmin = new PerfilUsuario(
                1L,
                "Administrador",
                permissoesAdmin
        );

        Usuario usuario1 = new Usuario(
                1L,
                perfilAdmin,
                "Inacio Dourado",
                "inaciodourado@gmail.com",
                "123456",
                true
        );

        System.out.println(perfilAdmin);
        System.out.println(usuario1);

        usuario1.logar("123456");

        Sessao sessao1 = usuario1.criarSessao();
        System.out.println(sessao1);
    }
}