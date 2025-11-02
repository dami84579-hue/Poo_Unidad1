package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int numEpisodios;

    public Temporada(int numeroTemporada, int numEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.numEpisodios = numEpisodios;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void mostrarInfo() {
        System.out.println("-> Temporada #" + numeroTemporada + ", Episodios: " + numEpisodios);
    }
}
