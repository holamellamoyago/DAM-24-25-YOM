package ud6.StackYqueque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    // QUEUE FIFO (FIRST IN , FIRST OUT)

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(6);
        q.offer(4);
        q.offer(8);

        System.out.println(q.poll());

        System.out.println("Queue: ");
        System.out.println(q);

    }
}
