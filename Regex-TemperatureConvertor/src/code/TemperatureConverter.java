package code;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    Напишете Java Console приложение, което да преобразува от стойности от
    Fahrenheit temperature в Celsius еквивалентни стойност . Чрез регулярни
    изрази да се допуска въвеждане единствено на числа в плаваща запетая
    Преобразуването от Fahrenheit в Celsius става по формулата
    Celsius = 5.0 / 9.0 * ( Fahrenheit - 32 )
*/

import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double temperatureCelsius) {		//first method is for C -> F

        System.out.print("The temperature: " + temperatureCelsius  + "C in Fahrenheit is: "); 	//friendly user interface
        return (9.0 / 5.0 * temperatureCelsius + 32);					//calculation
    }

    static double fahrenheitToCelsius(double temperatureFahrenheit) {	//second method F->C
        System.out.print("The temperature: " + temperatureFahrenheit + "F in Celsius is: ");	//friendly user interface
        return (5.0 / 9.0 * ( temperatureFahrenheit - 32 ));			//calculation
    }

    static boolean checkFormat(String temperature){
        String regex = "^[-+]?[0-9]+[.]?[0-9]*([eE][-+]?[0-9]+)?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(temperature);

        return  (matcher.find() && matcher.group().equals(temperature));

/*
Matches	    123 | -123.35 | -123.35e-2
Non-Matches	abc | 123.32e | 123.32.3
 */
    }

    public static void main(String[] args) {

        String temperature; // declaration of variable for temperature, the user will input the value
        Scanner input = new Scanner(System.in); // using scanner to read the input

// menu for better UI
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
                temperature = input.next();

                if(checkFormat(temperature)){                   // check the format of the inputted temperature
                    System.out.println("Right format");
                }else {
                    System.out.println("Wrong format");
                    break;
                }

                double temp = Double.parseDouble(temperature);
                System.out.println(celsiusToFahrenheit(temp)); 		// printing the returned value (celsiusToFahrenheit returns double)
                break;
            }

            case 2:{
                System.out.print("Input Temperature in Fahrenheit: ");
                temperature = input.next();

                if(checkFormat(temperature)){
                    System.out.println("Right format");
                }else {
                    System.out.println("Wrong format");
                    break;
                }

                double temp = Double.parseDouble(temperature);
                System.out.println(fahrenheitToCelsius(temp)); 	// printing the returned value (fahrenheitToCelsius returns double)
                break;
            }

            default: System.out.println("Error input! ");
        }
    }
}
