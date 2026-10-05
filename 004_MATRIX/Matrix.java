public class Matrix implements Cloneable{
    private  int rows;
    private  int columns;
     int [] data;

    public Matrix(int rows,int columns,int [] source){
        this.rows=rows;
        this.columns=columns;
        this.data=new int[source.length];
        for(int i=0; i<this.data.length; i++){
            this.data[i]=source[i];
        }
    }

    public void set(int rows,int columns,int value){
                     
      this.data[rows*this.columns+columns]=value;

    }



   public Matrix clone() throws CloneNotSupportedException{
    return (Matrix) super.clone();
   }


   public Matrix deepCopy(){

    return new Matrix(this.rows, this.columns, this.data);
   }

   


    public String toString(){
        String str=" ";
        for(int i=0; i<this.data.length; i++){
            str+=this.data[i]+" ";
        }

        return " "+"Rows :"+" "+this.rows+" "+"Columns"+" "+this.columns+" "+"Data:"+" "+str;
    }
}