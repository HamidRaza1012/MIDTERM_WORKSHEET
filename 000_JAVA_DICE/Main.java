public class Main {
public static void main(String[] args) {
// Create Sara with 2 dice, each having 6 sides.
Player player = new Player("Sara", 2, 6);
// System.out.println(player);
player.roll(); //Die 1 = 3 Die 2 = 2 (Random values)
System.out.println("Initial total: " + player.getTotal());
System.out.println(player);
player. roll(0);
System.out.println("New total : " + player.getTotal());

System.out.println(player);
player.cheatroll();
System.out.println(player);
// int r=(int)((Math.random()*6))+1;
// System.out.println(r);
}
}