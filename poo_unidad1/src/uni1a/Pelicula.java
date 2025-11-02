package uni1a;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> reparto; // Agregación

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, List<Actor> reparto) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.reparto = reparto;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Estudio: " + estudio);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Reparto:");
        for (Actor a : reparto) {
            a.mostrarInfo();
        }
        System.out.println();
    }
}

