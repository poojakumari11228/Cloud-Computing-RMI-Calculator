import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface Calculator extends Remote {  
   void printMsg() throws RemoteException;   
   int add(int a, int b) 	throws RemoteException;   
   int subtract(int a, int b)throws RemoteException;   
   double multiply(int a, int b)throws RemoteException;   
   double divide(int a, int b)throws RemoteException;  
} 