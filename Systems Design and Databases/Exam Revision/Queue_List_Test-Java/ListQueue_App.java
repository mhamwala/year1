/* A program demonstrating the implementation and use of an list-based queue in Java taken from Problem Solving with  
   Java by Elliot Koffman and Ursula Woltz. */
 
/**
 * The driver class for the list queue app. Do not modify this file.
 *
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @since 24/04/2017
 */
public class ListQueue_App
{
    /**
     * The main method for the list queue app.
     *
     * @param args  the program's command-line arguments
     */
    public static void main(String[] args)
    {
        // Initialize queue.
        ListQueue queue = new ListQueue();

        // Enqueue 4 names
        queue.enqueue("Chris");
        queue.enqueue("Robin");
        queue.enqueue("Debbie");
        queue.enqueue("Richard");
        
        // Print out queue.
        System.out.println(queue.toString());

        // Dequeue first name.
        String name = queue.dequeue();
        System.out.println("Dequeued " + name + ".");

        // Enqueue extra name.
        queue.enqueue("Dustin");
        System.out.println("Enqueued Dustin.");

        // Dequeue name.
        name = queue.dequeue();
        System.out.println("Dequeued " + name + ".");

        // Print queue size.
        System.out.println("Size of queue is " + queue.getSize() + ".");

        // Enqueue priority person.
        queue.enqueue("Lizzie");
        System.out.println("Enqueued Lizzie.");

        // Print queue with priority person at back.
        System.out.println(queue.toString());

        // Move priority person to front.
        queue.moveToFront("Lizzie");
        System.out.println("Moved Lizzie to front.");

        // Print out queue again, priority person should be at front.
        System.out.println(queue.toString());
    }
}
