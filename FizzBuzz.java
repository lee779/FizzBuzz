
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Ju Young Lee
 * FizzBuzz test:
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 * 
 * This program will perform the FizzBuzz test and print the result in an output text file named fizzbuzz.txt
 *
 *
 */

 
public class FizzBuzz {

	
	//define some variables 
	private static final int START = 1;
	private static final int END = 100;
	private static final int MULTIPLE_1 = 3;
	private static final int MULTIPLE_2 = 5;
	////////////////////////////////////////////

	public static void main(String[] args) throws IOException{
		PrintWriter printOut;
		printOut = new PrintWriter(new FileWriter("fizzbuzz.txt"));
		
			for(int i= START; i <= END; i++){
				
				if(i % (MULTIPLE_1 * MULTIPLE_2) == 0){
					printOut.println("FizzBuzz");
				}else if(i % MULTIPLE_1 == 0){
					printOut.println("Fizz");
				}else if(i % MULTIPLE_2 == 0){
					printOut.println("Buzz");
				}else{
					printOut.println(i);
				}
				
			}
			printOut.close();
	}	
}

