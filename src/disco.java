public class disco {
    private String tituo;
    private String artista;
    private int numtemas;
    private double duracion;

    public disco(String tituo, String artista, int numtemas, double duracion) {
        this.tituo = tituo;
        this.artista = artista;
        this.numtemas = numtemas;
        this.duracion = duracion;
    }

    public String getTituo() {
        return tituo;
    }

    public String getArtista() {
        return artista;
    }

    public int getNumtemas() {
        return numtemas;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setTituo(String tituo) {
        this.tituo = tituo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setNumtemas(int numtemas) {
        this.numtemas = numtemas;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }


}
