package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FullArcGrid extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group(); // Create a layout Panel
        Scene scene = new Scene(group, 500, 500);// Create the Scene
//down right
        double startX1 = 0;
        double startY1 = 500;
        double stopX1 = 500;
        double stopY1 = 500;

        for (int i = 0; i < 18; i++) {
            Line line = new Line(startX1, startY1, stopX1, stopY1);
            line.setStroke(Color.ORANGERED);
            group.getChildren().add(line);
            startX1 += 30;
            stopY1 -= 30;
        }
// up left
        double startX2 = 0;
        double startY2 = 0;
        double stopX2 = 0;
        double stopY2 = 500;

        for (int i = 0; i < 18; i++) {
            Line line = new Line(startX2, startY2, stopX2, stopY2);
            line.setStroke(Color.ORANGERED);
            group.getChildren().add(line);
            startX2 += 30;
            stopY2 -= 30;
        }
// up right
        double startX3 = 0;
        double startY3 = 0;
        double stopX3 = 500;
        double stopY3 = 0;

        for (int i = 0; i < 18; i++) {
            Line line = new Line(startX3, startY3, stopX3, stopY3);
            line.setStroke(Color.ORANGERED);
            group.getChildren().add(line);
            startX3 += 30;
            stopY3 += 30;
        }
// down left
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
