/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads1;

/**
 *
 * @author q5047119
 */
public class DLinkedListNode {
  /**
     * Stores the data for the node (an integer value).
     */
    int data;
    
    /**
     * Stores the link to the next node.
     */
    DLinkedListNode next;    
    
    /**
     * Stores the link to the previous node.
     */
    DLinkedListNode prev;

    /**
     * Creates a new empty node.
     */
    public DLinkedListNode()
    {
        data = 0;
        next = null;
        prev = null;
    }

    /**
     * Creates a new node with `data` stored in it.
     *
     * @param data  the data to store in the new node
     */
    public DLinkedListNode(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }

    /**
     * Creates a new node storing `data` and linked to `next` and `previous`.
     *
     * @param data  the data to store in the new node
     * @param next  the next node in the list
     * @param prev  the previous node in the list
     */
    public DLinkedListNode(int data, DLinkedListNode next, DLinkedListNode prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }  
}
