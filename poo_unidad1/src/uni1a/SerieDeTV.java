package uni1a;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas; // Agregación

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, List<Temporada> temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos (por episodio): " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Total de Temporadas: " + temporadas.size());
        System.out.println("Estructura:");
        for (Temporada t : temporadas) {
            t.mostrarInfo();
        }
        System.out.println();
    }
}
