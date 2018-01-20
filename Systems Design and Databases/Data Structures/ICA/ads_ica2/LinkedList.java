package ads_ica2;
/* THIS IS ONE OF THE FILES YOU NEED TO FILL IN. */

/**
 * Represents a linked list.
 * 
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 26/03/2017
 */
public class LinkedList
{
    /**
     * Stores the first node in the list.
     */
    ListNode head;
    /**
     * Creates a new linked list.
     */
    public LinkedList()
    {
        /* We want to create an empty list. An empty list has a null `head` (that is, 0 elements). This method is given 
           to you. Do not modify it. */
        head = null;
    }
    
    /**
     * Creates a new linked list from an existing array.
     *
     * @param array the array to create the new linked list from
     */
    public LinkedList(int[] array)
    {
        /* We need to loop over the array of integers given to us in `array` and add them as list nodes, one at a time. 
           This method is given to you. Do not modify it. */
        for (int i = array.length - 1; i >= 0; i--)
        {
            head = new ListNode(array[i], head);
        }
    }

    /**
     * Adds a node containing the given data at the beginning of this list.
     *
     * @param data  the data to add
     */
    public void addFirst(int data)
    {
        // Add a node at the beginning of the list.
		ListNode newNode = new ListNode(data);
        if(head == null)
        {
			head = new ListNode(data);
        }
        else
        {
            ListNode current = head;
			head = new ListNode(data,current);
        }
    }

    /**
     * Returns the first value in this list.
     *
     * @return  the first value in this list
     */
    public int getFirst()
    {
        // Retrieve the data stored in the first node of the list, if it exists. Otherwise return 999.
         ListNode current = head;
        if(head!= null)
		{
			return head.data;
		}
		else
		{
            return 999; 
		}
    }

    /**
     * Returns the value stored at the given index in the list.
     *
     * @param index the index to retrieve the value at
     * @return      the value stored at the given index in the list
     */
    public int getAtPos(int index)
    {
        // Retrieve the data in the node located at position `index`, if it exists. Otherwise return 999.
        int counter = 0;
         ListNode current = head;
            while(current != null)
            {
                if(counter == index)
                {
                    return current.data;
                }
                current = current.next;
                counter++;
            }
		return 999;
    }

    /**
     * Returns the first node containing the desired value.
     *
     * @param value the value to search for
     * @return      the first node containing the desired value
     */
    public ListNode searchPointer(int value)
    {
        // Return the first node containing `value`. If not found, return null.
        ListNode current = head;
        while(current != null)
        {
            if(current.data == value)
            {
                return current;
            }
            current = current.next;
        }     
        return null;
    
    }
}
