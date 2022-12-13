package com.example.pruebacustom2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.pruebacustom2.CombinedControl;

import java.io.IOException;

public class HelloApplication extends Application {

/*
    private CombinedControl control;
    private Button button;


    @Override
    public void init() {
        control = new CombinedControl();
        button = new Button("Focus");
    }

    @Override
    public void start(final Stage stage) {
        VBox pane = new VBox(24, control, button);
        pane.setPadding(new Insets(20));

        Scene scene = new Scene(pane);

        stage.setTitle("Combined Control");
        stage.setScene(scene);
        stage.show();

        button.requestFocus();
    }

    @Override
    public void stop() {
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }





    public static void main(String[] args) {
        launch();
    }
}


