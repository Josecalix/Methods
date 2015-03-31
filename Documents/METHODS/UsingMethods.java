 
 import java.util.Scanner;

 import static java.lang.Math.*; 

 public class UsingMethods {

	public static void main(String[] args) {
		
		double valueOfX, valueOfY, valueOfZ, hFunctionOfX,fFunctionOfXY, gFunctionOfXYZ;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter values for (x), (y), and (z). I will perform the following mathematical operations: "
				+ "\nh(x) = x^10 \nf(x,y) = x + y \ng(x,y,z) = sqrt(x) + absolute(y) + z^y");
		
		System.out.println("Enter a value for (x).");	
		valueOfX = keyboard.nextDouble();
		System.out.println("Enter a value for (y).");	
		valueOfY = keyboard.nextDouble();
		System.out.println("Enter a value for (z).");
		valueOfZ = keyboard.nextDouble();

		hFunctionOfX = XPowerOf(valueOfX);
		fFunctionOfXY = additionOf(valueOfX, valueOfY);
		gFunctionOfXYZ = operations(valueOfX, valueOfY, valueOfZ) ;
		System.out.printf( "h("+valueOfX+")= %2.2f", hFunctionOfX);
		System.out.printf("\nf("+valueOfX+","+ valueOfY+")= %2.2f",fFunctionOfXY);
		System.out.printf("\ng("+valueOfX+","+ valueOfY+","+ valueOfZ+")= %2.2f",gFunctionOfXYZ);
	}
		// h(x)= x^10
	public static double XPowerOf(double valueOfX){
		
		return pow(valueOfX,10);	
	}
		// f(x,y) = x + y
	public static double additionOf(double valueOfX, double valueOfY){
		
		return valueOfX + valueOfY;	
	}
		// squrt(x)
	public static double squareRootOf(double valueOfX){
		
		return sqrt(valueOfX);	
	}
		//absolute(y)
	public static double absoluteValueOf(double valueOfY){
	
		return abs(valueOfY);
	}	
		// z^y
	public static double ZPowerOf(double valueOfZ, double valueOfY){
		
		return  pow(valueOfZ, valueOfY);
	}
	
	//f(x,y,z) = sqrt(x) + absolute(y) + z^y
	public static double operations(double valueOfX, double valueOfY, double valueOfZ){
		
		return sqrt(valueOfX) + abs(valueOfY) + pow(valueOfZ, valueOfY);
	}
			
}

