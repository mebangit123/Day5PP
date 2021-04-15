public class LineComparison {
public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

	int x1=3, x2=4, y1=6, y2=5;
	int x3=3, x4=4, y3=6, y4=5;

	String line1 = Double.toString(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2)));
	String line2 = Double.toString(Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 -y3, 2)));

	System.out.println(line1.equals(line2));
	}
}
