package BuclesAnidados;

public class E0315 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 4; i++) {
        //         System.out.print(" * ");
        //     for(int  n = 1; n<=3 ; n--){
        //         System.out.print(" * ");
        //     }
        //     System.err.println();
        // }

        // for(int i = 1; i<= 4; i++){
        //     System.out.println("+");
        //         for(int n = 1; n<=4; n++){
        //             System.out.print("*");
        //         }
        // }


        for(int i = 4 ; i>=1; i--){
            System.out.println();
            for(int n = i; n>=1; n--){
                System.out.print("*");
            }
        }
    }
}
