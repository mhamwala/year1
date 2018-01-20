/** ListNode.java
 * class ListNode representing a node with information and link fields
 * adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
 * ADS class
 * March 2017
 */

public class ListNode
{
    // DATA fields
    int				data;	// data stored in the node
    ListNode	link;	// link to next node

    
    // CONSTRUCTORS
    // postcondition: Creates a new empty node
    public ListNode()
    {
         data = 0;   
         link = null;
    }

    // postcondition: Creates a new node storing obj
    public ListNode(int obj)
    {
         data = obj;   
         link = null;
    }

    // postcondition: Creates a new node storing obj
    // and linked to node referenced by link.
    public ListNode(int obj, ListNode next)
    {
         data = obj;   
         link = next;
    }
} // end of class ListNode