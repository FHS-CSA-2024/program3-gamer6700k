//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[] args) {
        //declare variables 
        int length = 0; 
        int width = 0;
        int area = 0; 
        int perimter = 0; 
        //create my scanner 
        Scanner numScanner = new Scanner(System.in); 
        System.out.println("Enter the length: ");
        length = numScanner.nextInt();
        System.out.println("Enter the width: ");
        width = numScanner.nextInt();

        //ask for the user input
        //calc
        area = length * width;
        perimter = length + length + width + width;
        
        //print results
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area); 
        System.out.println("The perimter is: " + perimter);
    
    }

}



//Paste console output below:
/*
Enter the length: 
143
Enter the width: 
82
The length is: 143
The width is: 82
The area is: 11726
The perimter is: 450
*/
