import mensagem.Mensagem;
import mensagem.MensagemArquivo;
import mensagem.MensagemTexto;
import usuario.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        // criando 3 usuários
        Usuario pedro = new Usuario("Pedro", "pedro@gmail.com");
        Usuario henrique = new Usuario("Henrique", "henrique@gmail.com");
        Usuario joão = new Usuario("joão", "joão@gmail.com");
        // pedro vai publicar uma mensagem de texto
        // henrique vai publicar uma mensagem de arquivo
        Mensagem m1 = new MensagemTexto(pedro, "Estou muito empolgado aprendendo java");
        Mensagem m2 = new MensagemArquivo(henrique, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FJava_%2528programming_language%2529&psig=AOvVaw2RHaq6_U_W6r10bj9210Bv&ust=1677334167567000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCIDlxe-qrv0CFQAAAAAdAAAAABAE");
        
        // imprimindo as msg
        System.out.println(m1);
        System.out.println(" ");
        System.out.println(m2);
        System.out.println(" ");
        
        // henrique e joão vão curtir a mensagem de pedro
        henrique.curtirMensagem(m1);
        joão.curtirMensagem(m1);
        // checar a quantidade de likes
        System.out.println(" ");
        System.out.println(m1.getLikes());
        
        // verificar lista de curtidas na mensagem
        System.out.println(" ");
        System.out.println(m1.getUsuario_likes());

        // henrique vai tentar curtir novamente a mesma mensagem
        henrique.curtirMensagem(m1);
        // feedback impresso que não deu certo
        // verificar que a quantidade de likes não se alterou
        System.out.println(" ");
        System.out.println(m1.getLikes());

        // joão e henrique vão seguir pedro
        // joão vai tentar seguir duas vezes
        joão.seguirUsuario(pedro);
        joão.seguirUsuario(pedro);
        henrique.seguirUsuario(pedro);

        // verificar seguidores pedro qtd e lista
        System.out.println(" ");
        System.out.println(pedro.getSeguidores());
        System.out.println(pedro.getLista_seguidores());






    }
}
