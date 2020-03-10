package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javafx.scene.text.Text;


import java.util.Optional;


public class Geometry extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);

        double sceneWidth = 300;
        double sceneHeight = 300;

        double width = scene.getWidth();
        double height = scene.getHeight();

        double centerX = width / 2;
        double centerY = height / 2;
        double radius = height / 3;

        double yAxisStartX = 150;
        double yAxisStartY = 300;
        double yAxisStopX = 150;
        double yAxisStopY = 0;

        double xAxisStartX = 0;
        double xAxisStartY = 150;
        double xAxisStopX = 300;
        double xAxisStopY = 150;

        Circle mainCircle = new Circle(centerX, centerY, radius);
        mainCircle.setStroke(Color.BLUE);
        mainCircle.setFill(null);

        Line yAxis = new Line(yAxisStartX, yAxisStartY, yAxisStopX, yAxisStopY);
        Line xAxis = new Line(xAxisStartX, xAxisStartY, xAxisStopX, xAxisStopY);


        TextInputDialog dialog = new TextInputDialog("x = ");
        dialog.setTitle("Please enter x = ");
        dialog.setHeaderText("I am your jfx app. I am going to draw for you orthogonal axis to x");
        dialog.setContentText("Your x: ");

        Alert alert = new Alert(Alert.AlertType.NONE);

        Optional<String> result = dialog.showAndWait();
        double ortogonalLineX = Double.parseDouble(result.get());

        if (ortogonalLineX < 0 || ortogonalLineX >300){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You have to input a number between 0 and 500");
            alert.show();
            return;
        }

        double leftSection = width / 2 - width/3;
        double rightSection = width / 2 + width/3;

//no intersection points
        if (ortogonalLineX < leftSection || ortogonalLineX >rightSection){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("THERE ARE NO INTERSECTION POINTS!");
            alert.show();
            return;
        }
        double ortogonalLineXStartX = ortogonalLineX;
        double ortogonalLineXStartY = 300;
        double ortogonalLineXStopX = ortogonalLineX;
        double ortogonalLineXStopY = 0;
        Line ortogonalXaxis = new Line(ortogonalLineXStartX, ortogonalLineXStartY, ortogonalLineXStopX, ortogonalLineXStopY);

        ortogonalXaxis.setStroke(Color.RED);
// 1) intersection point
        if (ortogonalLineX == leftSection || ortogonalLineX == rightSection ){
                Circle smallCircle = new Circle(ortogonalLineX,150,5);

                smallCircle.setFill(Color.GREEN);
                group.getChildren().add(smallCircle);
            Text coordinates0 = new Text(ortogonalLineX - 50,170,String.format("[%.2f, %.2f]",ortogonalLineX + 10, 150.0));
            group.getChildren().add(coordinates0);

        }
        else{
            double h = Math.sqrt(Math.pow(radius,2) - Math.pow(Math.abs(ortogonalLineX - 150),2));

            Circle upCircle = new Circle(ortogonalLineX,(150 - h),5);
            Text coordinates1 = new Text(ortogonalLineX+10,150 - h,String.format("[%.2f, %.2f]",ortogonalLineX + 10,h - 150));

            upCircle.setFill(Color.GREEN);
            Circle downCircle = new Circle(ortogonalLineX,(150 + h),5);
            Text coordinates2 = new Text(ortogonalLineX + 10,150 + h,String.format("[%.2f, %.2f]",ortogonalLineX + 10,h + 150));

            downCircle.setFill(Color.GREEN);

            group.getChildren().add(coordinates1);
            group.getChildren().add(coordinates2);
            group.getChildren().add(upCircle);
            group.getChildren().add(downCircle);
        }

// 2) intersection points

        group.getChildren().add(xAxis);
        group.getChildren().add(yAxis);
        group.getChildren().add(mainCircle);
        group.getChildren().add(ortogonalXaxis);

        primaryStage.setTitle("Drawing orthogonal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
