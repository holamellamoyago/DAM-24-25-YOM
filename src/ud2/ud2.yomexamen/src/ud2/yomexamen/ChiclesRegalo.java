package ud2.yomexamen;
// Yago Otero Martinez
public class ChiclesRegalo {
    public static void main(String[] args) {
        
        System.out.println(totalChicles(25,5,1));
        System.out.println(totalChicles(5,5,1));
        System.out.println(totalChicles(100,10,1));
        System.out.println(totalChicles(100,0,0));
        System.out.println(totalChicles(20,2,5));
        System.out.println(totalChicles(10,-1,0));

    }
    
    private static int totalChicles(int chiclesIniciales, int numEnvoltorios, int chiclesRegalo){
        int totalRecomepnsa, contadorChicles = 0;

        if (chiclesIniciales <0 || numEnvoltorios <0 || chiclesRegalo <0) {
            return -1;
        } else if(numEnvoltorios == 0){
            return chiclesIniciales;
        } else if(chiclesRegalo > numEnvoltorios){
            return -1;
        }


        do {
            totalRecomepnsa = chiclesIniciales / numEnvoltorios;

            if (contadorChicles == 0) {
                contadorChicles = contadorChicles + totalRecomepnsa + chiclesIniciales;
                
            } else{
                contadorChicles = contadorChicles + totalRecomepnsa;
            }

            chiclesIniciales = totalRecomepnsa;
        } while (chiclesIniciales>= numEnvoltorios);

        return contadorChicles;

    }
}
