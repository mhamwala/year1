/* A program demonstrating the implementation and use of an array-based stack in 
 * Java taken from Problem Solving with Java by Elliot Koffman and Ursula 
 * Woltz. */
 
/**
 * Represents a node in a linked list. Do not modify this file.
 *
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 24/04/2017
 */
public class ListNode
{
    /**
     * Stores the data for the node (a double value).
     */
    double data;

    /**
     * Stores the link to the next node. This is also sometimes called the node's `tail`.
     */
    ListNode next;

    /**
     * Creates a new empty node.
     */
    public ListNode()
    {
        data = 0;
        next = null;
    }

    /**
     * Creates a new node with `data` stored in it.
     *
     * @param data  the data to store in the new node
     */
    public ListNode(double data)
    {
        this.data = data;
        next = null;
    }

    /**
     * Creates a new node storing `data` and linked to `next`.
     *
     * @param data  the data to store in the new node
     * @param next  the next node in the list
     */
    public ListNode(double data, ListNode next)
    {
        this.data = data;
        this.next = next;
    }
}
