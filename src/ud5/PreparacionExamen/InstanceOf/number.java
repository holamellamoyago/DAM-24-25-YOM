package ud5.PreparacionExamen.InstanceOf;

public class number {
    public static void main(String[] args) {
        Object[] t = {
            1,2.4,3, "Hola"
        };

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].getClass().getSimpleName());
            
        }
    }
}
