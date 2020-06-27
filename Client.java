import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Calculator stub = (Calculator) registry.lookup("Calculator"); 
    
         // Calling the remote method using the obtained object 
         stub.printMsg(); 
         System.out.println("-Addition- of 4 & 36 : "+stub.add(4,36));
         System.out.println("-subtraction- of 6 from 96 : "+stub.subtract(96,6));
         System.out.println("-multiplication- of 60 & 10 :  "+stub.multiply(10,60));
         System.out.println("-divide- 600 by 100 : "+stub.divide(600,100));
                  
         } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}