/* A program demonstrating the implementation and use of an array-based stack in
 * Java taken from Problem Solving with  
 * Java by Elliot Koffman and Ursula Woltz. */
 
/**
 * The driver class for the array stack app. Do not modify this file.
 *
 * @author Saul Johnson (saul.johnson@tees.ac.uk)
 * @author Eudes Diemoz (e.diemoz@tees.ac.uk)
 * @since 24/04/2017
 */
public class ArrayStack_App
{
    /**
     * The main method for the array stack app.
     *
     * @param args  the program's command-line arguments
     */
	public static void main(String[] args)
	{
		ArrayStack stack = new ArrayStack(5);
		
        // Show that stack is empty.
		String msg = stack.isEmpty() ? "Stack is empty." : "Stack is not empty.";
		System.out.println(msg);
		
        // Push values on to stack.
		stack.push(5.0);
		stack.push(6.5);
		stack.push(-3.0);
		stack.push(-8.0);
		
        // Display stack contents.
		stack.displayStack();
		
        // Show top of stack.
		System.out.println("Top: " + stack.peek());
	
        // Pop top value.
		stack.pop();
		
        // Show top of stack again.
		System.out.println("Top: " + stack.peek());
		
        // Empty stack.
		while (!stack.isEmpty())
		{
			stack.pop();
		}
		
        // Demonstrate that stack is empty.
		stack.displayStack();
	}
}
