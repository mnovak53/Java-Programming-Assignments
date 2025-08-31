package assign3Fa23;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int in = scan.nextInt();
		
		NewLinkedStack<Integer> intStack = new NewLinkedStack<Integer>();
		for(int i = 0; i<in; i++) {
			intStack.push(ran.nextInt(1000));
		}
		LLNode<Integer> last =  intStack.top;
	    System.out.println("top -> "+ last.getInfo());
	    while (last.getLink() != null) {
	        last = last.getLink();
	        System.out.println(last.getInfo());
	    }
	    
	   
		
		while(intStack.size()<1) { 
			if(intStack.top() > intStack.bottom()){
				intStack.popFromBottom();
			}
			if(intStack.top() == intStack.bottom()) {
				intStack.popFromBottom();
			}
			if(intStack.top() < intStack.bottom()){
				intStack.pop();
			}
		}
        System.out.println("The largest number is "+ intStack.toString());
	}
}
