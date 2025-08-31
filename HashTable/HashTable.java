package hashTable;
/**
 * COSC 2100 - Fall 2023
 * Assignment#6
 * Assignment Problem based on Hashing
 * Implementation of HashTable class using an array to hold the elements. 
 * One constructor is provided that allows the calling program to 
 * specify the size of the hash table.
 * @author Micah Novak
 */
import java.util.Hashtable;
public class HashTable {

	protected int[] elements;        // holds hash table elements, int type
	protected static int numElements = 10;   // no. of elements in the hash table

	//Constructor
	public HashTable(int maxSize) {
		elements = new int[maxSize];
	}

	public void addLP(int element) {
	    // TODO: Implement this method to add element to the hash table
	    // Use Linear Probing to resolve any collisions
	    
	    // Initialize the elements array if it's not already done
	    if (elements == null) {
	        elements = new int[numElements];
	    }

	    int hash = element % numElements;
	    int originalHash = hash;

	    // Find the next available slot using linear probing
	    while (elements[hash] != 0) {
	        hash = (hash + 1) % numElements;

	        // If the table is full, display a message and return
	        if (hash == originalHash) {
	            System.out.println("Hash table is full. Unable to add element: " + element);
	            return;
	        }
	    }
	    elements[hash] = element;
	}
	
	public String toString() {
		//TODO(2) Implement this method to print the hash table
		StringBuilder result = new StringBuilder();

        for (int i = 0; i < numElements; i++) {
            if (elements[i] != 0) {
                result.append("Index ").append(i).append(": ").append(elements[i]).append("\n");
            } 
            else {
                result.append("Index ").append(i).append(": Empty\n");
            }
        }

        return result.toString();
	}	
	public static void main(String[] args) {
        HashTable testcase1 = new HashTable(numElements);
        HashTable testcase2 = new HashTable(numElements);
        HashTable testcase3 = new HashTable(numElements);
        //test case 1
        testcase1.addLP(548);
        testcase1.addLP(3);
        testcase1.addLP(64);
        testcase1.addLP(704);
        System.out.println(testcase1.toString());
        
        //test case 2
        testcase2.addLP(5);
        testcase2.addLP(84);
        testcase2.addLP(766);
        testcase2.addLP(25);
        testcase2.addLP(44);
        testcase2.addLP(245);
        testcase2.addLP(99);
        System.out.println(testcase2.toString());
        
        //test case 3
        testcase3.addLP(107);
        testcase3.addLP(300);
        testcase3.addLP(766);
        testcase3.addLP(15);
        testcase3.addLP(90);
        testcase3.addLP(21);
        testcase3.addLP(45);
        testcase3.addLP(988);
        testcase3.addLP(754);
        testcase3.addLP(1);
        System.out.println(testcase3.toString());
        
        
    }
}