package code;
/*
	a) compute and output the celsius equivalent of an input Fahrenheit temperature, using the calculation
			C = 5.0 / 9.0 * ( F - 32 );
	b) compute and output Fahrenheit the equivalent of an input celsius temperature, using the calculation
			F = 9.0 / 5.0 * C + 32;
	c) Use the methods from parts (a) and (b) to write an application that 
	enables the user either to enter a Fahrenheit temperature and display th
	e Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.
*/
import java.util.Scanner;

public class TemperatureConvertor { 			// class convertor

    static double celsiusToFahrenheit(double temperatureCelsius) {		//first method is for C -> F
		
        System.out.print("The temperature: " + temperatureCelsius  + "C in Fahrenheit is: "); 	//friendly user interface
        return (9.0 / 5.0 * temperatureCelsius + 32);					//calculation
    }

    static double fahrenheitToCelsius(double temperatureFahrenheit) {	//second method F->C
				
        System.out.print("The temperature: " + temperatureFahrenheit + "F in Celsius is: ");	//friendly user interface
        return (5.0 / 9.0 * ( temperatureFahrenheit - 32 ));			//calculation
    }

    public static void main(String[] args) {

        double temperature;				// declarate variable for temperature, the user will input the value
        Scanner input = new Scanner(System.in); // using scanner to read the input
		
// menu for easier usage
        System.out.println(" You have two options ");
        System.out.println("------------------------");
        System.out.println("1. Celsius To Fahrenheit ");
        System.out.println("2. Fahrenheit To Celsius ");
        System.out.println("------------------------");
        System.out.print("> ");
		
// read the input for user's choice 
        int choice = input.nextInt();
// using switch
        switch(choice) {

            case 1: {
                System.out.print("Input Temperature in Celsius: ");
                temperature = input.nextDouble();							//user's input for temperature
                System.out.println(celsiusToFahrenheit(temperature)); 		// printing the returned value (celsiusToFahrenheit returns double)
                break;
            }
			
            case 2:{
                System.out.print("Input Temperature in Fahrenheit: ");
                temperature = input.nextDouble();							//user's input for temperature
                System.out.println(fahrenheitToCelsius(temperature));		// printing the returned value (fahrenheitToCelsius returns double)
                break;
            }
			
            default: System.out.println("Error input! ");					// default case for wrong input on line 41
        }
    }
}
