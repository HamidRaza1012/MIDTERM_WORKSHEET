import java.util.Arrays;

public class Player {
    String name;
    Dice [] dice;
    int total;
    
    public Player(String name,int count,int sides){
        this.name=name;
        this.dice=new Dice[count];
        for(int i=0; i<this.dice.length; i++){
            this.dice[i]=new Dice(sides);
        }
    }

    public void roll(){
      for(int i=0; i<this.dice.length; i++){
        total+=this.dice[i].roll();
        // System.out.println(total);
      }    
    }

    public int getTotal(){
        return this.total;
    }

    public int roll(int index){
        if(index >= 0 && index < this.dice.length){   
     this.total-=this.dice[index].getValue();     
     this.total+=this.dice[index].roll();    
                  
   }
       
        return total;
    }

    public void cheatroll(){
      int lower=0;     
      for(int i=0; i<this.dice.length; i++){   //[4,2]
        if(this.dice[i].getValue() < this.dice[lower].getValue()){
          lower=i;
        }

      }


      int old=this.dice[lower].getValue();
       total-=old;
     int newVal=this.dice[lower].roll();
    while (newVal <=old){
      newVal=this.dice[lower].roll();
    }
       total+=newVal;      
    }

     @Override
      public String toString() {
      
      String answer = "Name: " + this.name + " "+"\n"+ "total: " + this.total +
      " "+"\n";
        for (int i = 0; i < this.dice.length; i++) {
      answer = answer + this.dice[i].getValue()+this.dice[i].getSides();
      answer = answer + "i: "+i +"\t"+ this.dice[i].toString()+"\n";
        
      }
     return answer;
  
 }

  // @Override
  //   public String toString() {
  //       String s = "" + Arrays.toString(this.dice) + this.name + this.total;
  //       return s;
  //   }

    // public String toString(){
    //   String str=" ";
    //   for(int i=0; i<this.dice.length; i++){
    //     str+=this.dice[i].toString();
    //   }

    //   return " "+"Name :"+" "+this.name+" "+"Dice"+" "+str+" "+"Total:"+" "+this.total;
      
    // }
    

}
