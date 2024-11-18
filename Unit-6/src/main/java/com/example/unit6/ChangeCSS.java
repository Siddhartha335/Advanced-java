package com.example.unit6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChangeCSS extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Blue Button");
        button.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        //Components
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");

        //Adding root or layout
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.add(button,0,0);
        root.add(btn2,0,1);
        root.add(btn3,0,2);
        root.add(btn4,1,0);
        root.add(btn5,1,1);
        root.add(btn6,1,2);
        root.setGridLinesVisible(false);
        //Creating a scene
        Scene scene = new Scene(root,300,300);
        stage.setTitle("GridPane Window");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
