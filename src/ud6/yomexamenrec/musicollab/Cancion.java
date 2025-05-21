package ud6.yomexamenrec.musicollab;

import java.util.*;

// Yago Otero Martínez

public class Cancion implements Comparable<Cancion> {

        private String nombre, autor, estiloMusical;
        protected List<String> instrumentosRequeridos;

        public Cancion(String nombre, String autor, String estiloMusical, List<String> instrumentosRequeridos) {
                this.nombre = nombre;
                this.autor = autor;
                this.estiloMusical = estiloMusical;
                this.instrumentosRequeridos = instrumentosRequeridos;
        }

        static List<String> instrumentosDistintos(Collection<Cancion> c) {
                Set<String> instrumentosNoRepetidos = new TreeSet<>();

                for (Cancion e : c) {
                        instrumentosNoRepetidos.addAll(e.instrumentosRequeridos);
                }

                List<String> l = new ArrayList<>();
                l.addAll(instrumentosNoRepetidos);

                return l;
        }

        public String getNombre() {
                return nombre;
        }

        public static void main(String[] args) {
                // Canciones de ejemplo
                List<Cancion> canciones = Arrays.asList(
                                new Cancion("Bohemian Rhapsody", "Queen", "Rock",
                                                List.of("voz", "piano", "guitarra", "batería")),
                                new Cancion("Billie Jean", "Michael Jackson", "Pop",
                                                List.of("voz", "bajo", "batería")),
                                new Cancion("Imagine", "John Lennon", "Balada",
                                                List.of("voz", "piano")),
                                new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge",
                                                List.of("voz", "guitarra", "bajo", "batería")),
                                new Cancion("Yesterday", "The Beatles", "Pop",
                                                List.of("voz", "guitarra")),
                                new Cancion("Sweet Child O'Mine", "Guns N' Roses", "Rock",
                                                List.of("voz", "guitarra", "bajo", "batería")),
                                new Cancion("Rolling in the Deep", "Adele", "Pop",
                                                List.of("voz", "piano", "batería")),
                                new Cancion("Hotel California", "Eagles", "Rock",
                                                List.of("voz", "guitarra", "bajo", "batería")));

                // Ordenar canciones por nombre
                Collections.sort(canciones);
                System.out.println("\nCanciones ordenadas por nombre:");
                System.out.println("===============================\n");
                canciones.forEach(System.out::println);

                // Ordenar canciones alfabéticamente por estilo musical, luego por autor y luego
                // por nombre
                System.out.println("\nCanciones ordenadas por estilo musical, luego por autor y luego por nombre:");
                System.out.println("===========================================================================\n");

                Comparator<Cancion> c = new Comparator<Cancion>() {

                        @Override
                        public int compare(Cancion o1, Cancion o2) {
                                int res;

                                res = o1.estiloMusical.compareTo(o2.estiloMusical);

                                if (res == 0) {
                                        res = o1.autor.compareTo(o2.autor);
                                }

                                if (res == 0) {
                                        res = o1.nombre.compareTo(o2.nombre);
                                }

                                return res;
                        }

                };

                canciones.sort(c);

                canciones.forEach(System.out::println);

                // Obtener lista de instrumentos distintos
                System.out.println("\nLista de instrumentos distintos:");
                System.out.println("================================\n");
                System.out.println(instrumentosDistintos(canciones));

                System.out.println("\n");
        }

        @Override
        public int compareTo(Cancion o) {
                return nombre.compareTo(o.nombre);
        }

        @Override
        public String toString() {
                return "[" + nombre + "]" + " (" + autor + ") - " + estiloMusical + " | Instrumentos: " + instrumentosRequeridos;
        }

}
