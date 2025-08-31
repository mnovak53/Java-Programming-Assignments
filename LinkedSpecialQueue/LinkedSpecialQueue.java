package assignment5;

public class LinkedSpecialQueue{
	protected LLNode<Integer> front;     // reference to the front of this queue
	protected LLNode<Integer> rear;      // reference to the rear of this queue
	protected int numElements = 0;       // number of elements in this queue
	protected int numSpecial = 0;        // number of special elements in this queue

	public LinkedSpecialQueue() {
		front = null;
		rear = null;
	}

	public int size() {
		// Returns the number of elements in this queue.
		return numElements;
	}

	public int sizeSpecial() {
		// Returns the number of "special" elements in this queue.
		return numSpecial;
	}

	public void enqueue(int element) {
	    // "Special" element should be added to the front of the queue
	    if (element > 10 && element < 65) {
	        LLNode<Integer> new_node = new LLNode<Integer>(element);
	        new_node.link = front;
	        front = new_node;
	        
	    } 
	    else {
	    	numSpecial += 1;
	        // "Regular" element should be added to the rear of the queue
	        LLNode<Integer> new_node = new LLNode<Integer>(element);
	        if (rear == null) {
	            front = new_node; // If the queue is empty, set both front and rear to the new node
	        } else {
	            rear.link = new_node; // Otherwise, link the current rear to the new node
	        }
	        rear = new_node; // Set the new node as the new rear
	    }
	    numElements += 1;
	    
	}

	@Override
	public String toString() {
		//TODO (2) Implement this method to return the nicely formatted
		// String representation of the object
		StringBuilder result = new StringBuilder();
	    LLNode<Integer> current = front;
	    while (current != null) {
	        result.append(current.info).append(" ");
	        current = current.getLink();
	    }
	    return result.toString().trim();
	}

	public LinkedSpecialQueue[] split() {
	    LinkedSpecialQueue[] result = new LinkedSpecialQueue[2];

	    // Create two new queues
	    result[0] = new LinkedSpecialQueue();
	    result[1] = new LinkedSpecialQueue();

	    LLNode<Integer> current = front;

	    while (current != null) {
	        if (current.getInfo() > 10 && current.getInfo() < 65) {
	            // Special element, add to the first queue
	            result[0].enqueue(current.getInfo());
	        } else {
	            // Normal element, add to the second queue
	            result[1].enqueue(current.getInfo());
	        }
	        current = current.getLink();
	    }

	    return result;
	}


}
