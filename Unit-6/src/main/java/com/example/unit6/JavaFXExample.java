package com.example.unit6;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class JavaFXExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create the label, text field, and buttons
        Label label = new Label("Enter something:");
        TextField textField = new TextField();
        Button showButton = new Button("Show Text");
        Button clearButton = new Button("Clear");

        // Create action for Show Button
        showButton.setOnAction(e -> {
            String text = textField.getText();
            label.setText("You entered: " + text);
        });

        // Create action for Clear Button
        clearButton.setOnAction(e -> {
            textField.clear();
            label.setText("Enter something:");
        });

        // Create an HBox to arrange the components horizontally
        HBox hbox = new HBox(10);  // 10px spacing between elements
        hbox.setPadding(new Insets(20));  // Padding around the HBox
        hbox.getChildren().addAll(label, textField, showButton, clearButton);

        // Create the Scene and add the HBox
        Scene scene = new Scene(hbox, 400, 100);  // Width is increased for horizontal layout

        // Set up the Stage (window)
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}