package ud6.ApuntesGenericos.Ejercicios;

import java.util.Scanner;

import ud6.ApuntesGenericos.ContenedorLista;

public class E1203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nIntroducido = 0;

        ContenedorLista<Integer> lista = new ContenedorLista<Integer>(new Integer[0]);
        Pila<Integer> pila = lista;

        do {
            System.out.println("Introduce número");
            nIntroducido = sc.nextInt();

            if (nIntroducido < 0 && nIntroducido != -1) {
                System.out.println("Num pos");
                nIntroducido = sc.nextInt();
            }

            pila.apilar(nIntroducido);

        } while (nIntroducido != -1);

        for (Integer u : lista.objetos) {
            System.out.println(pila.desapilar());
        }

        for (int i = 0; i < lista.objetos.length; i++) {
            
        }
    }
}
