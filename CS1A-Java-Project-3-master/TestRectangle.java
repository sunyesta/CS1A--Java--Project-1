// Takes in length and width for 4 rectangles and then prints their lengths and widths at the end
import java.util.ArrayList;
import java.util.Scanner;
public class TestRectangle{

	public static void main(String[]args){
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0;i<4;i++){
			System.out.println("Define rectangle #"+(i+1)+":");
		System.out.print("Length: ");
		int length = s.nextInt();
		System.out.print("Width: ");
		int width = s.nextInt();
		rectangles.add(new Rectangle());
		rectangles.get(i).setLength(length);
		rectangles.get(i).setWidth(width);
		}
		
		for(int i=0;i<rectangles.size();i++){
			System.out.println("Rectangle #"+(i+1)+": "+rectangles.get(i));
		}
		
		
	}
	
}

/*Define rectangle #1:
Length: 2
Width: 4
Define rectangle #2:
Length: 2
Width: 1
Define rectangle #3:
Length: 3
Width: 4
Define rectangle #4:
Length: 1
Width: 3
Rectangle #1: For this Rectangle: length = 2, and width = 4
Rectangle #2: For this Rectangle: length = 2, and width = 1
Rectangle #3: For this Rectangle: length = 3, and width = 4
Rectangle #4: For this Rectangle: length = 1, and width = 3
*/