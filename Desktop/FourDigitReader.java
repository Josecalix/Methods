
// Chapter 2, exercise 4. 
//Program that reads a four-digit integer and then displays one digit per line. 
// Author: Jose Calix

import java.util.Scanner;

public class FourDigitReader {

public static void main(String[] args) {
	
int integerEntered, remainder1, remainder2, remainder3, remainder4;

System.out.println("Enter a four-digit integer");

Scanner keyboard = new Scanner(System.in);
integerEntered = keyboard.nextInt();

remainder1 = integerEntered/1000;
integerEntered = integerEntered % 1000;
remainder2 = integerEntered/100;
integerEntered = integerEntered % 100;
remainder3 = integerEntered/10;
integerEntered = integerEntered % 10;
remainder4 = integerEntered/1;
integerEntered = integerEntered % 1;

System.out.println("The integer you entered is:");
System.out.println(remainder1);
System.out.println(remainder2);
System.out.println(remainder3);
System.out.println(remainder4);

}
}