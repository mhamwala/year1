package ads_ica2;

/* THIS IS ONE OF THE FILES YOU NEED TO FILL IN. */

/**
 * Represents a circular linked list.
 * 
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 23/04/2017
 */
public class CircularLinkedList
{
    /**
     * Stores the first node in the list. In this case this node is always a dummy node with a sentinel value of 999.
     */
    ListNode head;
	int size = 0;

    /**
     * Creates a new circular linked list.
     */
    public CircularLinkedList()
    {
        /* We want to create an empty list. An empty list has a sentinel `head` node with a value of 999. This method is
           given to you. Do not modify it. */
           
        ListNode newNode = new ListNode(999); // Add sentinel node.
        head = newNode;
        newNode.next = head; // Sentinel node links to itself.
    }
    
    /**
     * Creates a new linked list from an existing array.
     *
     * @param array the array to create the new linked list from
     */
    public CircularLinkedList(int[] array)
    {
        /* We need to loop over the array of integers given to us in `array` and add them as list nodes, one at a time. 
           This method is given to you. Do not modify it. */
        size = array.length;
        ListNode last = null;
        ListNode newNode = null;
        ListNode prev = null;
        for (int i = 1; i <= array.length; i++) 
		{
            newNode = new ListNode(array[array.length - i], prev);
            if (i == 1) 
			{
              last = newNode;
            }
            prev = newNode;
        }
        head = new ListNode(999, newNode);
        last.next = head;
    }

    /**
     * Returns true if the list is empty, otherwise returns false.
     *
     * @return  true if the list is empty, otherwise false
     */
    public boolean isEmpty()
    {
        // Returns true if the list is empty, otherwise returns false.
        ListNode pointer = head;
        int counter = 0;
		
	while(pointer.next != null)
        {
            pointer = pointer.next;
            counter++;
            if(counter >= size)
            {
                return true;
            }
			else
			{
			return false;
			}
		}
		return true;
	}
    
    /**
     * Returns the size of the linked list.
     *
     * @return  the size of the linked list
     */
    public int getSize()
    {
        // Return the size of the linked list.
        return size;
    }

    /**
     * Deletes the node at the given position in the list.
     *
     * @param index the index of the node to delete
     * @return      true on success, false on failure
     */
    public boolean deleteAtPos(int index)
    {
        // Delete the node at index `index` in the list. Return true on success, false on failure.
		 ListNode current = head;
        int count = 0;
        while (current != null) 
		{
            if (count == index) 
			{
                ListNode toDelete = current.next;
                current.next = toDelete.next;
                toDelete = null;
                return true;
            } else if (count != index) 
			{
                count++;
                current = current.next;
                if (current.next == head.next) 
				{
                    return false;
                }
            }
        }
        return false;
	}

    /**
     * Returns the 1-based index of the first node in the list containing the specified value.
     * 
     * @param value the value to search for
     * @return      the 1-based index of the first node in the list containing the specified value
     */
    public int searchIndex(int value)
    {
        /* Return the ONE-BASED (1-BASED) index of the first node in the list containing `value` as data. If not found,
         * return -1. */
        ListNode pointer = head;
        int counter = 0;		
		while(pointer.next != null)
        {
            pointer = pointer.next;
            counter++;
            if(counter == value)
            {
                return pointer.data;
            }
			else if(counter >= size)
            {
                return -1;
            }
		}
		return -1;
    } 
}
