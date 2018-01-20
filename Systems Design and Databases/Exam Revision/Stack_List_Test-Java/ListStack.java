/* A program demonstrating the implementation and use of an array-based stack in 
 * Java taken from Problem Solving with Java by Elliot Koffman and Ursula 
 * Woltz. */
 
/**
 * Represents a list-based stack.
 *
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 24/04/2017
 */
public class ListStack
{
    /** 
     * Contains the node at the top of the stack.
     */
    private ListNode top;         

    /**
     * Initialises a new instance of a list-based stack.
     */
    public ListStack()
    {
        top = null;
    }

    /**
     * Returns true if the stack is empty, otherwise returns false.
     * 
     * @return  true if the stack is empty, otherwise false
     */
    public boolean isEmpty()
    {
        /* We know the stack is empty if the reference to `top` is null. */
    }
   
    /**
     * Pushes a value onto the top of the stack.
     * 
     * @param value the value to push onto the stack
     */
    public void push(double item)
    {
        /* We need to create a new node, link it to the existing top, then turn 
         * it in to the new top. */
    }

    /**
     * Pops a value off the top of the stack and returns it.
     * 
     * @return  the value that was popped off the stack
     */
    public double pop()
    {
        /* We need to remember the value of the top node, replace top with its
         * successor (`next`) and then return that value. */
    }

    /**
     * Returns the value on the top of the stack without popping it.
     *
     * @return  the value on the top of the stack
     */
    public double peek()
    {
        /* As for `pop()` but without changing the top of the stack. */
    }

    /**
     * Prints the contents of the stack to standard output.
     */
    public void displayStack()
    {
        /* Don't change this method, but do understand how it works. This will
         * print out the contents of your stack. */
           
        if (!isEmpty()) {
            System.out.print("Top: ");
            ListNode current = top;
            while (current != null) {
                String msg = current == top ? "" : "\t";
                System.out.println(msg + current.data);
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
