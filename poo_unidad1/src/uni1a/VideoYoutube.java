package uni1a;

public class VideoYoutube extends ContenidoAudiovisual {
    private String canal;
    private long visualizaciones; // Usamos long para grandes números

    public VideoYoutube(String titulo, int duracionEnMinutos, String genero, String canal, long visualizaciones) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.visualizaciones = visualizaciones;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Canal: " + canal);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Visualizaciones: " + visualizaciones);
        System.out.println();
    }
}

