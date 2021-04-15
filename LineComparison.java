public class LineComparison {
public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

	Line line = new Line();

	String line1 = Double.toString(line.computelength(1, 2, 3, 5));
	String line2 = Double.toString(line.computelength(1, 2, 3, 4));

	System.out.println(line1.equals(line2));
	System.out.println(line1.compareTo(line2));
	}
}

class Line {
public double computelength(int x1, int y1, int x2, int y2){
	double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	return length;
	}
}
