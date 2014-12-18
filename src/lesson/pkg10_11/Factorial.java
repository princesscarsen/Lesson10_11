package lesson.pkg10_11;
import TerminalIO.*;
public class Factorial {

    public static void main (String[] args){
        
    KeyboardReader kr = new KeyboardReader();
    
    double num;
    
    while(true){        
        num= kr.readDouble("Please Enter A number between 1 and 15: ");
        if (num>15 || num < 0)
        {
            System.out.println("Please Enter a Valid Number: ");
        }
        else break;
        
    }
    System.out.println(num+ " factorial is equal to " + factorial(num));

    }

    public static double factorial(double n){
        if(n==1)
            return 1;
        else
            return n * factorial(n-1);
    }
}