package JasaTitipanBarang;
import java.util.LinkedList;
import java.util.Queue;

public class JasaTitipanBarang {
    public static void main(String[] args) {
        Queue<String> textQueue = new LinkedList<>();

        // Enqueue elemen ke dalam queue
        textQueue.offer("Elemen 1");
        textQueue.offer("Elemen 2");
        textQueue.offer("Elemen 3");

        System.out.println("Queue setelah enqueue: " + textQueue);
    }
}
