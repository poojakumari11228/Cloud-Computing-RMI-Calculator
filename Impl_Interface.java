import java.util.Scanner; 
// Implementing the remote interface 
public class Impl_Interface implements Calculator{  
   
   // Implementing the interface method 
   public void printMsg() {  
      System.out.println("---Calculator---");
         }
// addition method
  public int add(int a, int b) {  
      return a+b;
   }
//substraction method
public int subtract(int a, int b){  
      return a-b;
   }

//multiply method
public double multiply(int a, int b){
return a*b;
}

//divide method
public double divide(int a, int b){
return a/b;
}

} 