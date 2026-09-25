public class PointArray implements Cloneable{
    Point[] point;

    // Constructor
    public PointArray(Point[] points){
        this.point=new Point[points.length];
        for(int i=0; i<this.point.length; i++){
           this.point[i]=new Point(points[i].getX(),points[i].getY());
        }
    }
   
    
    public Point getPoint(int index){
     return this.point[index];
    }

    //Shallow Copy 
    public PointArray clone() throws  CloneNotSupportedException{
    return (PointArray) super.clone();
    }


    //Deep copy
    public PointArray deepCopy(){
        Point[] arr=new Point[this.point.length]; 
        for(int i=0; i<arr.length; i++){
            arr[i]=new Point(this.point[i].getX(),this.point[i].getY());
        }

        return new PointArray(arr);
    }

   // toString 
    
    public String toString(){
        String str=" ";
        for(int i=0; i<this.point.length; i++){
            str+=this.point[i]+" ";
        } 

        return " "+"Point Array"+" "+str+" ";
    }
}
