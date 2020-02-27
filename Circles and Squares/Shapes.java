package DrawShapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shapes extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group(); // Create a layout Panel
        Scene scene = new Scene(group, 420, 420);// Create the Scene
//for circle
        int centerX = 210;
        int centerY = 210;
        double diameter = 210;
//for square
        double side = 410;
        double xy = 5;

        for (int i = 0; i <= 12; i++) {
            Circle circle = new Circle(centerX, centerY, diameter);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            group.getChildren().add(circle);
            diameter -= 20;
        }
        for (int i = 0; i <= 12; i++) {
            Rectangle rectangle = new Rectangle(xy, xy, side, side);
            rectangle.setFill(Color.TRANSPARENT);
            rectangle.setStroke(Color.BLACK);
            group.getChildren().add(rectangle);
            side -= 20;
            xy += 10;
        }

        Line verticalDiameter = new Line(210, 0, 210, 420);
        verticalDiameter.setStroke(Color.RED);
        group.getChildren().add(verticalDiameter);

        Line horizontalDiameter = new Line(0, 210, 420, 210);
        horizontalDiameter.setStroke(Color.RED);
        group.getChildren().add(horizontalDiameter);

        // Set the title of the Stage(the application window)
        primaryStage.setTitle("Drawing shapes");
        // Add the Scene to the Stage
        primaryStage.setScene(scene);
        // Show the Stage (the application window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}