package com.Jaidev.Lab2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMainPane extends VBox {

    private Button btnHello, btnHowdy, btnChinese, btnClear, btnExit;
    private Label lblFeedback;
    private TextField textField;
    private HBox hboxTop, hboxBottom;
    private DataManager dataManager; // Declare an instance of DataManager

    public FXMainPane() {
        dataManager = new DataManager(); // Instantiate DataManager in the constructor

        btnHello = new Button("Hello");
        btnHowdy = new Button("Howdy");
        btnChinese = new Button("Chinese");
        btnClear = new Button("Clear");
        btnExit = new Button("Exit");
        lblFeedback = new Label("Feedback:");
        textField = new TextField();

        hboxTop = new HBox(10);
        hboxBottom = new HBox(10);

        hboxTop.setAlignment(Pos.CENTER);
        hboxBottom.setAlignment(Pos.CENTER);

        VBox.setMargin(hboxTop, new Insets(10));
        VBox.setMargin(hboxBottom, new Insets(10));

        hboxBottom.getChildren().addAll(lblFeedback, textField);
        hboxTop.getChildren().addAll(btnHello, btnHowdy, btnChinese, btnClear, btnExit);

        this.getChildren().addAll(hboxTop, hboxBottom);

        // Set the button actions
        btnHello.setOnAction(new ButtonHandler());
        btnHowdy.setOnAction(new ButtonHandler());
        btnChinese.setOnAction(new ButtonHandler());
        btnClear.setOnAction(new ButtonHandler());
        btnExit.setOnAction(new ButtonHandler());
    }

    // Inner class for handling button actions
    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == btnHello) {
                textField.setText(dataManager.getHello());
            } else if (event.getSource() == btnHowdy) {
                textField.setText(dataManager.getHowdy());
            } else if (event.getSource() == btnChinese) {
                textField.setText(dataManager.getChinese());
            } else if (event.getSource() == btnClear) {
                textField.setText("");
            } else if (event.getSource() == btnExit) {
                Platform.exit();
                System.exit(0);
            }
        }
    }
}
