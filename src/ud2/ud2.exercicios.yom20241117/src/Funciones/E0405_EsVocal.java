package Funciones;

public class E0405_EsVocal {

    private static boolean esVocal(char letra){
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u': {
                return true;
            }
        
            default :{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        char caracter = 'c';

        System.out.println("Es vocal?: " + esVocal(caracter));
    }
}
