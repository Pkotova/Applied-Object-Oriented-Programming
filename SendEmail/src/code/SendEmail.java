package code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SendEmail extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sendEmailFXML.fxml"));
        primaryStage.setTitle("Email composer");
        primaryStage.setScene(new Scene(root, 1000, 700));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
