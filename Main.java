//asks for the length of an array, gives it random values between 1 and 10 inclusive, and finally prints it
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int arrayLength;
		
		System.out.println("How many random numbers do you want to keep track of?");
		arrayLength = s.nextInt();
		System.out.println("New array:");
		
		
		int[]randomNumberArray = new int[arrayLength];
		/*
		for(int i=0;i<randomNumberArray.length;i++){
			randomNumberArray[i] = (int)(Math.random()*(10)+1);
		}
		
		for(int i=0;i<randomNumberArray.length;i++){
			System.out.println(randomNumberArray[i]);
		}*/
		System.out.println(3d);
	}
}

/*
How many random numbers do you want to keep track of?
10
New array:
9
8
4
4
4
1
3
4
9
9
*/
