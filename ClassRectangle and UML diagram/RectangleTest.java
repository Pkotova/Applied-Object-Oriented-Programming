package shape;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
//default constructor:
        Rectangle rectangle1 = new Rectangle();
        rectangle1.displayData();

//general purpose constructor (with all of the fields;
        Rectangle rectangle2 = new Rectangle(5.5,6.3,"Red");
        rectangle2.displayData();

//general purpose constructor (width and height only)
        Rectangle rectangle3 = new Rectangle(3.4,5.8);
        rectangle3.displayData(); //color is default Yellow

//usage of setters
        Scanner input = new Scanner(System.in);

        double height,width;
        String color;

        Rectangle personalRectangle = new Rectangle(); // default instance calling the default constructor
        //setting the width
        System.out.println();
        System.out.println("Here is your rectangle");
        System.out.println("----------------------------------");
        System.out.print("Please the width of you rectangle: ");
        width = input.nextDouble();
        personalRectangle.setWidth(width);

        //setting the height
        System.out.print("Please the height of you rectangle: ");
        height = input.nextDouble();
        personalRectangle.setHeight(height);

        //setting the height
        System.out.print("Please the color of you rectangle: ");
        input.nextLine();
        color = input.nextLine();
        personalRectangle.setColor(color);

       // personalRectangle.displayData()
//usage of getters
        System.out.println("___________________________");
        System.out.println("This is your rectangle! ");
        System.out.println("The width: " + personalRectangle.getWidth());
        System.out.println("The height: " + personalRectangle.getHeight());
        System.out.println("The color: " + personalRectangle.getColor());
        System.out.println(personalRectangle.getArea());
        System.out.println(personalRectangle.getPerimeter());

    }
}
