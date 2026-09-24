import java.util.Random;

public class Dice{
    private int sides;
    private int value;
   static Random random=new Random();

    public Dice(int sides){
        this.sides=sides;
        this.value=0;
        
    }

    // public int roll(){
    //   return value=random.nextInt(1,sides+1);
    // }

    public int roll(){
       int r=(int)((Math.random()*6))+1;
        return this.value=r;
    }

    public void setSidesAndVal(int sides,int value){
        this.sides=sides;
        this.value=value;

    }
    public int getSides(){
        return this.sides;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        return " "+"Sides :"+" "+this.sides+" "+"Value :"+" "+this.value;
    }
}