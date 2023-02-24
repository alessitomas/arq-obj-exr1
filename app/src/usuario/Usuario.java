package usuario;

import mensagem.Mensagem;
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private List<Usuario> lista_seguidores;
    private Integer seguidores;


    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.lista_seguidores = new ArrayList<Usuario>();
        this.seguidores = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Usuario> getLista_seguidores() {
        return lista_seguidores;
    }

    public void setLista_seguidores(List<Usuario> lista_seguidores) {
        this.lista_seguidores = lista_seguidores;
    }

    public Integer getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Integer seguidores) {
        this.seguidores = seguidores;
    }

    public void curtirMensagem(Mensagem mensagem){
        if(mensagem.getUsuario_likes().contains(this)){
            System.out.println("Mensagem já curtida");
        }else{
            mensagem.setLikes(mensagem.getLikes()+1);
            boolean adicionou = mensagem.getUsuario_likes().add(this);
            if(adicionou){
                mensagem.setUsuario_likes(mensagem.getUsuario_likes());
            }
        }
    }

    public void seguirUsuario(Usuario usuario){
        if(usuario.getLista_seguidores().contains(this)){
            System.out.println("Você já segue esse usuário");
        }else{
            usuario.setSeguidores(usuario.getSeguidores()+1);
            boolean adicionou = usuario.getLista_seguidores().add(this);
            if(adicionou){
                usuario.setLista_seguidores(usuario.getLista_seguidores());
            }
        }
    }

}
