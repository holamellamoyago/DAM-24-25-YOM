package ud6.StackYqueque;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Stack01 {

    // STACK LIFO (LAST IN , LAST OUT)

    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        List<Integer> l = new ArrayList<>();


        // Añadimos un elemento arriba de la pila
        s.push(7);
        s.push(3);
        s.push(4);

        // Devuelve el de arriba QUITANDOLO
        System.out.println(s.pop());

        // Devuelve el de arriba sin quitarlo 
        System.out.println(s.peek());

        // Buscar
        System.out.println(s.search(4));

        l.add(7);
        l.add(3);

        System.out.println("Stack: ");
        System.out.println(s);

        System.out.println("List: ");
        System.out.println(l);


    }
}
