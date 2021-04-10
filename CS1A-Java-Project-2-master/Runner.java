public class Runner{
	public static void main(String[]args){
		
		System.out.println("smallest:");
		System.out.println( smallest (3.5, 6.7, -8.5) ); 
		System.out.println( smallest (3, 3, 3) );
		System.out.println( smallest (-3.3, 3, 3) );
		
		System.out.println("largest:");
		System.out.println( largest (3.5, 6.7, -8.5) );
		System.out.println( largest (3.5, 3.5, 3.5) );
		System.out.println( largest (3.3, 3.5, 3.5) );
		
		System.out.println("average:");
		System.out.println( average (3.5, 6.7, -8.5) );
		System.out.println( average (1, 2, 3) );
		System.out.println( average (-5, -3, -3) );
		System.out.println( average (10, 10, 10) );
		
		System.out.println("allTheSame:");
		System.out.println( allTheSame (3.5, 6.7, -8.5) );
		System.out.println( allTheSame (5, 7, 5) );
		System.out.println( allTheSame (5, 5.1, 5.1) );
		System.out.println( allTheSame (5.1, 5.1, 5.1) );
		
		System.out.println("allDifferent:");
		System.out.println( allDifferent (3.5, 6.7, -8.5) );
		System.out.println( allDifferent (3, 6, -8) );
		System.out.println( allDifferent (8.2, 8.1, 8.1) );
		System.out.println( allDifferent (8.1, 8.1, 8.1) );
	}
	
	public static double smallest(double a,double b,double c){
		if(a<=b && a<=c){
			return a;
		}else if(b<=a && b<=c){
			return b;
		}else if(c<=b && c<=a){
			return c;
		}
		return 0;
	}
	
	public static double largest(double a,double b,double c){
		if(a>=b && a>=c){
			return a;
		}else if(b>=a && b>=c){
			return b;
		}else if(c>=b && c>=a){
			return c;
		}
		return 0;
	}
	
	public static double average(double a,double b,double c){
		return ((double)Math.round(((a+b+c)/3)*100)/100);
	}
	
	public static boolean allTheSame(double a,double b,double c){
		if(a==b && b==c){
			return true;
		}
		return false;
	}
	
	public static boolean allDifferent(double a,double b,double c){
		if(a==b || a==c || b==c){
			return false;
		}
		return true;
	}
	
	/*
	smallest:
	-8.5
	3.0
	-3.3
	largest:
	6.7
	3.5
	3.5
	average:
	0.57
	2.0
	-3.67
	10.0
	allTheSame:
	false
	false
	false
	true
	allDifferent:
	true
	true
	false
	false
	*/
}