import java.util.Scanner;
public class Runner{
	public static void main(String[]args){
		
		int input;
		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 9:");
		input = s.nextInt();
		
		
		System.out.println(digitName(input));
		
	}
	
	public static String digitName(int digit){
		switch(digit){
			case 0:
				return "zero";
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			
			default:
				return "zero";
			
		}
	}
}

