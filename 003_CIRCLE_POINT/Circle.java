import java.util.Arrays;

public class Circle implements  Cloneable{
   private  String label;
    private Point[] points;

     Circle(String label,Point[] source)throws NullPointerException{
      this.label=label;
      this.points=new Point[source.length];
      for(int i=0; i<this.points.length; i++){
        this.points[i]=new Point(source[i].getX(),source[i].getY());
      }
    }


    public Point getPoint(int index){
      if(!(index >=0 && index<this.points.length)){
         return null ;
      }
      return this.points[index];
      
    }


  // ==========Shallow Copy====================
  
  public Circle clone() throws CloneNotSupportedException{
      return  (Circle) super.clone();
    }

  //============DEEP COPY===============
   
  public Circle deepCopy(){
    Point[] p=new Point[this.points.length];
    for(int i=0; i<p.length; i++){
      p[i]=new Point(this.points[i]);
    }
    // System.out.println("P"+" "+Arrays.toString(p));
    return new Circle(this.label,this.points);
  }


  //============= TO STRING =====================
    public String toString(){
      String str=" ";
      for(int i=0; i<this.points.length; i++){
        str+=this.points[i]+" ";
      }
      return " "+"label :"+" "+label+" "+"Points :"+" "+str;
    }
}