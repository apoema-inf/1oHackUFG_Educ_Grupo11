package hackathon.ufg.colmeia.Model;

public class FazAi {

    public FazAi(String nomeCriador, String titulo, String descricao) {
        this.nomeCriador = nomeCriador;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public FazAi(String nomeCriador, String titulo, String descricao, int imagem) {
        this.nomeCriador = nomeCriador;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public int getIntImage(){return this.imagem;}

    public String getNomeCriador() {
        return nomeCriador;
    }

    public void setNomeCriador(String nomeCriador) {
        this.nomeCriador = nomeCriador;
    }

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

    public String nomeCriador;
    public String titulo;
    public String descricao;

    public int imagem;

}
