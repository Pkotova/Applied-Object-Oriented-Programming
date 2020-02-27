package code;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class CurvedGrid extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group(); // Create a layout Panel
        Scene scene = new Scene(group, 500, 500);// Create the Scene
        double startX4 = 0;
        double startY4 = 500;
        double stopX4 = 0;
        double stopY4 = 0;

        for (int i = 0; i < 18; i++) {
            Line line = new Line(startX4, startY4, stopX4, stopY4);
            line.setStroke(Color.ORANGERED);
            group.getChildren().add(line);
            startX4 += 30;
            stopY4 += 30;
        }

        // Set the title of the Stage(the application window)
        primaryStage.setTitle("Drawing arched grid");
        // Add the Scene to the Stage
        primaryStage.setScene(scene);
        // Show the Stage (the application window)
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
