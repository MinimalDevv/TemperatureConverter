//in class exercise 1 csc 222
// veron kotey 
//9/8/24
import java.util.*;


class Exercise1{


    public static void main(String[] args){
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Fahrenheit temperature: ");
        double fahrenheit = keyboard.nextDouble();

        //process
        double celsius = 5.0/9.0 * (fahrenheit - 32);

        //output
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees centigrade.");

        keyboard.close();

    }
}