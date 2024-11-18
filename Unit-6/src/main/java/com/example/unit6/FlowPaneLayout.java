package com.example.unit6;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Components
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        //Adding root or layout
        FlowPane root = new FlowPane(Orientation.VERTICAL,5,5);
        root.setAlignment(Pos.TOP_RIGHT);
        root.getChildren().addAll(btn1,btn2,btn3,btn4);
        root.getChildren().add(2,btn5);
        //Creating a scene
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
