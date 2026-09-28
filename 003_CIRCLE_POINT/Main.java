import java.util.Arrays;

public class Main {
private static Circle currentCircle;
public static void main(String[] args) throws CloneNotSupportedException {
Point[] source = {
new Point(1, 2), new Point(3, 4), new Point(5, 6)
};

// System.out.println(Arrays.toString(source));
currentCircle = new Circle("C1", source);
Circle shallow = currentCircle.clone();
Circle deep = currentCircle.deepCopy();
shallow.getPoint(0).SetX(99);
System.out.println("Original after shallow: " + currentCircle);
deep.getPoint(1).SetY(88);
System.out.println("Original after deep : " + currentCircle);
System.out.println("Deep copy : " + deep);
System.out.println("Shallow"+" "+shallow);
}
}