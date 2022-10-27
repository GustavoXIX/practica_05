package ListSimple;

public class Pelicula {

    private int imgFoto;
    private String titulo;
    private String ano;
    private String banda;

    public Pelicula(int imgFoto, String titulo, String ano, String banda) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.ano = ano;
        this.banda = banda;

    }



    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAno() {
        return ano;
    }

    public String getBanda() {
        return banda;
    }

}
