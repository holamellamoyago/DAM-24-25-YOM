package ud2.yomexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

// Yago Otero Martinez
public class ChiclesRegalo {
    public static void main(String[] args) {

        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(100, 0, 0));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(10, -1, 0));

    }

    private static int totalChicles(int chiclesIniciales, int numEnvoltorios, int chiclesRegalo) {
        int totalRecomepnsa, contadorChicles = 0;

        if (chiclesIniciales < 0 || numEnvoltorios < 0 || chiclesRegalo < 0) {
            return -1;
        } else if (numEnvoltorios == 0) {
            return chiclesIniciales;
        } else if (chiclesRegalo >= numEnvoltorios) {
            return -1;
        }

        do {
            totalRecomepnsa = chiclesIniciales / numEnvoltorios;

            if (contadorChicles == 0) {
                contadorChicles = contadorChicles + totalRecomepnsa + chiclesIniciales;

            } else {
                contadorChicles = contadorChicles + totalRecomepnsa;
            }

            chiclesIniciales = totalRecomepnsa + chiclesIniciales % numEnvoltorios;
        } while (chiclesIniciales >= numEnvoltorios);

        return contadorChicles;

    }

    @Test
    public void ChiclesRegaloTest() {
    assertEquals(31, totalChicles(25, 5, 1));
    assertEquals(6, totalChicles(5, 5, 1));
    assertEquals(111, totalChicles(100, 10, 1));
    assertEquals(-1, totalChicles(20, 2, 5));
    assertEquals(-1, totalChicles(10, -1, 0));
    assertEquals(-1, totalChicles(-1, 2, 1));
    assertEquals(-1, totalChicles(10, 1, -1));
    assertEquals(-1, totalChicles(20, 2, 2));
    assertEquals(10, totalChicles(7, 3, 1));
    assertEquals(40, totalChicles(27, 3, 1));
    assertEquals(21, totalChicles(11, 2, 1));
    assertEquals(31, totalChicles(16, 2, 1));
    assertEquals(100, totalChicles(100, 0, 0));
    assertEquals(100, totalChicles(100, 0, 1));
    assertEquals(0, totalChicles(0, 0, 1));
    assertEquals(0, totalChicles(0, 2, 1));
    }
}
