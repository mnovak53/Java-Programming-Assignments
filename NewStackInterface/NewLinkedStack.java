//----------------------------------------------------------------------
// NewLinkedStack.java         by Dale/Joyce/Weems                Chapter 2
//
// Implements StackInterface using a linked list to hold the elements.
//-----------------------------------------------------------------------

package assign3Fa23;

import java.util.Random;
import java.util.Scanner;

public class NewLinkedStack<T> implements NewStackInterface<T>
{
	protected LLNode<T> top;   // reference to the top of this stack

	public NewLinkedStack()
	{
		top = null;
	}

	public void push(T element)
	// Places element at the top of this stack.
	{ 
		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(top);
		top = newNode;
	}     

	public void pop()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{                  
		if (isEmpty())
			throw new StackUnderflowException("Pop attempted on an empty stack.");
		else
			top = top.getLink();
	}

	public T top()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element of this stack.
	{                 
		if (isEmpty()) {
			throw new StackUnderflowException("Top attempted on an empty stack.");
		}
		
		else {
			return top.getInfo();
		}
	}

	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{              
		return (top == null); 
	}

	public boolean isFull()
	// Returns false - a linked stack is never full
	{              
		return false;
	}
	
	@Override
	public void popFromBottom() throws StackUnderflowException {
		// TODO Auto-generated method stub
		// Find the last node
		LLNode<T> last =  top;
		LLNode<T> previous =  null;
	    
	    while (last.getLink() != null) {
	    	previous = last;
	        last = last.getLink();
	    }
	}
	
	@Override
	public T bottom() throws StackUnderflowException {
	    
	    // Find the last node
	    LLNode<T> last =  top;
	    
	    while (last.getLink() != null) {
	        last = last.getLink();
	    }
	    // Save the data from the bottom element
	    T bottomData = last.getInfo();
	    return bottomData;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub	
		LLNode<T> in = top;
		String st = in.getInfo() + "";
		return st;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		LLNode<T> in = top;
		int out=1;
		if(in == null) {
			return 0;
		}
		while(in.link != null) {
			out++;
			in = in.getLink();
		}
		return out;
	
	}
		
}

