/** D_ListNode.java
 * class D_ListNode representing a node with information and link fields
 * adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
 * ADS class
 * March 2017
 */

public class ListNode
{
    // DATA fields
    int					data;	// data stored in the node
    ListNode	next;	// link to next node
    ListNode  prev;   // link to previous node

    
    // CONSTRUCTORS
    // postcondition: Creates a new empty node
    public ListNode()
    {
         data = 0;   
         next = null;
         prev = null;
    }

    // postcondition: Creates a new node storing obj
    public ListNode(int obj)
    {
         data = obj;   
         next = null;
         prev = null;
    }

    // postcondition: Creates a new node storing obj
    // and linked to node referenced by link.
    public ListNode(int obj, ListNode succ, ListNode pred)
    {
         data = obj;   
         next = succ;
         prev = pred;
    }
} // end of class D_ListNode