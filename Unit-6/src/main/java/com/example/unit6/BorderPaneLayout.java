package com.example.unit6;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BorderPaneLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Components
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        //Adding root or layout
        BorderPane root = new BorderPane();
        root.setLeft(btn1);
        root.setRight(btn2);
        BorderPane.setAlignment(btn3,Pos.BOTTOM_LEFT);
        root.setBottom(btn3);
        BorderPane.setAlignment(btn4,Pos.BOTTOM_RIGHT);
        root.setBottom(btn4);
        root.setCenter(btn5);
        //Creating a scene
        Scene scene = new Scene(root,300,300);
        stage.setTitle("BorderPane Window");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}

