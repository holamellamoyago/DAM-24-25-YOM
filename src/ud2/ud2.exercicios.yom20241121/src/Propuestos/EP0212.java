package Propuestos;

public class EP0212 {
    public static void main(String[] args) {
        final int DNI = 39511342;
        
        int numLetra = DNI % 23;
        char letra;

        switch (numLetra) {
            case 0-> letra = 'T';
            case 1-> letra = 'T';
            case 2-> letra = 'T';
            case 3-> letra = 'T';
            case 4-> letra = 'T';
            case 5-> letra = 'T';
            case 6-> letra = 'T';
            case 7-> letra = 'T';
            case 8-> letra = 'T';
            case 9-> letra = 'T';
            case 10-> letra = 'X';
            case 11-> letra = 'T';
            case 12-> letra = 'T';
            case 13-> letra = 'T';
            case 14-> letra = 'T';
            case 15-> letra = 'T';
            case 16-> letra = 'T';
            case 17-> letra = 'T';
            case 18-> letra = 'T';
            case 19-> letra = 'T';
            case 20-> letra = 'T';
            case 21-> letra = 'T';
            case 22-> letra = 'T';
            default -> letra = 'z';
        }

        System.out.println("DNI : " + DNI + letra);
    }
}
