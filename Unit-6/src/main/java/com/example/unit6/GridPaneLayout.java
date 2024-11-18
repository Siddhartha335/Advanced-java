package com.example.unit6;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Components
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        //Adding root or layout
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
    }

    public static void main(String[] args) {
        launch();
    }
}
