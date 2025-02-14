package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        Image image=new Image("download.png");
        primaryStage.getIcons().add(image);
        scene.getStylesheets().add(getClass().getResource("../Dictionary.css").toExternalForm());
        primaryStage.setTitle("Dictionary");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
