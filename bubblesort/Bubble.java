package bubblesort;

import java.util.ArrayList;
import java.util.Random;

public class Bubble {
	public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 7; i++) {
            A.add(rand.nextInt(100));
            B.add(rand.nextInt(100));
            C.add(rand.nextInt(100));
        }
        
        A = initializeAndSort(A);
        B = initializeAndSort(B);
        C = initializeAndSort(C);

        System.out.println("Test Case 1:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        ArrayList<Integer> mergedResult1 = mergeSortedLists(A, B, C);
        System.out.println("Merged Result: " + mergedResult1);
        System.out.println();

        A.clear();
        B.clear();
        C.clear();

        for (int i = 0; i < 3; i++) {
            A.add(rand.nextInt(100));
        }
        for (int i = 0; i < 5; i++) {
            B.add(rand.nextInt(100));
        }
        for (int i = 0; i < 10; i++) {
            C.add(rand.nextInt(100));
        }

        A = initializeAndSort(A);
        B = initializeAndSort(B);
        C = initializeAndSort(C);

        System.out.println("Test Case 2:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        ArrayList<Integer> mergedResult2 = mergeSortedLists(A, B, C);
        System.out.println("Merged Result: " + mergedResult2);
        System.out.println();

        A.clear();
        B.clear();
        C.clear();

        for (int i = 0; i < 2; i++) {
            A.add(rand.nextInt(100));
        }
        for (int i = 0; i < 8; i++) {
            B.add(rand.nextInt(100));
        }
        for (int i = 0; i < 13; i++) {
            C.add(rand.nextInt(100));
        }

        A = initializeAndSort(A);
        B = initializeAndSort(B);
        C = initializeAndSort(C);

        System.out.println("Test Case 3:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        ArrayList<Integer> mergedResult3 = mergeSortedLists(A, B, C);
        System.out.println("Merged Result: " + mergedResult3);
    }
	
	
	public static ArrayList<Integer> initializeAndSort(ArrayList<Integer> list) {
        int n = list.size();
        for(int i = 0; i < n-1; i++) {
        	for(int j = 0; j < n-1-i; j++) {
        		if(list.get(j)>list.get(j+1)) {
	        		int temp = list.get(j);
	        		list.set(j, list.get(j+1));
	        		list.set(j+1, temp);
        		}
        	}
        }
        return list;
    }
	 public static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
	        ArrayList<Integer> result = new ArrayList<>();

	        int i = 0, j = 0, k = 0;
	        while (i < A.size() || j < B.size() || k < C.size()) {
	            int min = Integer.MAX_VALUE;
	            if (i < A.size()) {min = A.get(i);}
	            if (j < B.size()) {min = Math.min(min, B.get(j));}
	            if (k < C.size()) {min = Math.min(min, C.get(k));}

	            result.add(min);

	            if (i < A.size() && A.get(i) == min) i++;
	            else if (j < B.size() && B.get(j) == min) j++;
	            else if (k < C.size() && C.get(k) == min) k++;
	        }
	        return result;
	 
	 }
}
