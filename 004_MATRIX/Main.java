public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
int[] source = {1, 2, 3,
                4, 5, 6};   // rows 0*3+1=1 column 99  // 3 
Matrix original = new Matrix(2, 3, source);
System.out.println(original);
Matrix shallow = original.clone();
Matrix deep = original.deepCopy();
shallow.set(0, 1, 99);
System.out.println("Original after shallow: " + original);
deep.set(1, 2, 88);
System.out.println("Original after deep : " + original);
System.out.println("Deep copy : " + deep);
deep.set(      1, 0, 23);
System.out.println("Deep copy : " + deep);
System.out.println(original);
// System.out.println(RandomIntegerPractice.myNextInt(2, 8));

}
}