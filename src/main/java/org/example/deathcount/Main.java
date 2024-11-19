package org.example.deathcount;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        URL viewUrl = getClass().getResource("/view/count-view.fxml");
        System.out.println("URL: " + viewUrl);
        if(viewUrl == null){
            throw new IOException("FXML not found.");
        }

        Parent root = FXMLLoader.load(viewUrl);

        Scene scene = new Scene(root);
        primaryStage.setTitle("DEATH COUNT LOLOLOL");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
