/* A program demonstrating the implementation and use of an array-based stack in
 * Java taken from Problem Solving with  
 * Java by Elliot Koffman and Ursula Woltz. */
 
/**
 * Represents an array-based stack.
 *
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 24/04/2017
 */
public class ArrayStack
{	
    /**
     * The maximum 0-based index of the top of the stack (equal to size - 1).
     */
	private int maxTop;
    
    /**
     * The current index of the top of the stack.
     */
	private int top;
    
    /**
     * The array that contains the stack values.
     */
	private double[] values;

	/**
     * Initialises a new instance of an array-based stack.
     *
     * @param size  the maximum size of the stack
     */
	public ArrayStack(int size)
	{
		/* The maximum index of our top is going to be equal to size - 1 (think
		 * about this carefully). We also initialise our array and set our top
		 * index to -1, showing this stack is empty. */
		 
		maxTop = size - 1;
		values = new double[size];
		top = -1;
	}
	
    /**
     * Returns true if the stack is empty, otherwise returns false.
     * 
     * @return  true if the stack is empty, otherwise false
     */
	public boolean isEmpty()
	{
		/* We know our stack is empty if the index of the top of the stack is
		 * equal to -1. */
	}
	
    /**
     * Returns true if the stack is full, otherwise returns false.
     * 
     * @return  true if the stack is full, otherwise false
     */
	public boolean isFull()
	{
		/* We know our stack is empty if the index of the top of the stack is
		 * at its maximum. */
	}

    /**
     * Pushes a value onto the top of the stack.
     * 
     * @param value the value to push onto the stack
     */
	public void push(final double value)
	{
		/* We can 'push' a value onto the stack by incrementing `top` and adding
		 * the value at the appropriate index in the array. */
	}

    /**
     * Pops a value off the top of the stack and returns it.
     * 
     * @return  the value that was popped off the stack
     */
	public double pop()
	{
		/* We can 'pop' a value off of the stack by storing the topmost value,
		 * decrementing the top and then returning our stored value. */
	}
    
	/**
     * Returns the value on the top of the stack without popping it.
     *
     * @return  the value on the top of the stack
     */
	public double peek()
	{
		/* Very similar to pop, but we don't need to change `top`. Think about
		 * why this is. */
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
            for (int i = top; i > -1; i--)
            {
                String msg = i == top ? "" : "\t";
                System.out.println(msg + values[i]);
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
