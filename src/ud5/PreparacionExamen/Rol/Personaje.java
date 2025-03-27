// package ud5.PreparacionExamen.Rol;

// import java.util.Random;

// import org.junit.platform.console.shadow.picocli.CommandLine.IFactory;

// public class Personaje {
//     public enum Raza {
//         HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
//     }

//     String nombre;
//     double fuerza, agilidad, constitucion;
//     int nivel, experiencia, puntosVida;
//     Raza raza;
//     int puntosVidaTotales;

//     public Personaje(String nombre, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, Raza raza) {
//         this.nombre = nombre;
//         this.fuerza = fuerza;
//         this.agilidad = agilidad;
//         this.constitucion = constitucion;
//         this.nivel = nivel;
//         this.experiencia = experiencia;
//         this.puntosVida = constitucion + 50;
//         this.puntosVidaTotales = this.puntosVida;

//         if (this.fuerza < 0 || this.agilidad < 0 || this.constitucion < 0) {
//             throw new ArithmeticException("Error en los valores de los atributos");
//         }
//     }

//     public Personaje(String nombre, int fuerza, int agilidad, int constitucion, Raza raza) {
//         this(nombre, fuerza, agilidad, constitucion, 1, 0, raza);
//     }

//     public Personaje(String nombre, Raza raza) {
//         Random rdm = new Random();
//         int constitucion = rdm.nextInt(1, 101);
//         this(nombre, rdm.nextInt(1, 101), rdm.nextInt(1, 101), constitucion, 1, 0, raza);
//     }

//     public Personaje(String nombre) {
//         Random rdm = new Random();
//         int constitucion = rdm.nextInt(1, 101);
//         this(nombre, rdm.nextInt(1, 101), rdm.nextInt(1, 101), constitucion, 1, 0, Raza.HUMANO);
//     }

//     public void mostrar() {
//         System.out.println("Personaje [nombre=" + nombre + ", fuerza=" + fuerza + ", agilidad=" + agilidad
//                 + ", constitucion="
//                 + constitucion + ", nivel=" + nivel + ", experiencia=" + experiencia + ", puntosVida=" + puntosVida
//                 + ", raza=" + raza + "]");
//     }

//     @Override
//     public String toString() {
//         return nombre + " (" + puntosVida + "/" + puntosVidaTotales + ")";
//     }

//     byte sumarExperiencia(int puntos) {
//         this.experiencia += puntos;
//         byte contadorNiveles = 0;

//         while (this.experiencia > 999) {
//             subirNivel();
//             contadorNiveles++;
//         }

//         System.out.println(nombre + " subió hasta el nivel " + this.nivel);

//         return contadorNiveles;

//     }

//     void subirNivel() {
//         this.nivel += 1;
//         this.experiencia -= 1000;

//         agilidad = agilidad + (agilidad*0.05);
//         fuerza = fuerza + (fuerza*0.05);
//         constitucion = constitucion + (constitucion*0.05);

//     }

//     void curar() {
//         if (this.puntosVida < puntosVidaTotales) {
//             this.puntosVida = puntosVidaTotales;
//         } else {
//             System.out.println("No se curó, ya va por encima");
//         }
//     }

//     boolean perderVida(int puntos) {
//         this.puntosVida -= puntos;

//         if (this.puntosVida <= 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     boolean estaVivo() {
//         if (puntosVida > 0) {
//             return true;
//         }
//         return false;
//     }

//     int atacar(Personaje enemigo) {
//         Random rdm = new Random();

        
//         double puntuacionAtaque = rdm.nextInt(1, 101) + fuerza;
//         double puntiacionDefensa = rdm.nextInt(1,101) + agilidad;

//         System.out.println(puntuacionAtaque);
//         System.out.println(puntiacionDefensa);

//         double diferencia = puntuacionAtaque - puntiacionDefensa;
//         System.out.println((int)diferencia);

//         if (diferencia > 0) {
//             enemigo.perderVida((int) diferencia);
//         }

//         sumarExperiencia(Math.abs((int)diferencia));
//         enemigo.sumarExperiencia(Math.abs((int) diferencia));

//         return (int)diferencia;
//     }

//     public static void main(String[] args) {
//         Personaje p = new Personaje("Orco malo", 10, 2, 4, 9, 10, Raza.ORCO);
//         Personaje p2 = new Personaje("Oscar");

//         // p2.mostrar();
//         p2.sumarExperiencia(1000);
//         // p2.mostrar();

//         System.out.println(p2.toString());

//         p2.atacar(p2);

//     }

// }
