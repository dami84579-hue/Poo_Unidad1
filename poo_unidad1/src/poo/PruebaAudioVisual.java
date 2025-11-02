package poo;

import java.util.ArrayList;
import java.util.List;

import uni1a.Actor;
import uni1a.ContenidoAudiovisual;
import uni1a.Cortometraje;
import uni1a.Documental;
import uni1a.Investigador;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Temporada;
import uni1a.VideoYoutube;

public class PruebaAudioVisual {
    
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse - Sistema de Contenido Audiovisual");
        
        // ... (Actores, Temporadas, Investigador permanecen igual) ...
        Actor actor1 = new Actor("Leonardo DiCaprio", 50);
        Actor actor2 = new Actor("Kate Winslet", 49);
        List<Actor> repartoAvatar = new ArrayList<>();
        repartoAvatar.add(actor1);
        repartoAvatar.add(actor2);

        Temporada temp1 = new Temporada(1, 10);
        Temporada temp2 = new Temporada(2, 8);
        List<Temporada> temporadasGoT = new ArrayList<>();
        temporadasGoT.add(temp1);
        temporadasGoT.add(temp2);

        Investigador investigadorCosmos = new Investigador("Neil deGrasse Tyson", "Astrofísica");

        // 2. Crear instancias de los contenidos audiovisuales (incluyendo las nuevas subclases)
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        
        // Pelicula con Agregación de Actor
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studiost", repartoAvatar);
        
        // SerieDeTV con Agregación de Temporada
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", temporadasGoT);
        
        // Documental con Composición de Investigador
        contenidos[2] = new Documental("Cosmos: A Spacetime Odyssey", 45, "Ciencia", "Astronomia", investigadorCosmos);
        
        // Nueva subclase Cortometraje
        contenidos[3] = new Cortometraje("A Trip to the Moon", 14, "Ciencia Ficción", "Georges Méliès Festival", 1902);
        
        // **NUEVA SUBCLASE: VideoYoutube**
        contenidos[4] = new VideoYoutube("Análisis UML de Clases", 25, "Académico", "Desarrollo Software Avanzado", 4500L);

        // 3. Mostrar los detalles de cada contenido audiovisual. (Polimorfismo)
        System.out.println("\n--- Listado de Contenidos ---");
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}