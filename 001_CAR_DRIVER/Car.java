public class Car implements  Cloneable {
    String model;
    Driver driver;
    int [] speedHistory;

    // Parametized Constructor 
    public Car(String model,String driver_Name,int driver_id){
        this.model=model;
        this.driver=new Driver(driver_Name, driver_id);
        this.speedHistory=new int[2];
    }



    public void drive(){
        System.out.println("Car is driving!");
    }


    public void drive(int speed){
       System.out.println("Car is driving at"+speed+"Km/h");
    }
     
    //setter
    public void setSpeed(int index,int speed){
      this.speedHistory[index]=speed;

    }

    //getter
    public int getSpeed(int index){
        return this.speedHistory[index];
    }


    // Create Shallow Copy
    public Car clone() throws CloneNotSupportedException{
        return  (Car) super.clone();
    }

    //Create deep copy
    public Car deepCopy(){
        int [] c=new int[this.speedHistory.length];
        for(int i=0; i<c.length; i++){
           c[i]=this.speedHistory[i];
        }

        
        Car copy=new Car(this.model, this.driver.getName(), this.driver.getID());
         copy.speedHistory=c;

         return  copy;
    }


    // =========TO STRING=========
    public String toString(){
        String str=" ";
        for(int i=0; i<this.speedHistory.length; i++){
            str+=this.speedHistory[i]+" ";
        }

        return " "+"SpeedHistory :"+" "+str+" "+"Driver"+" "+this.driver+" "+"Model :"+" "+this.model;
    }
}