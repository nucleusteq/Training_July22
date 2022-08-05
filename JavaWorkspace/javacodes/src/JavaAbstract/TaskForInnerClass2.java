package JavaAbstract;
abstract class BikeClass{  
    abstract void display();  
  }  
  class TaskForInnerClass2{  
   public static void main(String args[]){  
    BikeClass run = new BikeClass(){  
    void display(){System.out.println("Display Method!");}  
    };  
    run.display();  
   }  
  }  