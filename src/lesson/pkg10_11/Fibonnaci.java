package lesson.pkg10_11;
import TerminalIO.*;
public class Fibonnaci {

    public static void main (String[] args){
        
    KeyboardReader kr = new KeyboardReader();
    
  int num;
    
    while(true){        
        num= kr.readInt("Please Enter A number between 1 and 15: ");
        if (num>15 || num < 0)
        {
            System.out.println("Please Enter a Valid Number: ");
        }
        else break;
        
    }
     System.out.println(fibonacci(num) + " is fibonacci number " + num);
    }
    public static int fibonacci(int n){
        if(n<=2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
