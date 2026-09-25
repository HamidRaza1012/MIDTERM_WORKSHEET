import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Random random=new Random();
        Point[] data=new Point[100];


        for(int i=0; i<data.length; i++){
            int x=random.nextInt(1,101);
            int y=random.nextInt(1, 101);
            data[i]=new Point(x, y);
            // System.out.println(data[i]);
        }


//    System.out.println(Arrays.toString(data));
PointArray original = new PointArray(data);
PointArray shallow = original.clone();
System.out.println(shallow);
PointArray deep = original.deepCopy();
System.out.println("Deep Copy"+" "+deep);
shallow.getPoint(0).SetX(999);
System.out.println("Shallow copy after set"+" "+original);
System.out.println("Shallow"+" "+shallow);
System.out.println("Shallow shares data: " +
(original.getPoint(0).getX() == 999));
deep.getPoint(1).SetY(888);

System.out.println("Deep Copy after setVal"+" "+original);
System.out.println("Deep Copy"+" "+deep);
System.out.println("Deep is independent: " +
(original.getPoint(1).getY() != 888));
    }

}