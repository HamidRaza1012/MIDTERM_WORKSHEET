import java.util.*;
public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
Car c1 = new Car("Civic", "Sara", 101);
c1.drive();
c1.drive(80);   
Car c2 = c1.clone(); // shallow copy  
System.out.println("c2"+" "+c2);
Car c3 = c1.deepCopy(); // deep copy
System.out.println(c3);  
c2.setSpeed(0, 90); 
c2.setSpeed(1,23); 
System.out.println("C1"+" "+c1);
System.out.println("After shallow copy: " + c1); 
c3.setSpeed(1, 100);  
System.out.println("After deep copy : " + c1);
System.out.println("C3"+" "+c3);
System.out.println("C1"+" "+c1);
c3.setSpeed(0, 50);
System.out.println(c3);
System.out.println(c1);
}
}