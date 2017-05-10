package UConverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class MainApp extends Application {

    public static void main (String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main_window.fxml"));

        Scene scene = new Scene(root);
        scene.setFill(Color.LAVENDER);


        primaryStage.setResizable(false);
        primaryStage.setTitle("Unit Converter");
        primaryStage.getIcons().add(new Image("converter.png"));
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
