public class Driver{
    private String name;
     private int id;

     //Parametized Constructor
     public Driver(String name, int id){
        this.name=name;
        this.id=id;

     }

     //Copy Constructor
     public Driver(Driver other){
        this.name=other.name;
        this.id=other.id;
     }

   
     // getter
     public String getName(){
      return this.name;
     }


     public int getID(){
      return this.id;
     }



     public String toString(){
        return " "+"Name :"+" "+this.name+" "+"ID:"+" "+this.id;
     }
}