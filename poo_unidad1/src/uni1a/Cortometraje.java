package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String festival;
    private int anioEstreno;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String festival, int anioEstreno) {
        super(titulo, duracionEnMinutos, genero);
        this.festival = festival;
        this.anioEstreno = anioEstreno;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Presentado en: " + festival + ", Año: " + anioEstreno);
        System.out.println();
    }
}
