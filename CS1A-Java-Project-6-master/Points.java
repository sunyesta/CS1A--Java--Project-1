import java.awt.Point;
import java.util.ArrayList;
public class Points{
	public static void main(String[]args){
		ArrayList<Point>points = new ArrayList<Point>();
	
		points.add(new Point(0,6));
		points.add(new Point(4,10));
		points.add(new Point(7,1));
		
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		
	}
	
}