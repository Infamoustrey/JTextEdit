package com.treyfoster.jtextedit;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JTextEdit extends Application {

    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("JTextEdit");

        // Left File Menu
        VBox projectExplorer = new VBox();
        Text sometext = new Text("Some Text");
        Text somemoretext = new Text("Some More Text");
        projectExplorer.getChildren().add(sometext);
        projectExplorer.getChildren().add(somemoretext);

        projectExplorer.setPadding(new Insets(7,7,7,7));

        // Main Layout
        BorderPane layout = new BorderPane();

        // Create Editor
        TextArea editor = new TextArea();

        layout.setCenter(editor);
        layout.setLeft(projectExplorer);

        scene = new Scene(layout);

        window.setScene(scene);

        window.show();

    }
}
