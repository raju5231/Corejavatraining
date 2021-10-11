package point2D;

public class Point2D {
double x,y;
	Point2D(double S,double R){
		x=S;
		y=R;
	}
	public String getDetails()
	{
		return "Point ("+x+","+y+")";
	}
	
	
	
	public static void main(String[] args) {
		Point2D p1 = new Point2D(1.1, 2.1);
		
		String gd = p1.getDetails();
		System.out.println(gd);

	}

}
