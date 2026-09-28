import java.util.Objects;

public class Point{
private  int x;  
private int y;
 
 //Parameter Constructor 
  public Point(int x,int y){
    this.x=x;
    this.y=y;
  }

  // Copy Constructor
  public Point (Point other){
    this.x=other.x;
    this.y=other.y;
  }

  //        Setter
  public void SetX(int x){
    this.x=x;
  }

  public void SetY(int y){
    this.y=y;
  }

   //  getter
  public int getX(){
    return this.x;
  }
 
  public int getY(){
    return this.y;
  }

  //  equals method
  @Override 
  public boolean equals(Object other){
    if(this==other){
        return  true;
    }
    if(other==null){
        return false;
    }

    if(!(other instanceof Point)){return  false;}
    
    Point that=(Point) other;

    return this.x == that.x && this.y==that.y;
  
  }

  // Hash method
  @Override 
  public int hashCode(){
    return  Objects.hash(this.x,this.y);
  }

  //  toString  method
  public String toString(){
    return   " "+"x :"+" "+this.x+" "+"y :"+" "+this.y;
  }



}