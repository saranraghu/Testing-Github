package sample1;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("ENTER THE AGE");
		byte AGE = S.nextByte();
		
		System.out.println("ENTER THE ATMPIN");
		S.nextShort();
		
		System.out.println("ENTER PINCODE");
		int PINCODE = S.nextInt();
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
