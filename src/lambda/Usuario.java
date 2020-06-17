package lambda;

public class Usuario {

private String nome;
private int pontos;
private boolean moderador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = false ;
    }

    public void tornarModerador() {
        this.moderador = true ;
    }

    public boolean  isModerador() {
        return moderador;
    }

}
