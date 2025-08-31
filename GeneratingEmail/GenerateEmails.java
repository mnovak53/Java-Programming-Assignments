package assginment1DS;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class GenerateEmails {
	    // Main method
	    public static void main(String args[]) throws IOException {
	        // Create a Scanner to read from the customers.txt file
	        File file = new File("customers.txt");
	        Scanner input = new Scanner(file);
	        String count = "01"; // Initialize a counter

	        // Loop through each line in the customers.txt file
	        for (int l = 0; l < 20; l++) {
	            // Create a Scanner to read from the template.txt file
	            File file2 = new File("template.txt");
	            Scanner input2 = new Scanner(file2);

	            // Read a line from customers.txt and split it into variables
	            String line = input.nextLine();
	            String[] splitline;
	            splitline = line.split("	"); // Assuming tab is the delimiter

	            // Modify the date to have the year 2023
	            String[] date;
	            date = splitline[3].split("-");
	            date[2] = "2023";
	            String redate = date[0] + "-" + date[1] + "-" + date[2];
	            splitline[3] = redate;

	            // Create a FileWriter to store the customized email
	            FileWriter wString = new FileWriter("Email" + count + "_" + splitline[0] + ".txt");

	            // Loop through the lines in template.txt
	            for (int t = 0; t < 7; t++) {
	                String cust2 = input2.nextLine();
	                String[] sen = cust2.split(" ");

	                // Iterate through each word in sen
	                for (int i = 0; i < sen.length; i++) {
	                    int check = 0;

	                    // Replace place holders with customer-specific values
	                    if (sen[i].equals("<<CustID>>")) {
	                        wString.write(splitline[0] + "\n");
	                        check += 1;
	                    }
	                    if (sen[i].equals("<<Name>>,")) {
	                        wString.write(splitline[1] + ",");
	                        check += 1;
	                    }
	                    if (sen[i].equals("<<Points>>")) {
	                        wString.write(splitline[2] + " ");
	                        check += 1;
	                    }
	                    if (sen[i].equals("<<ExpiryDate>>.")) {
	                        wString.write(splitline[3] + ".\n\n");
	                        check += 1;
	                    }
	                    if (sen[i].equals("customer.")) {
	                        wString.write(sen[i] + "\n");
	                        check += 1;
	                    }
	                    if (sen[i].equals("As")) {
	                        wString.write("\n\n");
	                    }
	                    if (sen[i].equals("Thank")) {
	                        wString.write("\n");
	                    }

	                    // If no placeholder matched, write the word as is
	                    if (check == 0) {
	                        wString.write(sen[i] + " ");
	                    }
	                }
	            }

	            // Close the FileWriter
	            wString.close();

	            // Prepare the counter for the next email
	            int num = l + 2;
	            if (l < 9) {
	                count = "0" + num;
	            } else {
	                String s = Integer.toString(num);
	                count = s;
	            }
	        }
	    }
	}
    