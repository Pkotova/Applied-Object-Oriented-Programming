package shape;

public class Rectangle {
//fields, encapsulation
    private double width;
    private double height;
    private String color;
//default constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "Yellow";
    }
//general purpose constructor with all of the fields
    public Rectangle(double newWidth, double newHeight, String newColor) {
        this.width = newWidth;
        this.height = newHeight;
        this.color = newColor;
    }
//general purpose constructor with width and height only
    public Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
        this.color = "Yellow";
    }
//copy constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.color = rectangle.color;
    }

    public double getWidth() {
        return width;
    }
//setters & getters
    public void setWidth(double newWidth) {
        if (newWidth > 0) {                 //validation
            this.width = newWidth;
        } else {
            this.width = 1.0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        if (newHeight > 0) {            //validation
            this.height = newHeight;
        } else {
            this.height = 1.0;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
    if (newColor != null) {           //validation
            this.color = newColor;
        } else {
            this.color = "Yellow";
        }
    }
//method for returning the current area
    public double getArea() {
        System.out.print("The are of the rectangle is: ");
        return (this.width * this.height);          //calculating the area
    }
//method for returning the current perimeter
    public double getPerimeter() {
        System.out.print("The perimeter of the rectangle is: ");
        return (2 * (this.width + this.height));   //calculating the perimeter;
    }

    public void displayData()                      //displaying all the data
    {
        System.out.println("------NEW RECTANGLE-----");
        System.out.println("------------------------");
        System.out.println("The width: " + width);
        System.out.println("The height: " + height);
        System.out.println("The color: " + color);
        System.out.println("The area: " + getArea());
        System.out.println("The perimeter: " + getPerimeter());
    }
}
