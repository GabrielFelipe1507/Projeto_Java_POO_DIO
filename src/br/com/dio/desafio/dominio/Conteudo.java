package br.com.dio.desafio.dominio;

///aqui nesta classe abstrata eu estou dizendo que eu não consigo instanciar o conteudo:
public abstract class Conteudo {

    public static final double XP_PADRAO =10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    //getters e setters:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
