package com.Jaidev.Lab2;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {
	   
    /**
     * The main method for the GUI example program JavaFX version
     * @param args not used
     * @throws IOException
     */
    public static void main(String[] args) {
        launch(args);   
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiate the FXMainPane
        FXMainPane root = new FXMainPane();
        
        //  scene to hold root
        Scene scene = new Scene(root, 400, 200); // width and height 
        stage.setScene(scene);

        // Set stage title
        stage.setTitle("Hello World GUI");

        // Display the stage
        stage.show();
    }
}
