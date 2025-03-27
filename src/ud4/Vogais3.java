package ud4;
// package ud4.yomexamenrec;

// import java.util.Arrays;

// public class Vogais {
//     public static void main(String[] args) {
//         String frase = "HolA";
//         char vogal = 'a';

//         System.out.println(cambiaVogais(frase, vogal));
//     }

//     static String cambiaVogais(String str, char vogal) {
//         char[] fraseChar = str.toCharArray();
//         String frase = "";

//         if (Character.isUpperCase(vogal)) {
//             char vogalMinuscula = Character.toLowerCase(vogal);
//             for (int i = 0; i < fraseChar.length; i++) {
//                 if (fraseChar[i] == vogal || fraseChar[i] == vogalMinuscula || fraseChar[i] == 'e'
//                         || fraseChar[i] == 'E' || fraseChar[i] == 'i' || fraseChar[i] == 'I' || fraseChar[i] == 'o'
//                         || fraseChar[i] == 'O' || fraseChar[i] == 'u' || fraseChar[i] == 'U' || fraseChar[i] == 'a' || fraseChar[i] == 'A') {
//                     fraseChar[i] = vogal;
//                 }
//             }
//         } else if (Character.isLowerCase(vogal)) {
//             char vogalMaiuscula = Character.toUpperCase(vogal);
//             for (int i = 0; i < fraseChar.length; i++) {
//                 if (fraseChar[i] == vogal || fraseChar[i] == vogalMaiuscula || fraseChar[i] == 'e'
//                         || fraseChar[i] == 'E' || fraseChar[i] == 'i' || fraseChar[i] == 'I' || fraseChar[i] == 'o'
//                         || fraseChar[i] == 'O' || fraseChar[i] == 'u' || fraseChar[i] == 'U'|| fraseChar[i] == 'a' || fraseChar[i] == 'A') {
//                     fraseChar[i] = vogal;
//                 }
//             }
//         }

//         for (int i = 0; i < fraseChar.length; i++) {
//             frase += fraseChar[i];
//         }

//         return frase;


//     }

// }
